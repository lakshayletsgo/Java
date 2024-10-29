//package Online_Bank;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Random;
//import com.toedter.calendar.JDateChooser;
//
//public class SignUpTwo extends JFrame implements ActionListener {
//    long random ;
//    JTextField nameTextField,FnameTextField,EmailTextField,AddressTextField,CityTextField,StateTextField,PinCodeTextField;
//    JDateChooser dateChooser;
//    JRadioButton male,Female,married,unmarried;
//    JButton next;
//    SignUpTwo(){
//        setLayout(null);
//        setTitle("New Account Application Form - Page 2");
//
//        JLabel additionalDetails = new JLabel("Page 2 : Additional Details");
//        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
//        additionalDetails.setBounds(290,80,400,30);
//        add(additionalDetails);
//
//        JLabel name = new JLabel("Religion: ");
//        name.setFont(new Font("Raleway",Font.BOLD,20));
//        name.setBounds(100,140,100,30);
//        add(name);
//        String []valReligion =  {"Hindu","Muslim","Sikh","Jainism"};
//        JComboBox religion  = new JComboBox(valReligion);
//        religion.setBounds(300,140,400,30);
//        religion.setBackground(Color.WHITE);
//        add(religion);
//
//        JLabel Fname = new JLabel("Category: ");
//        Fname.setFont(new Font("Raleway",Font.BOLD,20));
//        Fname.setBounds(100,190,200,30);
//        add(Fname);
//        String valCategory [] = {"General","ST","SC","OBC","Others"};
//        JComboBox category  = new JComboBox(valCategory);
//        category.setBounds(300,190,400,30);
//        category.setBackground(Color.WHITE);
//        add(category);
//
//
//        JLabel DOB = new JLabel("Income(in INR): ");
//        DOB.setFont(new Font("Raleway",Font.BOLD,20));
//        DOB.setBounds(100,240,200,30);
//        add(DOB);
//        String incomeCategory [] = {"Null","<=2,00,000","<=3,00,000","<=4,00,000","<=5,00,000"};
//        JComboBox incategory  = new JComboBox(incomeCategory);
//        incategory.setBounds(300,240,400,30);
//        incategory.setBackground(Color.WHITE);
//        add(incategory);
//
//
//        JLabel Gender = new JLabel("Educational: ");
//        Gender.setFont(new Font("Raleway",Font.BOLD,20));
//        Gender.setBounds(100,290,200,30);
//        add(Gender);
//        male = new JRadioButton("Male");
//        male.setBounds(300,290,60,30);
//        male.setBackground(Color.WHITE);
//        add(male);
//
//        Female = new JRadioButton("Female");
//        Female.setBounds(450,290,120,30);
//        Female.setBackground(Color.WHITE);
//        add(Female);
//
//        ButtonGroup genderGroup = new ButtonGroup();
//        genderGroup.add(male);
//        genderGroup.add(Female);
//
//        JLabel EmailId = new JLabel("Qualification: ");
//        EmailId.setFont(new Font("Raleway",Font.BOLD,20));
//        EmailId.setBounds(100,340,200,30);
//        add(EmailId);
//        EmailTextField = new JTextField();
//        EmailTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        EmailTextField.setBounds(300,340,400,30);
//        add(EmailTextField);
//
//        JLabel MaritalStatus = new JLabel("Occupation: ");
//        MaritalStatus.setFont(new Font("Raleway",Font.BOLD,20));
//        MaritalStatus.setBounds(100,390,200,30);
//        add(MaritalStatus);
//
//        married = new JRadioButton("Married");
//        married.setBounds(300,390,120,30);
//        married.setBackground(Color.WHITE);
//        add(married);
//
//        unmarried = new JRadioButton("Happy");
//        unmarried.setBounds(450,390,120,30);
//        unmarried.setBackground(Color.WHITE);
//        add(unmarried);
//
//        ButtonGroup maritalStatus = new ButtonGroup();
//        maritalStatus.add(married);
//        maritalStatus.add(unmarried);
//
//
//        JLabel address = new JLabel("PAN Number: ");
//        address.setFont(new Font("Raleway",Font.BOLD,20));
//        address.setBounds(100,440,200,30);
//        add(address);
//        AddressTextField = new JTextField();
//        AddressTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        AddressTextField.setBounds(300,440,400,30);
//        add(AddressTextField);
//
//        JLabel city = new JLabel("Aadhar Number: ");
//        city.setFont(new Font("Raleway",Font.BOLD,20));
//        city.setBounds(100,490,200,30);
//        add(city);
//
//        CityTextField = new JTextField();
//        CityTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        CityTextField.setBounds(300,490,400,30);
//        add(CityTextField);
//
//        JLabel state = new JLabel("Senior Citizen: ");
//        state.setFont(new Font("Raleway",Font.BOLD,20));
//        state.setBounds(100,540,200,30);
//        add(state);
//
//        StateTextField = new JTextField();
//        StateTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        StateTextField.setBounds(300,540,400,30);
//        add(StateTextField);
//
//        JLabel pincode = new JLabel("Exisiting Account: ");
//        pincode.setFont(new Font("Raleway",Font.BOLD,20));
//        pincode.setBounds(100,590,200,30);
//        add(pincode);
//        PinCodeTextField = new JTextField();
//        PinCodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        PinCodeTextField.setBounds(300,590,400,30);
//        add(PinCodeTextField);
//
//        next = new JButton("Next");
//        next.setBackground(Color.BLACK);
//        next.setForeground(Color.WHITE);
//        next.setFont(new Font("Raleway",Font.BOLD,14));
//        next.setBounds(620,660,80,30);
//        next.setBorder(null);
//        next.addActionListener(this);
//        add(next);
//
//        getContentPane().setBackground(Color.WHITE);
//
//        setSize(850,800);
//        setLocation(350,10);
//        setVisible(true);
//    }
//    public static void main(String[] args) {
//        new SignUpTwo();
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        String formno = ""+random;
//        String name = nameTextField.getText();
//        String Fname = FnameTextField.getText();
//        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
//        String gender = null;
//        if(male.isSelected()){
//            gender = "Male";
//        }else if(Female.isSelected()){
//            gender   ="Female";
//        }
//        String email = EmailTextField.getText();
//        String marritalStatus = null;
//        if(married.isSelected()){
//            marritalStatus = "Married";
//        } else if (unmarried.isSelected()) {
//            marritalStatus =  "UnMarried";
//        }
//        String address = AddressTextField.getText();
//        String city = CityTextField.getText();
//        String state = StateTextField.getText();
//        String pin  =PinCodeTextField.getText();
//        try {
//            if(name.equals("")){
//                JOptionPane.showMessageDialog(null,"Name is Empty");
//            } else if (!male.isSelected()&&!Female.isSelected()) {
//                JOptionPane.showMessageDialog(null,"You can't go further. Select a Gender");
//            }else{
//                Conn c = new Conn();
//                String query = "insert into signup values('"+formno+"','"+name+"','"+Fname+"','"+dob+"','"+gender+"','"+email+"','"+marritalStatus+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
//                c.s.executeUpdate(query);
//                nameTextField.setText("");
//                JOptionPane.showMessageDialog(null,"Data Saved Successfully!");
//
//
//            }
//        }catch (Exception e2){
//            System.out.println(e2);
//        }
//    }
//}
