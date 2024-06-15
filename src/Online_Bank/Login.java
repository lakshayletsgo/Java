package Online_Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton Login,clear,signup;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){

        setTitle("Automated Teller Machine");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Online_Bank/icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        JLabel label = new JLabel(new ImageIcon(i2));
        label.setBounds(70,10,100,100);
        add(label);
//        This is the size of the login page and we have to set visible to true because it is false by default
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        JLabel cardNo = new JLabel("Card No : ");
        cardNo.setFont(new Font("Osward",Font.BOLD,38));
        cardNo.setBounds(120,150,200,30);
        add(cardNo);
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        JLabel pin = new JLabel("Pin : ");
        pin.setFont(new Font("Osward",Font.BOLD,38));
        pin.setBounds(120,220,250,30);
        add(pin);
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);
         Login= new JButton("Sign In");
        Login.setBounds(300,300,100,30);
        Login.setBackground(Color.black);
        Login.setForeground(Color.WHITE);
        Login.addActionListener(this);
        add(Login);

         clear= new JButton("Clear");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

         signup= new JButton("Sign Up");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.WHITE);

        setSize(800,480);
        setVisible(true);

//        This is used to set the default locatuon of the frame
        setLocation(350,200);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (e.getSource() == Login) {

        }else if(e.getSource()==signup) {
            setVisible(false);
            new SignUpOne().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Login();
    }



}
