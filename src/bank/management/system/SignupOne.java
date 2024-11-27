package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser; 
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
    
    long random;
    JTextField  nameTextField,fnameTextField,emailTextField,adressTextField,cityTextField,stateTextField,pinTextField;
    JButton next;
    JRadioButton male, female, other, married, unmarried, other2;
    JDateChooser dateChooser;
    SignupOne()
    {
        setLayout(null);
        
        Random ran= new Random();
        random = Math.abs(ran.nextLong() % 9000L) + 1000L;
        
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(170,20,600,40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 25));
        personalDetails.setBounds(320,70,400,40);
        add(personalDetails);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 22));
        name.setBounds(130,140,200,40);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(320,140,400,35);
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 22));
        fname.setBounds(130,190,200,40);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(320,190,400,35);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date of Birth");
        dob.setFont(new Font("Raleway", Font.BOLD, 22));
        dob.setBounds(130,240,400,40);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(320,240,400,30);
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 22));
        gender.setBounds(130,290,200,40);
        add(gender);

        male= new JRadioButton("Male");
        male.setBounds(320,290,70,40);
        male.setBackground(Color.WHITE);
        add(male);
        
        female= new JRadioButton("Female");
        female.setBounds(420,290,70,40);
        female.setBackground(Color.WHITE);
        add(female);
        
        other= new JRadioButton("Other");
        other.setBounds(520,290,70,40);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);
        
        
        JLabel email = new JLabel("Email Adress:");
        email.setFont(new Font("Raleway", Font.BOLD, 22));
        email.setBounds(130,340,200,40);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(320,340,400,35);
        add(emailTextField);


        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 22));
        marital.setBounds(130,390,200,40);
        add(marital);
        
        married= new JRadioButton("Married");
        married.setBounds(320,390,70,40);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried= new JRadioButton("Unmarried");
        unmarried.setBounds(420,390,85,40);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        other2= new JRadioButton("Other");
        other2.setBounds(520,390,70,40);
        other2.setBackground(Color.WHITE);
        add(other2);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other2);
        
        JLabel adress = new JLabel("Adress:");
        adress.setFont(new Font("Raleway", Font.BOLD, 22));
        adress.setBounds(130,440,200,40);
        add(adress);
        
        adressTextField = new JTextField();
        adressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        adressTextField.setBounds(320,440,400,35);
        add(adressTextField);

        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 22));
        city.setBounds(130,490,200,40);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(320,490,400,35);
        add(cityTextField);

        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 22));
        state.setBounds(130,540,200,40);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(320,540,400,35);
        add(stateTextField);


        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 22));
        pincode.setBounds(130,590,200,40);
        add(pincode);
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinTextField.setBounds(320,590,400,35);
        add(pinTextField);

        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(640,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,820);
        setLocation(550,100);
        setVisible(true); 
    }
    public void actionPerformed(ActionEvent ae)
    {
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected())
        {
            gender = "male";
        }
        else if(female.isSelected())
        {
            gender = "female";
        }
        else if(other.isSelected())
        {
            gender = "other";
        }
        
        String email =emailTextField.getText();
        String marital = null;
        if(married.isSelected())
        {
            marital = "married";
        }
        else if(unmarried.isSelected())
        {
            marital = "unmarried";
        }
        else if(other2.isSelected())
        {
            marital = "other";
        }
        String address = adressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pinTextField.getText();
        
        try{
            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Name is Required");
            }
            else if(fname.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fathers Name is Required");
            }
            else if(dob.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Date of Birth is Required");
            }
            
            else if(state.equals(""))
            {
                JOptionPane.showMessageDialog(null, "State is Required");
            }
            else if(email.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Email is Required");
            }
            else if (!email.endsWith("@gmail.com")) 
            { // Checking if the email contains '@gmail.com'
                JOptionPane.showMessageDialog(null, "Please enter a valid Gmail address (e.g., user@gmail.com)");
            }
            else if(city.equals(""))
            {
                JOptionPane.showMessageDialog(null, "City is Required");
            }
            
            else if(pincode.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Pincode is Required");
            }
            else if(address.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Adress is Required");
            }
            else
            {
               conn c = new conn();
                String query = "insert into signup values('"+formno+"', '"+name+"','"+fname+"', '"+dob+"', '"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[]) 
    {
        new SignupOne();
    }
}
