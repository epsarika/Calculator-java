import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class calculator implements ActionListener {

    JFrame jf;
    JLabel display, secondaryLabel;
    JButton allClearButton, percentButton, clearButton, divisionButton, sevenButton, eightButton, nineButton, multiplicationButton,
            fourButton, fiveButton, sixButton, minusButton, oneButton, twoButton, threeButton, plusButton, doubleZeroButton, zeroButton,
            pointButton, equalButton;

    StringBuilder currentExpression = new StringBuilder();

    calculator(){
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(350, 550);
        jf.getContentPane().setBackground(Color.black);
        jf.setLocation(500, 100);

        Font buttonFont1 = new Font("Arial", Font.BOLD, 14);
        Font buttonFont2 = new Font("Arial", Font.BOLD, 12);
        Font displayFont = new Font("Arial", Font.BOLD, 24);

        secondaryLabel = new JLabel();
        secondaryLabel.setBounds(35, 20, 270, 20); // Adjusted position and width
        secondaryLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        secondaryLabel.setForeground(Color.gray); // Adjust color if needed
        jf.add(secondaryLabel);

        display = new JLabel();
        display.setBounds(35, 50, 270, 50);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setForeground(Color.white);
        display.setFont(displayFont);
        jf.add(display);

        allClearButton = new JButton("AC");
        allClearButton.setBounds(35, 150, 50, 50);
        allClearButton.setBackground(Color.darkGray);
        allClearButton.setForeground(Color.WHITE);
        allClearButton.setBorderPainted(false);
        allClearButton.setFocusPainted(false);
        allClearButton.setFont(buttonFont2);
        allClearButton.addActionListener(this);
        jf.add(allClearButton);

        percentButton = new JButton("%");
        percentButton.setBounds(105, 150, 50, 50);
        percentButton.setBackground(Color.darkGray);
        percentButton.setForeground(Color.WHITE);
        percentButton.setBorderPainted(false);
        percentButton.setFocusPainted(false);
        percentButton.setFont(buttonFont1);
        percentButton.addActionListener(this);
        jf.add(percentButton);

        clearButton = new JButton("←");
        clearButton.setBounds(175, 150, 50, 50);
        clearButton.setBackground(Color.darkGray);
        clearButton.setForeground(Color.WHITE);
        clearButton.setBorderPainted(false);
        clearButton.setFocusPainted(false);
        clearButton.setFont(buttonFont1);
        clearButton.addActionListener(this);
        jf.add(clearButton);

        divisionButton = new JButton("÷");
        divisionButton.setBounds(245, 150, 50, 50);
        divisionButton.setBackground(Color.darkGray);
        divisionButton.setForeground(Color.WHITE);
        divisionButton.setBorderPainted(false);
        divisionButton.setFocusPainted(false);
        divisionButton.setFont(buttonFont1);
        divisionButton.addActionListener(this);
        jf.add(divisionButton);

        sevenButton = new JButton("7");
        sevenButton.setBounds(35, 220, 50, 50);
        sevenButton.setBackground(Color.gray);
        sevenButton.setForeground(Color.WHITE);
        sevenButton.setBorderPainted(false);
        sevenButton.setFocusPainted(false);
        sevenButton.setFont(buttonFont1);
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(105, 220, 50, 50);
        eightButton.setBackground(Color.gray);
        eightButton.setForeground(Color.WHITE);
        eightButton.setBorderPainted(false);
        eightButton.setFocusPainted(false);
        eightButton.setFont(buttonFont1);
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(175, 220, 50, 50);
        nineButton.setBackground(Color.gray);
        nineButton.setForeground(Color.WHITE);
        nineButton.setBorderPainted(false);
        nineButton.setFocusPainted(false);
        nineButton.setFont(buttonFont1);
        nineButton.addActionListener(this);
        jf.add(nineButton);

        multiplicationButton = new JButton("x");
        multiplicationButton.setBounds(245, 220, 50, 50);
        multiplicationButton.setBackground(Color.darkGray);
        multiplicationButton.setForeground(Color.WHITE);
        multiplicationButton.setBorderPainted(false);
        multiplicationButton.setFocusPainted(false);
        multiplicationButton.setFont(buttonFont1);
        multiplicationButton.addActionListener(this);
        jf.add(multiplicationButton);

        fourButton = new JButton("4");
        fourButton.setBounds(35, 290, 50, 50);
        fourButton.setBackground(Color.gray);
        fourButton.setForeground(Color.WHITE);
        fourButton.setBorderPainted(false);
        fourButton.setFocusPainted(false);
        fourButton.setFont(buttonFont1);
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(105, 290, 50, 50);
        fiveButton.setBackground(Color.gray);
        fiveButton.setForeground(Color.WHITE);
        fiveButton.setBorderPainted(false);
        fiveButton.setFocusPainted(false);
        fiveButton.setFont(buttonFont1);
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(175, 290, 50, 50);
        sixButton.setBackground(Color.gray);
        sixButton.setForeground(Color.WHITE);
        sixButton.setBorderPainted(false);
        sixButton.setFocusPainted(false);
        sixButton.setFont(buttonFont1);
        sixButton.addActionListener(this);
        jf.add(sixButton);

        minusButton = new JButton("-");
        minusButton.setBounds(245, 290, 50, 50);
        minusButton.setBackground(Color.darkGray);
        minusButton.setForeground(Color.WHITE);
        minusButton.setBorderPainted(false);
        minusButton.setFocusPainted(false);
        minusButton.setFont(buttonFont1);
        minusButton.addActionListener(this);
        jf.add(minusButton);

        oneButton = new JButton("1");
        oneButton.setBounds(35, 360, 50, 50);
        oneButton.setBackground(Color.gray);
        oneButton.setForeground(Color.WHITE);
        oneButton.setBorderPainted(false);
        oneButton.setFocusPainted(false);
        oneButton.setFont(buttonFont1);
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(105, 360, 50, 50);
        twoButton.setBackground(Color.gray);
        twoButton.setForeground(Color.WHITE);
        twoButton.setBorderPainted(false);
        twoButton.setFocusPainted(false);
        twoButton.setFont(buttonFont1);
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(175, 360, 50, 50);
        threeButton.setBackground(Color.gray);
        threeButton.setForeground(Color.WHITE);
        threeButton.setBorderPainted(false);
        threeButton.setFocusPainted(false);
        threeButton.setFont(buttonFont1);
        threeButton.addActionListener(this);
        jf.add(threeButton);

        plusButton = new JButton("+");
        plusButton.setBounds(245, 360, 50, 50);
        plusButton.setBackground(Color.darkGray);
        plusButton.setForeground(Color.WHITE);
        plusButton.setBorderPainted(false);
        plusButton.setFocusPainted(false);
        plusButton.setFont(buttonFont1);
        plusButton.addActionListener(this);
        jf.add(plusButton);

        doubleZeroButton = new JButton("00");
        doubleZeroButton.setBounds(35, 430, 50, 50);
        doubleZeroButton.setBackground(Color.gray);
        doubleZeroButton.setForeground(Color.WHITE);
        doubleZeroButton.setBorderPainted(false);
        doubleZeroButton.setFocusPainted(false);
        doubleZeroButton.setFont(buttonFont1);
        doubleZeroButton.addActionListener(this);
        jf.add(doubleZeroButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(105, 430, 50, 50);
        zeroButton.setBackground(Color.gray);
        zeroButton.setForeground(Color.WHITE);
        zeroButton.setBorderPainted(false);
        zeroButton.setFocusPainted(false);
        zeroButton.setFont(buttonFont1);
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        pointButton = new JButton(".");
        pointButton.setBounds(175, 430, 50, 50);
        pointButton.setBackground(Color.gray);
        pointButton.setForeground(Color.WHITE);
        pointButton.setBorderPainted(false);
        pointButton.setFocusPainted(false);
        pointButton.setFont(buttonFont1);
        pointButton.addActionListener(this);
        jf.add(pointButton);

        equalButton = new JButton("=");
        equalButton.setBounds(245, 430, 50, 50);
        equalButton.setBorderPainted(false);
        equalButton.setFocusPainted(false);
        equalButton.setFont(buttonFont1);
        equalButton.addActionListener(this);
        jf.add(equalButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]){
        new calculator();
    }

    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        String currentText = display.getText();

        if (source == allClearButton) {
            secondaryLabel.setText("");
            display.setText("");
            currentExpression.setLength(0);
        } else if (source == percentButton) {
            display.setText(currentText + "%");
        } else if (source == clearButton) {
            secondaryLabel.setText("");
            // Remove last character
            if (currentText.length() > 0) {
                display.setText(currentText.substring(0, currentText.length() - 1));
            }
        } else if (source == divisionButton) {
            display.setText(currentText + "/");
        } else if (source == multiplicationButton) {
            display.setText(currentText + "*");
        } else if (source == minusButton) {
            display.setText(currentText + "-");
        } else if (source == plusButton) {
            display.setText(currentText + "+");
        } else if (source == equalButton) {
            currentExpression.append(currentText);
            secondaryLabel.setText(currentText);  // Append the whole expression at once
            String result = evaluate(currentExpression.toString());
            display.setText(result);
            currentExpression.setLength(0);
        } else {
            JButton clickedButton = (JButton) source;
            display.setText(currentText + clickedButton.getText());
        }
    }

    private String evaluate(String expression) {
        Stack<Float> numbers = new Stack<>();
        Stack<Character> operations = new Stack<>();
        int i = 0;
        while (i < expression.length()) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                StringBuilder sb = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    sb.append(expression.charAt(i));
                    i++;
                }
                numbers.push(Float.parseFloat(sb.toString()));
                i--;
            } else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
                while (!operations.isEmpty() && hasPrecedence(c, operations.peek())) {
                    numbers.push(applyOperation(operations.pop(), numbers.pop(), numbers.pop()));
                }
                operations.push(c);
            }
            i++;
        }

        while (!operations.isEmpty()) {
            numbers.push(applyOperation(operations.pop(), numbers.pop(), numbers.pop()));
        }

        return String.valueOf(numbers.pop());
    }

    private boolean hasPrecedence(char op1, char op2) {
        if ((op1 == '*' || op1 == '/' || op1 == '%') && (op2 == '+' || op2 == '-')) {
            return false;
        } else {
            return true;
        }
    }

    private float applyOperation(char op, float b, float a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                return a / b;
            case '%':
                return (a * b) / 100;
        }
        return 0;
    }
}
