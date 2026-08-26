package ui;
import dao.MemberDAO;
import model.Member;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ManageMembers extends JFrame {

    JTextField txtName;
    JTextField txtAge;
    JTextField txtGender;
    JTextField txtPhone;
    JTextField txtAddress;
    JTextField txtUsername;
    JTextField txtPassword;
    JTextField txtPlanId;
    JTextField txtTrainerId;

    JButton btnAdd;
    JButton btnUpdate;
    JButton btnDelete;
    JButton btnSearch;
    JButton btnClear;

    JTable table;

    private static final Color BG_DARK = new Color(13, 13, 13);
    private static final Color CARD_DARK = new Color(27, 27, 27);
    private static final Color FIELD_DARK = new Color(35, 35, 35);
    private static final Color ACCENT = new Color(255, 76, 41);
    private static final Color WHITE = Color.WHITE;
    private static final Color GRAY_TEXT = new Color(166, 166, 166);
    private static final Color LINE = new Color(60, 60, 60);

    public ManageMembers(){

        setTitle("Manage Members");

        setSize(1100,650);

        setLocationRelativeTo(null);

        setLayout(null);

        getContentPane().setBackground(BG_DARK);

        JLabel title = new JLabel("MEMBER MANAGEMENT");

        title.setFont(new Font("Arial",Font.BOLD,24));

        title.setForeground(ACCENT);

        title.setBounds(380,15,400,40);

        add(title);

        JLabel l1=new JLabel("Name");
        l1.setBounds(40,80,100,25);
        styleLabel(l1);
        add(l1);

        txtName=new JTextField();
        txtName.setBounds(150,80,200,25);
        styleField(txtName);
        add(txtName);

        JLabel l2=new JLabel("Age");
        l2.setBounds(40,120,100,25);
        styleLabel(l2);
        add(l2);

        txtAge=new JTextField();
        txtAge.setBounds(150,120,200,25);
        styleField(txtAge);
        add(txtAge);

        JLabel l3=new JLabel("Gender");
        l3.setBounds(40,160,100,25);
        styleLabel(l3);
        add(l3);

        txtGender=new JTextField();
        txtGender.setBounds(150,160,200,25);
        styleField(txtGender);
        add(txtGender);

        JLabel l4=new JLabel("Phone");
        l4.setBounds(40,200,100,25);
        styleLabel(l4);
        add(l4);

        txtPhone=new JTextField();
        txtPhone.setBounds(150,200,200,25);
        styleField(txtPhone);
        add(txtPhone);

        JLabel l5=new JLabel("Address");
        l5.setBounds(40,240,100,25);
        styleLabel(l5);
        add(l5);

        txtAddress=new JTextField();
        txtAddress.setBounds(150,240,200,25);
        styleField(txtAddress);
        add(txtAddress);

        JLabel l6=new JLabel("Username");
        l6.setBounds(400,80,100,25);
        styleLabel(l6);
        add(l6);

        txtUsername=new JTextField();
        txtUsername.setBounds(520,80,200,25);
        styleField(txtUsername);
        add(txtUsername);

        JLabel l7=new JLabel("Password");
        l7.setBounds(400,120,100,25);
        styleLabel(l7);
        add(l7);

        txtPassword=new JTextField();
        txtPassword.setBounds(520,120,200,25);
        styleField(txtPassword);
        add(txtPassword);

        JLabel l8=new JLabel("Plan ID");
        l8.setBounds(400,160,100,25);
        styleLabel(l8);
        add(l8);

        txtPlanId=new JTextField();
        txtPlanId.setBounds(520,160,200,25);
        styleField(txtPlanId);
        add(txtPlanId);

        JLabel l9=new JLabel("Trainer ID");
        l9.setBounds(400,200,100,25);
        styleLabel(l9);
        add(l9);

        txtTrainerId=new JTextField();
        txtTrainerId.setBounds(520,200,200,25);
        styleField(txtTrainerId);
        add(txtTrainerId);

        btnAdd=new JButton("Add");
        btnAdd.setBounds(800,70,150,35);
        styleButton(btnAdd, true);
        add(btnAdd);

        btnUpdate=new JButton("Update");
        btnUpdate.setBounds(800,120,150,35);
        styleButton(btnUpdate, false);
        add(btnUpdate);

        btnDelete=new JButton("Delete");
        btnDelete.setBounds(800,170,150,35);
        styleButton(btnDelete, false);
        add(btnDelete);

        btnSearch=new JButton("Search");
        btnSearch.setBounds(800,220,150,35);
        styleButton(btnSearch, false);
        add(btnSearch);

        btnClear=new JButton("Clear");
        btnClear.setBounds(800,270,150,35);
        styleButton(btnClear, false);
        add(btnClear);

        table=new JTable();

        table.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                        "ID",
                        "Name",
                        "Age",
                        "Gender",
                        "Phone",
                        "Address",
                        "Username",
                        "Plan",
                        "Trainer"
                }
        ));

        table.setBackground(CARD_DARK);
        table.setForeground(WHITE);
        table.setGridColor(LINE);
        table.setRowHeight(26);
        table.setFont(new Font("Arial", Font.PLAIN, 12));
        table.setSelectionBackground(ACCENT);
        table.setSelectionForeground(WHITE);
        table.getTableHeader().setBackground(new Color(20,20,20));
        table.getTableHeader().setForeground(ACCENT);
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));

        JScrollPane sp=new JScrollPane(table);

        sp.setBounds(20,340,1040,240);
        sp.getViewport().setBackground(CARD_DARK);
        sp.setBorder(BorderFactory.createLineBorder(LINE, 1));

        add(sp);
        btnAdd.addActionListener(e -> {

            try {

                Member member = new Member();

                member.setMemberName(txtName.getText());

                member.setAge(Integer.parseInt(txtAge.getText()));

                member.setGender(txtGender.getText());

                member.setPhone(txtPhone.getText());

                member.setAddress(txtAddress.getText());

                member.setUsername(txtUsername.getText());

                member.setPassword(txtPassword.getText());

                member.setPlanId(Integer.parseInt(txtPlanId.getText()));

                member.setTrainerId(Integer.parseInt(txtTrainerId.getText()));

                MemberDAO dao = new MemberDAO();

                if(dao.addMember(member))
                {

                    JOptionPane.showMessageDialog(this,
                            "Member Added Successfully");

                }
                else
                {

                    JOptionPane.showMessageDialog(this,
                            "Failed to Add Member");

                }

            }

            catch(Exception ex){

                ex.printStackTrace();

            }

        });

        setVisible(true);

    }

    private void styleLabel(JLabel label) {
        label.setForeground(GRAY_TEXT);
        label.setFont(new Font("Arial", Font.PLAIN, 13));
    }

    private void styleField(JTextField field) {
        field.setBackground(FIELD_DARK);
        field.setForeground(WHITE);
        field.setCaretColor(WHITE);
        field.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(LINE, 1),
                new EmptyBorder(2,6,2,6)));
    }

    private void styleButton(JButton btn, boolean filled) {
        btn.setFont(new Font("Arial", Font.BOLD, 13));
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