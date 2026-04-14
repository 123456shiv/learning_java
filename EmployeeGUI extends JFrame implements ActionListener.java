import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeeGUI extends JFrame implements ActionListener {

    JTextField tfId, tfName, tfAge, tfDept, tfSalary, tfAttendance;
    JComboBox<String> cbPerformance;
    JTextArea output;
    JButton btnCalculate, btnClear;

    // Constructor
    EmployeeGUI() {

        setTitle("Employee Management System");
        setSize(500, 550);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ===== Input Fields =====
        add(new JLabel("Employee ID:"));
        tfId = new JTextField(10);
        add(tfId);

        add(new JLabel("Name:"));
        tfName = new JTextField(10);
        add(tfName);

        add(new JLabel("Age:"));
        tfAge = new JTextField(10);
        add(tfAge);

        add(new JLabel("Department:"));
        tfDept = new JTextField(10);
        add(tfDept);

        add(new JLabel("Base Salary:"));
        tfSalary = new JTextField(10);
        add(tfSalary);

        add(new JLabel("Performance:"));
        String[] perf = {"Good", "Average", "Bad"};
        cbPerformance = new JComboBox<>(perf);
        add(cbPerformance);

        add(new JLabel("Attendance (%):"));
        tfAttendance = new JTextField(10);
        add(tfAttendance);

        // ===== Buttons =====
        btnCalculate = new JButton("Calculate Salary");
        btnClear = new JButton("Clear");

        add(btnCalculate);
        add(btnClear);

        btnCalculate.addActionListener(this);
        btnClear.addActionListener(this);

        // ===== Output Area =====
        output = new JTextArea(12, 35);
        output.setEditable(false);
        add(new JScrollPane(output));

        setVisible(true);
    }

    // Button Actions
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnClear) {
            // Clear all fields
            tfId.setText("");
            tfName.setText("");
            tfAge.setText("");
            tfDept.setText("");
            tfSalary.setText("");
            tfAttendance.setText("");
            output.setText("");
            return;
        }

        try {
            int id = Integer.parseInt(tfId.getText());
            String name = tfName.getText();
            int age = Integer.parseInt(tfAge.getText());
            String dept = tfDept.getText();
            double salary = Double.parseDouble(tfSalary.getText());
            String performance = (String) cbPerformance.getSelectedItem();
            int attendance = Integer.parseInt(tfAttendance.getText());

            double finalSalary = salary;

            // ===== Performance Logic =====
            if (performance.equals("Good")) {
                finalSalary += salary * 0.20;
            } else if (performance.equals("Average")) {
                finalSalary += salary * 0.10;
            } else {
                finalSalary -= salary * 0.10;
            }

            // ===== Attendance Logic =====
            if (attendance > 90) {
                finalSalary += 1000;
            } else if (attendance < 60) {
                finalSalary -= 500;
            }

            // ===== Output =====
            output.setText(
                "===== Employee Details =====\n" +
                "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Department: " + dept + "\n" +
                "Performance: " + performance + "\n" +
                "Attendance: " + attendance + "%\n" +
                "------------------------------\n" +
                "Final Salary: " + finalSalary
            );

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid data!");
        }
    }

    public static void main(String[] args) {
        new EmployeeGUI();
    }
}