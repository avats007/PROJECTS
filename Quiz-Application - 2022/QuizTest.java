
package com.mycompany.quizapplication;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class QFrame extends JFrame implements ActionListener{
    JLabel label;
    
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton buttonNext,buttonResult;
    ButtonGroup bg;
    int count=0,current=0,x=1,y=1,now=0;
    int m[] = new int[10];
    QFrame(String s){
       
      super(s);  
      label = new JLabel();
      add(label);
      bg = new ButtonGroup();
      for(int i=0;i<5;i++){
          radioButtons[i]= new JRadioButton();
          add(radioButtons[i]);
          bg.add(radioButtons[i]);
      }
      buttonNext =  new JButton("Next");
      buttonResult =  new JButton("Result");
      buttonResult.setVisible(false);
      buttonResult.addActionListener(this);
      buttonNext.addActionListener(this);
      add(buttonNext);
      add(buttonResult);
      setData();
      label.setBounds(50,40,4500,50);
      label.setFont(new Font( "Courier ", Font.BOLD, 20));
      radioButtons[0].setBounds(50,100,2000,50);
      radioButtons[0].setOpaque(false);
      radioButtons[0].setFont(new Font( "Courier ", Font.PLAIN, 20));
      radioButtons[1].setBounds(50,150,2000,50);
      radioButtons[1].setOpaque(false);
      radioButtons[1].setFont(new Font( "Courier ", Font.PLAIN, 20));
      radioButtons[2].setOpaque(false);
      radioButtons[3].setOpaque(false);
      radioButtons[2].setBounds(50,200,2000,50);
      radioButtons[2].setFont(new Font( "Courier ", Font.PLAIN, 20));
      radioButtons[3].setBounds(50,250,2000,50);
      radioButtons[3].setFont(new Font( "Courier ", Font.PLAIN, 20));

      
      buttonNext.setBounds(300,350,150,50);
      buttonNext.setFont(new Font( "Courier ", Font.BOLD, 20));
      buttonResult.setBounds(500,350,150,50);
      buttonResult.setFont(new Font( "Courier ", Font.BOLD, 20));
      
      buttonNext.setBackground(Color.GREEN);
      buttonResult.setBackground(Color.red);

      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(true);
      setLayout(null);
      //setLocation(300,100);
      setVisible(true);
      //setSize(800,400);
      setSize(900,600);
        setLocation(300,100);
        
        
    }
    
    QFrame() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    void setData(){
       radioButtons[4].setSelected(true);
       if(current==0){
           label.setText("Question 1: What is the official language for Android Development?");
           radioButtons[0].setText("Java");
           radioButtons[1].setText("Kotlin");
           radioButtons[2].setText("C++");
           radioButtons[3].setText("JavaScript");
       }
       
       
       if(current==1){
           label.setText("Question 2: What is the size of boolean variable?");
           radioButtons[0].setText("8 bit");
           radioButtons[1].setText("16 bit");
           radioButtons[2].setText("32 bit");
           radioButtons[3].setText("not known");
       }
       if(current==2){
           label.setText("Question 3: What is the default value of long variable?");
           radioButtons[0].setText("0");
           radioButtons[1].setText("0.0");
           radioButtons[2].setText("0L");
           radioButtons[3].setText("not known");
       }
       if(current==3){
           label.setText("Question 4: What is the default value of boolean variable?");
           radioButtons[0].setText("true");
           radioButtons[1].setText("false");
           radioButtons[2].setText("null");
           radioButtons[3].setText("not");
       }
       if(current==4){
           label.setText("Question 5: What kind of variables a class can consist of?");
           radioButtons[0].setText("class variables instance attempt");
           radioButtons[1].setText("class variables local variables,instance variables");
           radioButtons[2].setText("classs variables");
           radioButtons[3].setText("class variables local variables");
       }
       if(current==5){
           label.setText("Question 6: What is function overloading?");
           radioButtons[0].setText("Methods with same name but different parameters");
           radioButtons[1].setText("Methods with same name but different return types");
           radioButtons[2].setText("Methods with same name,same parameter type but different parameters names.");
           radioButtons[3].setText("D - None of the above");
       }
       if(current==6){
           label.setText("Question 7: What is Serialization?");
           radioButtons[0].setText("A - Serialization is the process of writing the state of an object to another objects.");
           radioButtons[1].setText("B - Serialization is the process of writing the state of an object to a byte stream");
           radioButtons[2].setText("C - Both of the above");
           radioButtons[3].setText("D - None of the above");
       }
      if(current==7){
           label.setText("Question 8: Which of the following is a thread safe?");
           radioButtons[0].setText("StringBuilder");
           radioButtons[1].setText("StringBuffer");
           radioButtons[2].setText("Both of the above");
           radioButtons[3].setText("None of the above");
       }
      if(current==8){
           label.setText("Question 9: What is the size of boolean variable?");
           radioButtons[0].setText("8 bit");
           radioButtons[1].setText("16 bit");
           radioButtons[2].setText("32 bit");
           radioButtons[3].setText("not precisely defined");
       }
      if(current==9){
           label.setText("Question 10: What can we learn from Geeks for Geeks");
           radioButtons[0].setText("C++");
           radioButtons[1].setText("Android Development");
           radioButtons[2].setText("Java");
           radioButtons[3].setText("All of the above");
       }
      label.setBounds(50,40,4500,50);
       label.setFont(new Font( "Courier ", Font.BOLD, 20));
      for(int i =0,j=0; i<=90; i+=50,j++){
          radioButtons[j].setBounds(50,100+i,2000,50);
          radioButtons[j].setFont(new Font( "Courier ", Font.PLAIN, 20));
      }
    }
    
    boolean checkAns(){
        if(current==0){
            return (radioButtons[1].isSelected());
        }
        if(current==1){
            return (radioButtons[1].isSelected());
        }
        if(current==2){
            return (radioButtons[2].isSelected());
        }
        if(current==3){
            return (radioButtons[1].isSelected());
        }
        if(current==4){
            return (radioButtons[1].isSelected());
        }
        if(current==5){
            return (radioButtons[0].isSelected());
        }
        if(current==6){
            return (radioButtons[1].isSelected());
        }
        if(current==7){
            return (radioButtons[1].isSelected());
        }
        if(current==8){
            return (radioButtons[1].isSelected());
        }
        if(current==9){
            return (radioButtons[3].isSelected());
        }
        return false;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonNext){
            if(checkAns()){
            count = count + 1;
            }
            current++;
            setData();
            if(current==9){
                buttonNext.setEnabled(false);
                buttonResult.setVisible(true);
                buttonResult.setText("Result");
            }
        }
        if(e.getActionCommand().equals("Result")){
            if(checkAns())
                count = count + 1;
            current++;
            JOptionPane.showMessageDialog(this,"Correct Answers are "+count);
            System.exit(0);
        }
    }
}

class QuizTest {
 
    public static void main(String[] args) throws Exception
    {
        QFrame k =new QFrame("Simple QuizApp");
        
    }
}
