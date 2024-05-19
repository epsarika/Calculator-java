import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator implements ActionListener {
    JFrame jf;
    JLabel display;
    JButton allClearButton, percentButton, clearButton, divisionButton, sevenButton, eightButton, nineButton, multiplicationButton,
    fourButton, fiveButton, sixButton, minusButton, oneButton, twoButton, threeButton, plusButton, doubleZeroButton, zeroButton,
    pointButton, equalButton;

    calculator(){
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(350, 550);
        jf.getContentPane().setBackground(Color.black);
        jf.setLocation(500, 100);

        display = new JLabel();
        display.setBounds(35, 50, 270, 50);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setForeground(Color.white);
        jf.add(display);

        
        allClearButton = new JButton("AC");
        allClearButton.setBounds(35, 150, 50, 50);
        allClearButton.addActionListener(this);
        jf.add(allClearButton);

        percentButton = new JButton("%");
        percentButton.setBounds(105, 150, 50, 50);
        percentButton.setBackground(Color.gray);
        percentButton.setForeground(Color.WHITE);
        percentButton.addActionListener(this);
        jf.add(percentButton);

        clearButton = new JButton("←");
        clearButton.setBounds(175, 150, 50, 50);
        clearButton.addActionListener(this);
        jf.add(clearButton);

        divisionButton = new JButton("/");
        divisionButton.setBounds(245, 150, 50, 50);
        divisionButton.addActionListener(this);
        jf.add(divisionButton);

        sevenButton = new JButton("7");
        sevenButton.setBounds(35, 220, 50, 50);
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(105, 220, 50, 50);
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(175, 220, 50, 50);
        nineButton.addActionListener(this);
        jf.add(nineButton);

        multiplicationButton = new JButton("X");
        multiplicationButton.setBounds(245, 220, 50, 50);
        multiplicationButton.addActionListener(this);
        jf.add(multiplicationButton);

        fourButton = new JButton("4");
        fourButton.setBounds(35, 290, 50, 50);
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(105, 290, 50, 50);
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(175, 290, 50, 50);
        sixButton.addActionListener(this);
        jf.add(sixButton);

        minusButton = new JButton("-");
        minusButton.setBounds(245, 290, 50, 50);
        minusButton.addActionListener(this);
        jf.add(minusButton);

        oneButton = new JButton("1");
        oneButton.setBounds(35, 360, 50, 50);
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(105, 360, 50, 50);
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(175, 360, 50, 50);
        threeButton.addActionListener(this);
        jf.add(threeButton);

        plusButton = new JButton("+");
        plusButton.setBounds(245, 360, 50, 50);
        plusButton.addActionListener(this);
        jf.add(plusButton);

        doubleZeroButton = new JButton("00");
        doubleZeroButton.setBounds(35, 430, 50, 50);
        doubleZeroButton.addActionListener(this);
        jf.add(doubleZeroButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(105, 430, 50, 50);
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        pointButton = new JButton(".");
        pointButton.setBounds(175, 430, 50, 50);
        pointButton.addActionListener(this);
        jf.add(pointButton);

        equalButton = new JButton("=");
        equalButton.setBounds(245, 430, 50, 50);
        equalButton.addActionListener(this);
        jf.add(equalButton);


        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String args[]){
        new calculator();
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==sevenButton){
            display.setText(display.getText()+"7");
        }

        else if(e.getSource()==eightButton){
            display.setText(display.getText()+"8");
        }

        else if(e.getSource()==nineButton){
            display.setText(display.getText()+"9");
        }

        else if(e.getSource()==fourButton){
            display.setText(display.getText()+"4");
        }

        else if(e.getSource()==fiveButton){
            display.setText(display.getText()+"5");
        }

        else if(e.getSource()==sixButton){
            display.setText(display.getText()+"6");
        }

        else if(e.getSource()==oneButton){
            display.setText(display.getText()+"1");
        }

        else if(e.getSource()==twoButton){
            display.setText(display.getText()+"2");
        }

        else if(e.getSource()==threeButton){
            display.setText(display.getText()+"3");
        }

        else if(e.getSource()==doubleZeroButton){
            display.setText(display.getText()+"00");
        }
        
        else if(e.getSource()==zeroButton){
            display.setText(display.getText()+"0");
        }

        else if(e.getSource()==pointButton){
            display.setText(display.getText()+".");
        }

    }
}
