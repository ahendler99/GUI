import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel result;


    public static void main(String[] args) {

        JPanel panel = new JPanel();

        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("Username");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

       userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

       passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new GUI());
        panel.add(button);

        result = new JLabel("");
        result.setBounds(10, 110, 400, 25);
        panel.add(result);


        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userText.getText();
        String password = passwordText.getText();
        System.out.println(username + ", " + password);

        if(username.equals("OveSundberg") && password.equals("TjenareMannen")) {
            result.setText("Login succesful!");

        } else {
               result.setText("Login unsuccesful. Wrong username or password!");
            }
        }
    }

