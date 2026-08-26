package ui;
import dao.AdminDAO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
public class LoginFrame extends JFrame {
    JLabel title;
    JLabel userLabel;
    JLabel passLabel;
    JTextField txtUser;
    JPasswordField txtPass;
    JButton btnLogin;
    JButton btnExit;

    private static final Color BG_DARK = new Color(13, 13, 13);
    private static final Color CARD_DARK = new Color(27, 27, 27);
    private static final Color FIELD_DARK = new Color(35, 35, 35);
    private static final Color ACCENT = new Color(255, 76, 41);
    private static final Color WHITE = Color.WHITE;
    private static final Color GRAY_TEXT = new Color(166, 166, 166);

    public LoginFrame() {
        setTitle("Gym Membership Management System");
        setSize(500,350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(BG_DARK);

        title = new JLabel("GYM MEMBERSHIP MANAGEMENT SYSTEM", SwingConstants.CENTER);
        title.setBounds(40,20,420,30);
        title.setFont(new Font("Arial",Font.BOLD,18));
        title.setForeground(ACCENT);
        add(title);

        userLabel = new JLabel("Username");
        userLabel.setBounds(60,90,100,25);
        userLabel.setForeground(GRAY_TEXT);
        userLabel.setFont(new Font("Arial", Font.PLAIN, 13));
        add(userLabel);

        txtUser = new JTextField();
        txtUser.setBounds(170,90,200,25);
        txtUser.setBackground(FIELD_DARK);
        txtUser.setForeground(WHITE);
        txtUser.setCaretColor(WHITE);
        txtUser.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(60,60,60), 1),
                new EmptyBorder(2,6,2,6)));
        add(txtUser);

        passLabel = new JLabel("Password");
        passLabel.setBounds(60,140,100,25);
        passLabel.setForeground(GRAY_TEXT);
        passLabel.setFont(new Font("Arial", Font.PLAIN, 13));
        add(passLabel);

        txtPass = new JPasswordField();
        txtPass.setBounds(170,140,200,25);
        txtPass.setBackground(FIELD_DARK);
        txtPass.setForeground(WHITE);
        txtPass.setCaretColor(WHITE);
        txtPass.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(60,60,60), 1),
                new EmptyBorder(2,6,2,6)));
        add(txtPass);

        btnLogin = new JButton("Admin Login");
        btnLogin.setBounds(90,220,130,35);
        btnLogin.setBackground(ACCENT);
        btnLogin.setForeground(WHITE);
        btnLogin.setFont(new Font("Arial", Font.BOLD, 13));
        btnLogin.setFocusPainted(false);
        btnLogin.setBorderPainted(false);
        add(btnLogin);

        btnExit = new JButton("Exit");
        btnExit.setBounds(260,220,110,35);
        btnExit.setBackground(CARD_DARK);
        btnExit.setForeground(ACCENT);
        btnExit.setFont(new Font("Arial", Font.BOLD, 13));
        btnExit.setFocusPainted(false);
        btnExit.setBorder(BorderFactory.createLineBorder(ACCENT, 1));
        add(btnExit);

        btnLogin.addActionListener((ActionEvent e) -> {
            String username = txtUser.getText();
            String password = String.valueOf(txtPass.getPassword());
            AdminDAO dao = new AdminDAO();
            if(dao.login(username,password))
            {
                JOptionPane.showMessageDialog(null,"Login Successful");
                dispose();
                new AdminDashboard();
            }
            else
            {
                JOptionPane.showMessageDialog(null,
                        "Invalid Username or Password");
            }
        });
        btnExit.addActionListener(e->System.exit(0));
        setVisible(true);
    }
}