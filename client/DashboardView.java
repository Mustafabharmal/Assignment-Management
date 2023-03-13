//package MiniCanvas;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

class DashboardView extends JFrame
{
    JLabel userLabel,passwordLabel;
    JButton blogin,breset;
    JTextField t1;
    JMenuBar mb1;
    JMenu m1;
    JPasswordField t2;
    JMenuItem mi1,mi2,mi3;
    JFrame j1;
    AccountView av;
    CourseView cv;
    // AccountController a1= new AccountController(this);
    DashboardController d1= new DashboardController(this);
    JLabel back_screen;

    DashboardView() 
    {
        j1 = new JFrame("Login");
        // super("Login");
        j1.setLayout(null);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // Image img = Toolkit.getDefaultToolkit().getImage("E:\\WALLPAPER\\1");    
        // this.setContentPane(new JPanel() {
        //     @Override
        //     public void paintComponent(Graphics g) {
        //        super.paintComponent(g);
        //        g.drawImage(img, 0, 0, null);
        //     }
        //  });
        //  pack();
        // setVisible(true);
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        j1.setBounds(0,0,screenWidth+5,screenHeight+5);

        ImageIcon screen = new ImageIcon("dashboardpic.png");
        back_screen = new JLabel(screen);
        // back_screen.setBounds(0,0,screen.getIconWidth(),screen.getIconHeight());
        back_screen.setBounds(0,0,screenWidth,screenHeight);
        j1.add(back_screen);


        t1=new JTextField();
        t2=new JPasswordField();
        blogin= new JButton("LOGIN");
        breset= new JButton("RESET");

        userLabel = new JLabel("USERNAME");
        passwordLabel = new JLabel("PASSWORD");

        back_screen.add(t1);
        back_screen.add(t2);
        back_screen.add(blogin);
        back_screen.add(breset);
        back_screen.add(userLabel);
        back_screen.add(passwordLabel);

        t1.setBounds(350, 250, 350, 60);
        t2.setBounds(350, 350, 350, 60);
        userLabel.setBounds(50, 250, 250, 60);
        passwordLabel.setBounds(50, 350, 250, 60);
        blogin.setBounds(100, 450, 200, 60);
        breset.setBounds(350, 450, 200, 60);

        Font f1 = new Font("SANS_SERIF",Font.BOLD,35);

        t1.setFont(f1);
        t2.setFont(f1);
        userLabel.setFont(f1);
        passwordLabel.setFont(f1);
        blogin.setFont(f1);
        breset.setFont(f1);

        // JLabel label = new JLabel ("Text Color: White");
        userLabel.setForeground (Color.black);
        passwordLabel.setForeground (Color.black);

        UIManager.put("MenuBar.background", Color.black);

        // JMenuBar mb1 = new JMenuBar();
        // mb1.setPreferredSize(new Dimension(100,50));
        
        mi1= new JMenuItem("ACCOUNT");
        mi2= new JMenuItem("COURSE");
        mi3= new JMenuItem("LOG OUT");

        m1= new JMenu("DASHBOARD");
        ImageIcon img = new ImageIcon("icon-canvas.PNG");
        j1.setIconImage(img.getImage());


        mb1= new JMenuBar();
        mb1.setPreferredSize(new Dimension(50,50));
        m1.setFont(f1);
        m1.setForeground(Color.white);
        // mb1.setFont(font);


        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);

        mi1.setPreferredSize(new Dimension(250,50));
        mi2.setPreferredSize(new Dimension(250,50));
        mi3.setPreferredSize(new Dimension(250,50));

        Font f2 = new Font("SANS_SERIF",Font.BOLD,25);
        mi1.setFont(f2);
        mi2.setFont(f2);
        mi3.setFont(f2);

        mb1.add(m1);
        j1.setJMenuBar(mb1);
        m1.setEnabled(false);

        t2.setEchoChar('*');

        mi1.addActionListener(d1);
        mi2.addActionListener(d1);
        mi3.addActionListener(d1);

        blogin.addActionListener(d1);
        breset.addActionListener(d1);

        j1.setVisible(true);

        j1.setResizable(false);

        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // addWindowListener(new WindowAdapter()
        // {
        //     public void windowClosing(WindowEvent we)
        //     {
        //         System.exit(0);
        //     }
        // });
    }
    public static void main(String args[])throws IOException
        {
            new DashboardView();
            // DashboardView mf = new DashboardView();
            //     mf.setVisible(true);
            //     mf.setResizable(false);

        }

}