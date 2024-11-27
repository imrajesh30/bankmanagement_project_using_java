package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    JTextField  pan,adharTextField;
    JButton next;
    JRadioButton yes,no,eyes,eno;
    JComboBox religion,category,income,education,occupation;
    String formno;
    SignupTwo(String formno)
    {
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 25));
        additionalDetails.setBounds(320,70,400,40);
        add(additionalDetails);
        
        JLabel religionName = new JLabel("Religons:");
        religionName.setFont(new Font("Raleway", Font.BOLD, 22));
        religionName.setBounds(130,140,200,40);
        add(religionName);
        
        String valReligion[]={"Hindu","Muslim","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(320,140,400,35);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel categoryName = new JLabel("Category:");
        categoryName.setFont(new Font("Raleway", Font.BOLD, 22));
        categoryName.setBounds(130,190,200,40);
        add(categoryName);

        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valCategory);
        category.setBounds(320,190,400,35);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel incomm = new JLabel("Income");
        incomm.setFont(new Font("Raleway", Font.BOLD, 22));
        incomm.setBounds(130,240,400,40);
        add(incomm);
        
        String incomeCategory[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(320,240,400,35);
        income.setBackground(Color.WHITE);
        add(income);
        
        JLabel edu_qua = new JLabel("Educational");
        edu_qua.setFont(new Font("Raleway", Font.BOLD, 22));
        edu_qua.setBounds(130,290,200,40);
        add(edu_qua);

        
        JLabel Qualification = new JLabel("Qualification:");
        Qualification.setFont(new Font("Raleway", Font.BOLD, 22));
        Qualification.setBounds(130,320,200,40);
        add(Qualification);
        
        String educationalValue[]={"Non-Graduation", "Graduate", "Post-Graduate", "Doctrate", "Other"};
        education = new JComboBox(educationalValue);
        education.setBounds(320,310,400,35);
        education.setBackground(Color.WHITE);
        add(education);


        JLabel Occupation = new JLabel("Occupation:");
        Occupation.setFont(new Font("Raleway", Font.BOLD, 22));
        Occupation.setBounds(130,380,200,40);
        add(Occupation);
        
        String occupationValue[]={"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Other"};
        occupation= new JComboBox(occupationValue);
        occupation.setBounds(320,380,400,35);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        JLabel pan_number = new JLabel("PAN Number:");
        pan_number.setFont(new Font("Raleway", Font.BOLD, 22));
        pan_number.setBounds(130,440,200,40);
        add(pan_number);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(320,440,400,35);
        add(pan);

        
        JLabel adhar_number = new JLabel("Aahar Number:");
        adhar_number.setFont(new Font("Raleway", Font.BOLD, 22));
        adhar_number.setBounds(130,490,200,40);
        add(adhar_number);
        
        adharTextField = new JTextField();
        adharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        adharTextField.setBounds(320,490,400,35);
        add(adharTextField);

        
        JLabel senior_citizen = new JLabel("Senior Citizen:");
        senior_citizen.setFont(new Font("Raleway", Font.BOLD, 22));
        senior_citizen.setBounds(130,540,200,40);
        add(senior_citizen);
        
        yes= new JRadioButton("Yes");
        yes.setBounds(320,540,70,40);
        yes.setBackground(Color.WHITE);
        add(yes);
        
        no= new JRadioButton("No");
        no.setBounds(390,540,85,40);
        no.setBackground(Color.WHITE);
        add(no);
        
        ButtonGroup citizengroup = new ButtonGroup();
        citizengroup.add(yes);
        citizengroup.add(no);
        
       
        JLabel exist_account = new JLabel("Existing Account :");
        exist_account.setFont(new Font("Raleway", Font.BOLD, 22));
        exist_account.setBounds(130,590,200,40);
        add(exist_account);
        
        eyes= new JRadioButton("Yes");
        eyes.setBounds(320,590,70,40);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno= new JRadioButton("No");
        eno.setBounds(390,590,85,40);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup accountgroup = new ButtonGroup();
        accountgroup.add(eyes);
        accountgroup.add(eno);

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
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorCitizen = null;
        if(yes.isSelected())
        {
            seniorCitizen = "Yes";
        }
        else if(no.isSelected())
        {
            seniorCitizen = "NO";
        }
        
        
        String existaccount = null;
        if(eyes.isSelected())
        {
            existaccount = "Yes";
        }
        else if(eno.isSelected())
        {
            existaccount = "No";
        }
        
        String span = pan.getText();
        String sadhar = adharTextField.getText();
   
        
        try{
               conn c = new conn();
               String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"','"+scategory+"', '"+sincome+"', '"+seducation+"','"+soccupation+"','"+span+"','"+sadhar+"','"+seniorCitizen+"','"+existaccount+"')";
               c.s.executeUpdate(query);
               setVisible(false);
               new SignupThree(formno).setVisible(true);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[]) 
    {
        new SignupTwo("");
    }
}

