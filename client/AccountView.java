//package MiniCanvas;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
// import java.lang.*;
import java.net.*;

class AccountView extends JFrame
{
    JMenuBar mb1;
    JMenu m1,m2,m3;
    JMenuItem mi1,mi2,mi3;
    JFrame j2;
    
    // AccountController a1= new AccountController(this);
    DashboardController a1 = new DashboardController(this);

    AccountView(DashboardController d)
    {
        j2 = new JFrame("MY ACCOUNT");
        // super("MY ACCOUNT");
        j2.setLayout(null);
        j2.setBounds(0,0,800,800);
        
        ImageIcon screen = new ImageIcon("accoutpic.png");
        JLabel back_screen = new JLabel(screen);
        // back_screen.setBounds(0,0,screen.getIconWidth(),screen.getIconHeight());
        back_screen.setBounds(0,0,800,800);
        j2.add(back_screen);

        m1= new JMenu("PROFILE");
        // m2 = new JMenu("FILES");
        m3= new JMenu("SETTING");
        // ImageIcon img = new ImageIcon("icon-setting.PNG");
        // m3.setIconImage(img.getImage());
        // JMenuItem newgame = new JMenuItem("New");
        // m3.add(newgame);
        // m3.setIcon(new ImageIcon("icon-setting.PNG"));


        mi1= new JMenuItem("VIEW PROFILE");
        // mi2= new JMenuItem("SUBMISSIONS");
        mi3= new JMenuItem("EDIT SETTING");
        mb1 = new JMenuBar();

        Font f3 = new Font("SANS_SERIF",Font.BOLD,25);
        ImageIcon img = new ImageIcon("icon-account.PNG");
        j2.setIconImage(img.getImage());
        // ImageIcon screen = new ImageIcon("icon-account.jpg");
        // back_screen = new JLabel(screen);
        // back_screen.setBounds(0,0,screenWidth,screenHeight);
        // j1.add(back_screen);

        m1.setFont(f3);
        // m2.setFont(f3);
        m3.setFont(f3);
        mi1.setFont(f3);
        // mi2.setFont(f3);
        mi3.setFont(f3);

        m1.setPreferredSize(new Dimension(250,50));
        // m2.setPreferredSize(new Dimension(250,50));
        m3.setPreferredSize(new Dimension(250,50));
        mi1.setPreferredSize(new Dimension(250,50));
        // mi2.setPreferredSize(new Dimension(250,50));
        mi3.setPreferredSize(new Dimension(250,50));

        m1.setForeground(Color.white);
        // m2.setForeground(Color.white);
        m3.setForeground(Color.white);

        setJMenuBar(mb1);
        
        m1.add(mi1);
        // m2.add(mi2);
        m3.add(mi3);

        mb1.add(m1);
        // mb1.add(m2);
        mb1.add(m3);
        

        j2.setAlwaysOnTop(true);


        j2.setJMenuBar(mb1);
        j2.setVisible(true);
        mi1.addActionListener(a1);
        mi3.addActionListener(a1);
        j2.setResizable(false);
        // mi2.addActionListener(a1);
        // addWindowListener(new WindowAdapter()
        // {
        //     public void windowClosing(WindowEvent we)
        //     {
        //         System.exit(0);
        //     }
        // });
    }
    // public static void main(String args[]) throws Exception
	// {
    //     AccountView mf = new DashboardView();
	// 	mf.setVisible(true);
    // }
}