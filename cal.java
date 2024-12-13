import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class calsi{
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame1 = new JFrame("Calculator");
        frame1.setSize(200, 100);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(new FlowLayout());

        // Create a new button
        JButton button = new JButton("Open Calculator");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a new JFrame (window)
                JFrame frame2 = new JFrame("Calculator");
                frame2.setSize(300, 200);
                frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame2.setLayout(new FlowLayout());

                // Create text fields for input
                JTextField textField1 = new JTextField(10);
                JTextField textField2 = new JTextField(10);

                // Create a button to calculate the sum
                JButton calculateButton = new JButton("Calculate Sum");
                calculateButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            // Get the input values
                            int num1 = Integer.parseInt(textField1.getText());
                            int num2 = Integer.parseInt(textField2.getText());

                            // Calculate the sum
                            int sum = num1 + num2;

                            // Display the result
                            JOptionPane.showMessageDialog(frame2, "The sum is: " + sum);
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(frame2, "Invalid input. Please enter numbers only.");
                        }
                    }
                });

                // Add the components to the window
                frame2.add(new JLabel("Number 1:"));
                frame2.add(textField1);
                frame2.add(new JLabel("Number 2:"));
                frame2.add(textField2);
                frame2.add(calculateButton);

                // Make the window visible
                frame2.setVisible(true);
            }
        });

        // Add the button to the window
        frame1.add(button);

        // Make the window visible
        frame1.setVisible(true);
    }
}