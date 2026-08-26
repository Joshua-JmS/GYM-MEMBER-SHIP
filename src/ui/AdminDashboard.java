package ui;
import javax.swing.*;
import java.awt.*;
public class AdminDashboard extends JFrame {
    JButton btnMembers;
    JButton btnTrainers;
    JButton btnPlans;
    JButton btnAttendance;
    JButton btnPayments;
    JButton btnReports;
    JButton btnLogout;

    private static final Color BG_DARK = new Color(13, 13, 13);
    private static final Color CARD_DARK = new Color(27, 27, 27);
    private static final Color ACCENT = new Color(255, 76, 41);
    private static final Color WHITE = Color.WHITE;

    public AdminDashboard() {
        setTitle("Gym Membership Management System");
        setSize(900,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(BG_DARK);

        JLabel title = new JLabel("ADMIN DASHBOARD");
        title.setFont(new Font("Arial",Font.BOLD,26));
        title.setForeground(ACCENT);
        title.setBounds(300,30,300,40);
        panel.add(title);

        btnMembers = new JButton("Manage Members");
        btnMembers.setBounds(80,120,220,50);
        styleButton(btnMembers, true);
        panel.add(btnMembers);

        btnTrainers = new JButton("Manage Trainers");
        btnTrainers.setBounds(330,120,220,50);
        styleButton(btnTrainers, false);
        panel.add(btnTrainers);

        btnPlans = new JButton("Membership Plans");
        btnPlans.setBounds(580,120,220,50);
        styleButton(btnPlans, false);
        panel.add(btnPlans);

        btnAttendance = new JButton("Attendance");
        btnAttendance.setBounds(80,240,220,50);
        styleButton(btnAttendance, false);
        panel.add(btnAttendance);

        btnPayments = new JButton("Payments");
        btnPayments.setBounds(330,240,220,50);
        styleButton(btnPayments, false);
        panel.add(btnPayments);

        btnReports = new JButton("Reports");
        btnReports.setBounds(580,240,220,50);
        styleButton(btnReports, false);
        panel.add(btnReports);

        btnLogout = new JButton("Logout");
        btnLogout.setBounds(330,400,220,45);
        styleButton(btnLogout, false);
        panel.add(btnLogout);

        add(panel);
        btnLogout.addActionListener(e->{
            dispose();
            new LoginFrame();
        });
        btnMembers.addActionListener(e->{
            new ManageMembers();
        });
        setVisible(true);
    }

    private void styleButton(JButton btn, boolean filled) {
        btn.setFont(new Font("Arial", Font.BOLD, 14));
        btn.setFocusPainted(false);
        if (filled) {
            btn.setBackground(ACCENT);
            btn.setForeground(WHITE);
            btn.setBorderPainted(false);
        } else {
            btn.setBackground(CARD_DARK);
            btn.setForeground(ACCENT);
            btn.setBorder(BorderFactory.createLineBorder(ACCENT, 1));
        }
    }
}