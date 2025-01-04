import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLayout(null);

        JLabel labelTitle = new JLabel("Registration Form", JLabel.CENTER);
        labelTitle.setFont(new Font("Arial", Font.BOLD, 20));
        labelTitle.setBounds(100, 20,  250, 30);
        frame.add(labelTitle);

        JLabel name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.BOLD, 15));
        name.setBounds(50, 80, 80, 20);
        frame.add(name);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 80, 140, 20);
        frame.add(nameField);

        JLabel mobile = new JLabel("Mobile");
        mobile.setFont(new Font("Arial", Font.BOLD, 15));
        mobile.setBounds(50, 120, 80, 20);
        frame.add(mobile);

        JTextField mobileField = new JTextField();
        mobileField.setBounds(150, 120, 140, 20);
        frame.add(mobileField);

        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.BOLD, 15));
        gender.setBounds(50, 160, 80, 20);
        frame.add(gender);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(150,160, 70, 20);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(210,160, 70, 20);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        frame.add(male);
        frame.add(female);

        JLabel DOB = new JLabel("DOB");
        DOB.setFont(new Font("Arial", Font.BOLD, 15));
        DOB.setBounds(50, 200, 80, 20);
        frame.add(DOB);

        String[] days = new String[31];
        for(int i = 0; i < 31; i++) days[i] = String.valueOf(i + 1);
        JComboBox<String> dayDropdown = new JComboBox<>(days);
        dayDropdown.setBounds(150, 200, 40, 20);
        frame.add(dayDropdown);

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        JComboBox<String> monthDropdown = new JComboBox<>(months);
        monthDropdown.setBounds(190, 200, 60, 20);
        frame.add(monthDropdown);

        String[] years = new String[100];
        for(int i = 0; i < 100; i++) years[i] = String.valueOf(i + 1);
        JComboBox<String> yearDropdown = new JComboBox<>(years);
        yearDropdown.setBounds(250, 200, 40, 20);
        frame.add(yearDropdown);

        JLabel address = new JLabel("Address");
        address.setFont(new Font("Arial", Font.BOLD, 15));
        address.setBounds(50, 240, 80, 20);
        frame.add(address);

        JTextArea addressSpace = new JTextArea();
        addressSpace.setBounds(150, 240, 140, 80);
        frame.add(addressSpace);

        JCheckBox check = new JCheckBox("Accept Terms and Conditions");
        check.setBounds(80, 340, 200, 20);
        frame.add(check);

        JButton submit = new JButton("Submit");
        submit.setBounds(80, 380, 80, 25);
        frame.add(submit);

        JButton reset = new JButton("Reset");
        reset.setBounds(180, 380, 80, 25);
        frame.add(reset);

        JTextArea results = new JTextArea();
        results.setBounds(320, 70, 230, 350);
        frame.add(results);

        JLabel message = new JLabel();
        message.setBounds(100, 420, 200, 20);
        frame.add(message);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nameValue = name.getText();
                String mobileValue = mobile.getText();
                String gender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : "";
                String DoB = dayDropdown.getSelectedItem() + "-" + monthDropdown.getSelectedItem() + "-" + yearDropdown.getSelectedItem();
                String addressValue = addressSpace.getText();

                if(nameValue.isEmpty() || mobileValue.isEmpty() || gender.isEmpty() || DoB.isEmpty() || addressValue.isEmpty()){
                    message.setText("Please fill out all fields");
                }else {
                    message.setText("Registerd Successfully!");
                    results.setText("Name: " + nameValue + "\nMobile Number: " + mobileValue + "\nGender: " + gender + "\nDate of Birth: " + DoB + "\nAddress: " + addressValue);

                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/signUp", "root", "");
                        System.out.println("Database connection successful.");

                        String query = "INSERT INTO users (name, mobile, gender, dob, address) " +
                                "VALUES ('"+nameValue+"', '"+mobileValue+"', '"+gender+"', '"+DoB+"', '"+addressValue+"')";
                        Statement statement = connection.createStatement();
                        int insert = statement.executeUpdate(query);
                        if(insert > 0){
                            System.out.println("Data inserted successfully.");
                        }

                        statement.close();
                        connection.close();

                    } catch (ClassNotFoundException | SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                }
            }
        });

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                nameField.setText("");
                mobileField.setText("");
                genderGroup.clearSelection();
                dayDropdown.setSelectedIndex(0);
                monthDropdown.setSelectedIndex(0);
                yearDropdown.setSelectedIndex(0);
                addressSpace.setText("");
                results.setText("");
                message.setText("");

            }
        });

        frame.setVisible(true);

    }
}