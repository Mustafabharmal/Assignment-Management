// package MiniCanvas;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
// import java.lang.*;
import java.net.*;
import java.util.concurrent.BlockingQueue;

class CourseView extends JFrame
{
    JMenuBar mb1;
    JMenu m1,m2,m3;
    JMenuItem mi1,mi2,mi3,mi4;
    JMenuItem m2i;
    // CourseController cc= new CourseController(this);
    DataOutputStream dos;
    DataInputStream dis;
    // InputStreamReader isr;
    DashboardController cc = new DashboardController(this);
    JFrame j3;
    CourseView(DashboardController d)
    {
        j3 = new JFrame("MY COURSE");
        // super("MY COURSE");
        j3.setLayout(null);
        j3.setBounds(0,0,800,800);

        ImageIcon screen = new ImageIcon("coursepic.png");
        JLabel back_screen = new JLabel(screen);
        // back_screen.setBounds(0,0,screen.getIconWidth(),screen.getIconHeight());
        back_screen.setBounds(0,0,800,800);
        j3.add(back_screen);


        ImageIcon img = new ImageIcon("icon-course.PNG");
        j3.setIconImage(img.getImage());
        // UIManager.put("JFrame.background", Color.CYAN);
        // setBackground();
        try
        {
            //we will change host code for the requirement of the submission 
            Socket ss=new Socket("localhost",5000);
            dos=new DataOutputStream(ss.getOutputStream());
            dis=new DataInputStream(ss.getInputStream());
            // isr =new InputStreamReader(ss.getInputStream());
        }
        catch(Exception aa){}

        m1= new JMenu("ALL COURSE");
        m2 = new JMenu("FILES");

        m2i = new JMenuItem("SUBMISSIONS");

        mi1= new JMenuItem("DIGITAL ELECTRONICS");
        mi2= new JMenuItem("OOP");
        mi3= new JMenuItem("MAVC");
        mi4= new JMenuItem("Back to Dashboard");

        mb1 = new JMenuBar();

        setJMenuBar(mb1);
        
        Font f4 = new Font("SANS_SERIF",Font.BOLD,25);
        m1.setFont(f4);
        m2.setFont(f4);
    
        m2i.setFont(f4);

        mi1.setFont(f4);
        mi2.setFont(f4);
        mi3.setFont(f4);
        mi4.setFont(f4);

        m1.setPreferredSize(new Dimension(250,50));
        m2.setPreferredSize(new Dimension(250,50));

        mi1.setPreferredSize(new Dimension(250,50));
        mi2.setPreferredSize(new Dimension(250,50));
        mi3.setPreferredSize(new Dimension(250,50));
        mi4.setPreferredSize(new Dimension(250,50));

        m2i.setPreferredSize(new Dimension(250,50));

        m1.setForeground(Color.white);
        m2.setForeground(Color.white);

        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi4);

        m2.add(m2i);

        mb1.add(m1);
        mb1.add(m2);
        mb1.add(m1);

        j3.setAlwaysOnTop(true);
        j3.setFocusable(true);

        j3.setJMenuBar(mb1);

        mi1.addActionListener(cc);
        mi2.addActionListener(cc);
        mi3.addActionListener(cc);
        mi4.addActionListener(cc);

        m2i.addActionListener(cc);
        
        // addWindowListener(new WindowAdapter()
        // {
        //     public void windowClosing(WindowEvent we)
        //     {
        //         System.exit(0);
        //     }
        // });
    }

}