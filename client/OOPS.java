import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

class OOP extends JFrame
{
    JFrame j5;
    // DashboardController cc = new DashboardController(this);
    OOP(DashboardController d)
    {
        j5 = new JFrame("OOPS");
        j5.setLayout(null);
        ImageIcon img = new ImageIcon("icon-oop.jpg");
        j5.setIconImage(img.getImage());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        j5.setBounds(0,0,screenWidth+5,screenHeight+5);

        ImageIcon screen = new ImageIcon("oopspic.png");
        JLabel back_screen = new JLabel(screen);
        // back_screen.setBounds(0,0,screen.getIconWidth(),screen.getIconHeight());
        back_screen.setBounds(0,0,screenWidth,screenHeight);
        j5.add(back_screen);

        j5.setVisible(true);
        j5.setAlwaysOnTop(true);
        j5.setResizable(false);

    }
}