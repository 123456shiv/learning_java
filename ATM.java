package atm;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class ATM extends JFrame implements ActionListener {

    Connection con;
    JTextField accField, amtField;
    JTextArea output;
    JButton depositBtn, withdrawBtn, balanceBtn;

    ATM() {
        setTitle("ATM Machine");
        setSize(400, 400);
        setLayout(new FlowLayout());

        add(new JLabel("Account No:"));
        accField = new JTextField(15);
        add(accField);

        add(new JLabel("Amount:"));
        amtField = new JTextField(15);
        add(amtField);

        depositBtn = new JButton("Deposit");
        withdrawBtn = new JButton("Withdraw");
        balanceBtn = new JButton("Check Balance");

        add(depositBtn);
        add(withdrawBtn);
        add(balanceBtn);

        output = new JTextArea(10, 30);
        add(new JScrollPane(output));

        depositBtn.addActionListener(this);
        withdrawBtn.addActionListener(this);
        balanceBtn.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        // 🔌 DATABASE CONNECT YAHAN
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/atmdb",
                "root",
                "your_password"
            );
            output.setText("Connected to DB\n");
        } catch (Exception e) {
            output.setText("DB Error: " + e);
        }
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int acc = Integer.parseInt(accField.getText());
            double amt = Double.parseDouble(amtField.getText());

            if (e.getSource() == balanceBtn) {
                PreparedStatement ps = con.prepareStatement(
                    "SELECT balance FROM users WHERE id=?"
                );
                ps.setInt(1, acc);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    output.setText("Balance: " + rs.getDouble("balance"));
                } else {
                    output.setText("Account not found");
                }
            }

            if (e.getSource() == depositBtn) {
                PreparedStatement ps = con.prepareStatement(
                    "UPDATE users SET balance = balance + ? WHERE id=?"
                );
                ps.setDouble(1, amt);
                ps.setInt(2, acc);
                ps.executeUpdate();

                output.setText("Deposit Successful");
            }

            if (e.getSource() == withdrawBtn) {
                PreparedStatement ps1 = con.prepareStatement(
                    "SELECT balance FROM users WHERE id=?"
                );
                ps1.setInt(1, acc);
                ResultSet rs = ps1.executeQuery();

                if (rs.next()) {
                    double bal = rs.getDouble("balance");

                    if (amt <= bal) {
                        PreparedStatement ps2 = con.prepareStatement(
                            "UPDATE users SET balance = balance - ? WHERE id=?"
                        );
                        ps2.setDouble(1, amt);
                        ps2.setInt(2, acc);
                        ps2.executeUpdate();

                        output.setText("Withdraw Successful");
                    } else {
                        output.setText("Insufficient Balance");
                    }
                } else {
                    output.setText("Account not found");
                }
            }

        } catch (Exception ex) {
            output.setText("Error: " + ex);
        }
    }

    public static void main(String[] args) {
        new ATM();
    }
}