package Online_Bank;

import javax.swing.*;
import java.awt.*;

public class SignUpThree extends  JFrame{
    JRadioButton r1,r2,r3,r4;
    public SignUpThree(){
        setLayout(null);

        JLabel j1 = new JLabel("Page 3 : Account Details");
        j1.setFont(new Font("Raleway",Font.BOLD,22));
        j1.setBounds(280,40,400,40 );
        add(j1);
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30 );
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,150,20);
        add(r1);

        r4 = new JRadioButton("Fixed Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,180,150,20);
        add(r4);

        r2 = new JRadioButton("Current Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(100,220,150,20);
        add(r2);

        r3 = new JRadioButton("Reccurring Saving Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(350,220,150,20);
        add(r3);

        setSize(850,820);
        setLocation(350,0);
        setVisible(true);

    }
    public static void main(String[] args) {
        new SignUpThree();
    }
}
