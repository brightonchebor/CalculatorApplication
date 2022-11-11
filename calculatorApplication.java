package exceptions;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class calculatorApplication implements ActionListener{

int calculation;
double num1=0, num2=0, result=0;

JTextField textField = new JTextField();
JLabel label = new JLabel();
JRadioButton onradiobutton = new JRadioButton("on");
JRadioButton offradiobutton = new JRadioButton("off");
JButton buttonZero = new JButton("0");
JButton buttonOne = new JButton("1");
JButton buttonTwo = new JButton("2");
JButton buttonThree = new JButton("3");
JButton buttonFour = new JButton("4");
JButton buttonFive = new JButton("5");
JButton buttonSix = new JButton("6");
JButton buttonSeven = new JButton("7");
JButton buttonEight = new JButton("8");
JButton buttonNine = new JButton("9");
JButton buttonDot = new JButton(".");
JButton buttonDel = new JButton("DEL");
JButton buttonClear = new JButton("c");
JButton buttonEqual = new JButton("=");
JButton buttonMul = new JButton("x");
JButton buttonDiv = new JButton("/");
JButton buttonPlus = new JButton("+");
JButton buttonMinus = new JButton("-");
JButton buttonSquare = new JButton("x\u00B2");
JButton buttonReciprocal = new JButton("1/x");
JButton buttonSqrt = new JButton("\u221A");


JFrame frame = new JFrame("calculator");
calculatorApplication(){
    prepareGui();
    addComponents();
    addActionEvent();
}


public void prepareGui(){
frame.setSize(305,510);
frame.getContentPane().setLayout(null);
frame.getContentPane().setBackground(Color.DARK_GRAY);
frame.setLocationRelativeTo(null);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void addComponents(){
label.setBounds(250,0,50,50);
label.setForeground(Color.BLACK);
frame.add(label);
textField.setBounds(10,40,270,40);
textField.setFont( new Font("Arial",Font.BOLD,14));
textField.setEditable(false);
textField.setHorizontalAlignment(SwingConstants.RIGHT);
frame.add(textField);

onradiobutton.setBounds  (10,95,60,40);
onradiobutton.setSelected(true);  
onradiobutton.setFont(new Font("Arila",Font.BOLD,14)); 
onradiobutton.setBackground(Color.BLACK);  
onradiobutton.setForeground (Color.WHITE);
onradiobutton.setFocusable(false);
frame.add(onradiobutton);

offradiobutton.setBounds  (10,120,60,40);
offradiobutton.setSelected(false);  
offradiobutton.setFont(new Font("Arila",Font.BOLD,14)); 
offradiobutton.setBackground(Color.BLACK);  
offradiobutton.setForeground (Color.WHITE);
offradiobutton.setFocusable(false);
frame.add(offradiobutton);

ButtonGroup buttonGroup = new ButtonGroup();
buttonGroup.add(onradiobutton);
buttonGroup.add(offradiobutton);

buttonEight.setBounds(80,230,60,40);
buttonEight.setFont(new Font("Arial", Font.BOLD,20));
buttonEight.setFocusable(false);
frame.add(buttonEight);

buttonSeven.setBounds(10,230,60,40);
buttonSeven.setFont(new Font("Arial", Font.BOLD,20));
buttonSeven.setFocusable(false);
frame.add(buttonSeven);

buttonNine.setBounds(150,230,60,40);
buttonNine.setFont(new Font("Arial", Font.BOLD,20));
buttonNine.setFocusable(false);
frame.add(buttonNine);

buttonFour.setBounds(10,290,60,40);
buttonFour.setFont(new Font("Arial", Font.BOLD,20));
buttonFour.setFocusable(false);
frame.add(buttonFour);


buttonFive.setBounds(80,290,60,40);
buttonFive.setFont(new Font("Arial", Font.BOLD,20));
buttonFive.setFocusable(false);
frame.add(buttonFive);

buttonSix.setBounds(150,290,60,40);
buttonSix.setFont(new Font("Arial", Font.BOLD,20));
buttonSix.setFocusable(false);
frame.add(buttonSix);

buttonOne.setBounds(10,350,60,40);
buttonOne.setFont(new Font("Arial", Font.BOLD,20));
buttonOne.setFocusable(false);
frame.add(buttonOne);

buttonTwo.setBounds(80,350,60,40);
buttonTwo.setFont(new Font("Arial", Font.BOLD,20));
buttonTwo.setFocusable(false);
frame.add(buttonTwo);

buttonThree.setBounds(150,350,60,40);
buttonThree.setFont(new Font("Arial", Font.BOLD,20));
buttonThree.setFocusable(false);
frame.add(buttonThree);

buttonDot.setBounds(150,410,60,40);
buttonDot.setFont(new Font("Arial", Font.BOLD,20));
buttonDot.setFocusable(false);
frame.add(buttonDot);

buttonEqual.setBounds(220,350,60,100);
buttonEqual.setFont(new Font("Arial", Font.BOLD,20));
buttonEqual.setFocusable(false);
frame.add(buttonEqual);

buttonDiv.setBounds(220,110,60,40);
buttonDiv.setFont(new Font("Arial", Font.BOLD,20));
buttonDiv.setFocusable(false);
frame.add(buttonDiv);

buttonSqrt.setBounds(10,170,60,40);
buttonSqrt.setFont(new Font("Arial", Font.BOLD,20));
buttonSqrt.setFocusable(false);
frame.add(buttonSqrt);

buttonMul.setBounds(220,230,60,40);
buttonMul.setFont(new Font("Arial", Font.BOLD,20));
buttonMul.setFocusable(false);
buttonMul.setBackground(new Color(239,188,2));
frame.add(buttonMul);

buttonMinus.setBounds(220,170,60,40);
buttonMinus.setFont(new Font("Arial", Font.BOLD,20));
buttonMinus.setFocusable(false);
buttonMinus.setBackground(new Color(239,188,2));
frame.add(buttonMinus);

buttonPlus.setBounds(220,290,60,40);
buttonPlus.setFont(new Font("Arial", Font.BOLD,20));
buttonPlus.setFocusable(false);
buttonPlus.setBackground(new Color(239,188,2));
frame.add(buttonPlus);

buttonSquare.setBounds(80,170,60,40);
buttonSquare.setFont(new Font("Arial", Font.BOLD,20));
buttonSquare.setFocusable(false);
buttonSquare.setBackground(new Color(239,188,2));
frame.add(buttonSquare);

buttonReciprocal.setBounds(220,230,60,40);
buttonReciprocal.setFont(new Font("Arial", Font.BOLD,20));
buttonReciprocal.setFocusable(false);
buttonReciprocal.setBackground(new Color(239,188,2));
frame.add(buttonReciprocal);

buttonDel.setBounds(150,110,60,40);
buttonDel.setFont(new Font("Arial", Font.BOLD,20));
buttonDel.setFocusable(false);
buttonDel.setBackground(new Color(239,188,2));
frame.add(buttonDel);

buttonClear.setBounds(220,230,60,40);
buttonClear.setFont(new Font("Arial", Font.BOLD,20));
buttonClear.setFocusable(false);
buttonClear.setBackground(new Color(239,188,2));
frame.add(buttonClear);

}


public void addActionEvent(){

onradiobutton.addActionListener(this);
offradiobutton.addActionListener(this);
offradiobutton.addActionListener(this);
buttonClear.addActionListener(this);
buttonDel.addActionListener(this);
buttonDiv.addActionListener(this);
buttonDot.addActionListener(this);
buttonSquare.addActionListener(this);
buttonReciprocal.addActionListener(this);
buttonMinus.addActionListener(this);
buttonSeven.addActionListener(this);
buttonEight.addActionListener(this);
buttonNine.addActionListener(this);
buttonMul.addActionListener(this);
buttonFour.addActionListener(this);
buttonFive.addActionListener(this);
buttonSix.addActionListener(this);
buttonPlus.addActionListener(this);
buttonOne.addActionListener(this);
buttonTwo.addActionListener(this);
buttonThree.addActionListener(this);
buttonEqual.addActionListener(this);
buttonZero.addActionListener(this);



}

public static void main(String[] args) {
    calculatorApplication calculator = new calculatorApplication();

}

@Override
public void actionPerformed(ActionEvent e){
Object source = e.getSource();

if  (source == onradiobutton){
    enable();
}
else if (source == offradiobutton){
    disable();
}
else if (source == buttonClear){
    label.setText("null");
    textField.setText("null");
}
else if (source == buttonDel){
    int length = textField.getText().length();
    int number = length-1;

    if(length>0){
        StringBuilder back = new StringBuilder(textField.getText());
         back.deleteCharAt(number);
        textField.setText(" ");
    }
    if(textField.getText().endsWith("")){
        label.setText("");
    }
}
else if(source == buttonZero){
    if (textField.getText().equals("0")){
        return;
    }
    else{
        textField.setText(textField.getText() + "0");
    }
}
else if(source == buttonOne){
    textField.setText(textField.getText() + "1");
}
else if(source == buttonTwo){
    textField.setText(textField.getText() + "2");
}
else if(source == buttonThree){
    textField.setText(textField.getText() + "3");
}
else if(source == buttonFour){
    textField.setText(textField.getText() + "4");
}
else if(source == buttonFive){
    textField.setText(textField.getText() + "5");
}
else if(source == buttonSix){
    textField.setText(textField.getText() + "6");
}
else if(source == buttonSeven){
    textField.setText(textField.getText() + "7");
}
else if(source == buttonEight){
    textField.setText(textField.getText() + "8");
}
else if(source == buttonNine){
    textField.setText(textField.getText() + "9");
}
else if(source == buttonDot){
    if (textField.getText().contains(".")){
        return;
    }
    else{
        textField.setText(textField.getText() + ".");
    }
}
else if ( source == buttonPlus){
    String str = textField.getText();
    num1 = Double.parseDouble(textField.getText());
    calculation = 1;
    textField.setText(" ");
    label.setText(str + "+");
}
else if ( source == buttonMinus){
    String str = textField.getText();
    num1 = Double.parseDouble(textField.getText());
    calculation = 2;
    textField.setText(" ");
    label.setText(str + "-");
}
else if ( source == buttonMul){
    String str = textField.getText();
    num1 = Double.parseDouble(textField.getText());
    calculation = 3;
    textField.setText(" ");
    label.setText(str + "X");
}
else if ( source == buttonDiv){
    String str = textField.getText();
    num1 = Double.parseDouble(textField.getText());
    calculation = 4;
    textField.setText(" ");
    label.setText(str + "/");
}
else if ( source == buttonSquare){
    String str = textField.getText();
    num1 = Double.parseDouble(textField.getText());
    double square = Math.pow(num1, 2);
    String string = Double.toString(square);
    if (string.endsWith(".0")){
        textField.setText(string);
    }
    label.setText("(sqr)" + str);
}
else if(source == buttonSqrt){
    num1 = Double.parseDouble(textField.getText());
    Double sqrt = Math.sqrt(num1);
    textField.setText(Double.toString(sqrt));
}
else if ( source == buttonReciprocal){
    String str = textField.getText();
    num1 = Double.parseDouble(textField.getText());
    double reciprocal = 1 / num1;
    String string = Double.toString(reciprocal);
    if (string.endsWith(".0")){
        textField.setText(string.replace(".o", " "));
    }
    else {
        textField.setText(string);
    }
    
}
else if (source == buttonEqual){
    num2 = Double.parseDouble((textField.getText()));
    switch (calculation){
        case 1:
        result = num1 + num2;
        break;

        case 2:
        result = num1 - num2;
        break;

        case 3:
        result = num1 * num2;
        break;

        case 4:
        result = num1 / num2;
        break;
    }
    if (Double.toString(result).endsWith(".0")){
        textField.setText(Double.toString(result).replace(".o", " "));

    }
    else {
        textField.setText(Double.toString(result));
    }
    label.setText(" ");
    num1 = result;
}

}
public void enable(){
    onradiobutton.setEnabled(false);
    offradiobutton.setEnabled(true);
    textField.setEditable(true);
    label.setEnabled(true);
    buttonClear.setEnabled(true);
    buttonDel.setEnabled(true);
    buttonDiv.setEnabled(true);
    buttonSqrt.setEnabled(true);
    buttonSquare.setEnabled(true);
    buttonReciprocal.setEnabled(true);
    buttonMinus.setEnabled(true);
    buttonSeven.setEnabled(true);
    buttonEight.setEnabled(true);
    buttonNine.setEnabled(true);
    buttonMul.setEnabled(true);
    buttonFour.setEnabled(true);
    buttonFive.setEnabled(true);
    buttonSix.setEnabled(true);
    buttonPlus.setEnabled(true);
    buttonOne.setEnabled(true);
    buttonTwo.setEnabled(true);
    buttonThree.setEnabled(true);
    buttonEqual.setEnabled(true);
    buttonZero.setEnabled(true);
    buttonDot.setEnabled(true);
}
public void disable(){
    onradiobutton.setEnabled(true);
    offradiobutton.setEnabled(false);
    buttonClear.setEnabled(false);
    buttonDel.setEnabled(false);
    buttonDiv.setEnabled(false);
    buttonSqrt.setEnabled(false);
    buttonSquare.setEnabled(false);
    buttonReciprocal.setEnabled(false);
    buttonMinus.setEnabled(false);
    buttonSeven.setEnabled(false);
    buttonEight.setEnabled(false);
    buttonNine.setEnabled(false);
    buttonMul.setEnabled(false);
    buttonFour.setEnabled(false);
    buttonFive.setEnabled(false);
    buttonSix.setEnabled(false);
    buttonPlus.setEnabled(false);
    buttonOne.setEnabled(false);
    buttonTwo.setEnabled(false);
    buttonThree.setEnabled(false);
    buttonEqual.setEnabled(false);
    buttonZero.setEnabled(false);
    buttonDot.setEnabled(false);

}

}