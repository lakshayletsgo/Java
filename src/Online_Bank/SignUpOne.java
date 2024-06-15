package Online_Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame implements ActionListener {
    long random ;
    JTextField nameTextField,FnameTextField,EmailTextField,AddressTextField,CityTextField,StateTextField,PinCodeTextField;
    JDateChooser dateChooser;
    JRadioButton male,Female,married,unmarried;
    JButton next;
    SignUpOne(){
        setLayout(null);
        Random ram = new Random();
        Long randNo = Math.abs(ram.nextLong()%9000L)+1000L;
        JLabel formno = new JLabel("Application Form No: "+randNo);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        JLabel personalDetails = new JLabel("Page 1 : Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);

        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);

        JLabel Fname = new JLabel("Father's Name: ");
        Fname.setFont(new Font("Raleway",Font.BOLD,20));
        Fname.setBounds(100,190,200,30);
        add(Fname);
        FnameTextField = new JTextField();
        FnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        FnameTextField.setBounds(300,190,400,30);
        add(FnameTextField);

        JLabel DOB = new JLabel("Date Of Birth: ");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,240,200,30);
        add(DOB);
         dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);

        JLabel Gender = new JLabel("Gender: ");
        Gender.setFont(new Font("Raleway",Font.BOLD,20));
        Gender.setBounds(100,290,200,30);
        add(Gender);
         male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);

        Female = new JRadioButton("Female");
        Female.setBounds(450,290,120,30);
        Female.setBackground(Color.WHITE);
        add(Female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(Female);

        JLabel EmailId = new JLabel("Email Address: ");
        EmailId.setFont(new Font("Raleway",Font.BOLD,20));
        EmailId.setBounds(100,340,200,30);
        add(EmailId);
        EmailTextField = new JTextField();
        EmailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        EmailTextField.setBounds(300,340,400,30);
        add(EmailTextField);

        JLabel MaritalStatus = new JLabel("Marital Status: ");
        MaritalStatus.setFont(new Font("Raleway",Font.BOLD,20));
        MaritalStatus.setBounds(100,390,200,30);
        add(MaritalStatus);

        married = new JRadioButton("Married");
        married.setBounds(300,390,120,30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Happy");
        unmarried.setBounds(450,390,120,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        ButtonGroup maritalStatus = new ButtonGroup();
        maritalStatus.add(married);
        maritalStatus.add(unmarried);


        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        AddressTextField = new JTextField();
        AddressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        AddressTextField.setBounds(300,440,400,30);
        add(AddressTextField);

        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        CityTextField = new JTextField();
        CityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        CityTextField.setBounds(300,490,400,30);
        add(CityTextField);

        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        StateTextField = new JTextField();
        StateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        StateTextField.setBounds(300,540,400,30);
        add(StateTextField);

        JLabel pincode = new JLabel("Pin Code: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        PinCodeTextField = new JTextField();
        PinCodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
        PinCodeTextField.setBounds(300,590,400,30);
        add(PinCodeTextField);

         next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.setBorder(null);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SignUpOne();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = ""+random;
        String name = nameTextField.getText();
        String Fname = FnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if(Female.isSelected()){
            gender   ="Female";
        }
        String email = EmailTextField.getText();
        String marritalStatus = null;
        if(married.isSelected()){
            marritalStatus = "Married";
        } else if (unmarried.isSelected()) {
            marritalStatus =  "UnMarried";
        }
        String address = AddressTextField.getText();
        String city = CityTextField.getText();
        String state = StateTextField.getText();
        String pin  =PinCodeTextField.getText();
        try {
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is Empty");
            } else if (!male.isSelected()&&!Female.isSelected()) {
                JOptionPane.showMessageDialog(null,"You can't go further. Select a Gender");
            }else{
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"','"+Fname+"','"+dob+"','"+gender+"','"+email+"','"+marritalStatus+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
                c.s.executeUpdate(query);
                nameTextField.setText("");
                JOptionPane.showMessageDialog(null,"Data Saved Successfully!");


            }
        }catch (Exception e2){
            System.out.println(e2);
        }
    }
}
