import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private String operand1 = "";
    private String operand2 = "";
    private String operator = "";

    public Calculator() {
        setTitle("Calculator");
        setSize(320, 420);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 28));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 8, 8));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 22));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.matches("[0-9]")) {
            if (operator.isEmpty()) {
                operand1 += cmd;
                display.setText(operand1);
            } else {
                operand2 += cmd;
                display.setText(operand1 + operator + operand2);
            }
        } else if (cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) {
            if (!operand1.isEmpty()) {
                operator = cmd;
                display.setText(operand1 + operator);
            }
        } else if (cmd.equals("=")) {
            if (!operand1.isEmpty() && !operand2.isEmpty() && !operator.isEmpty()) {
                double n1 = Double.parseDouble(operand1);
                double n2 = Double.parseDouble(operand2);
                double result = 0;

                switch (operator) {
                    case "+":
                        result = n1 + n2;
                        break;
                    case "-":
                        result = n1 - n2;
                        break;
                    case "*":
                        result = n1 * n2;
                        break;
                    case "/":
                        if (n2 == 0) {
                            display.setText("Cannot divide by 0");
                            reset();
                            return;
                        }
                        result = n1 / n2;
                        break;
                }

                display.setText(String.valueOf(result));
                operand1 = String.valueOf(result);
                operand2 = "";
                operator = "";
            }
        } else if (cmd.equals("C")) {
            reset();
            display.setText("");
        }
    }

    private void reset() {
        operand1 = "";
        operand2 = "";
        operator = "";
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }
}