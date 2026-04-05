import javax.swing.*;
import java.awt.event.*;

public class Gradeapp {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Grade Calculator 😎");
        frame.setSize(400, 320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Enter Marks:");
        label.setBounds(30, 30, 120, 30);
        frame.add(label);

        JTextField marksField = new JTextField();
        marksField.setBounds(160, 30, 150, 30);
        frame.add(marksField);

        JButton btn = new JButton("Check Result");
        btn.setBounds(120, 80, 150, 30);
        frame.add(btn);

        JLabel result = new JLabel("");
        result.setBounds(30, 130, 350, 30);
        frame.add(result);

        JLabel foodResult = new JLabel("");
        foodResult.setBounds(30, 170, 350, 30);
        frame.add(foodResult);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int marks = Integer.parseInt(marksField.getText());

                // 🎯 Grade Logic
                if (marks >= 90) {
                    result.setText("🔥 Topper! Party pakki!");
                } 
                else if (marks >= 75) {
                    result.setText("😎 First class! Treat deni padegi!");
                } 
                else if (marks >= 60) {
                    result.setText("👍 Theek hai, choti party chalegi!");
                } 
                else if (marks >= 40) {
                    result.setText("😅 Bas pass! Kuch toh khila!");
                } 
                else {
                    result.setText("💀 Fail! Koi party nahi!");
                    foodResult.setText("");
                    return;
                }

                // 🍽️ Food Logic (only if pass)
                String choice = JOptionPane.showInputDialog(frame, "Veg ya Non-Veg?");

                if (choice != null) {
                    switch (choice.toLowerCase()) {

                        case "veg":
                            String vegChoice = JOptionPane.showInputDialog(
                                    frame,
                                    "Veg options:\nPaneer / Pizza / Dosa / Burger");

                            if (vegChoice != null) {
                                switch (vegChoice.toLowerCase()) {
                                    case "paneer":
                                        foodResult.setText("😋 Paneer + Naan!");
                                        break;
                                    case "pizza":
                                        foodResult.setText("🍕 Pizza treat!");
                                        break;
                                    case "dosa":
                                        foodResult.setText("🥞 Dosa party!");
                                        break;
                                    case "burger":
                                        foodResult.setText("🍔 Burger + Fries!");
                                        break;
                                    default:
                                        foodResult.setText("😑 Yeh menu me nahi hai!");
                                }
                            }
                            break;

                        case "non-veg":
                            foodResult.setText("🍗 Chicken Biryani fix!");
                            break;

                        default:
                            foodResult.setText("😑 Sahi option daal!");
                    }
                }
            }
        });

        frame.setVisible(true);
    }
}