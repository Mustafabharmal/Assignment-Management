import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

class myprofile extends JFrame
{
    JFrame j7;
    JLabel l1,l2,l3,l4;

    DashboardController cc = new DashboardController(this);
    myprofile(DashboardController d)
    {
        j7 = new JFrame("Profile");
        j7.setLayout(null);
        ImageIcon img = new ImageIcon("icon-de.PNG");
        j7.setIconImage(img.getImage());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        j7.setBounds(0,0,screenWidth+5,screenHeight+5);

        ImageIcon screen = new ImageIcon("profilepic.png");
        JLabel back_screen = new JLabel(screen);
        // back_screen.setBounds(0,0,screen.getIconWidth(),screen.getIconHeight());
        back_screen.setBounds(0,0,screenWidth,screenHeight);
        j7.add(back_screen);
        l1 = new JLabel();
        l1.setBounds(400,400,500,150);
        back_screen.add(l1);
        l1.setVisible(false);

        j7.setVisible(true);
        j7.setAlwaysOnTop(true);
        j7.setResizable(false);

    }
}