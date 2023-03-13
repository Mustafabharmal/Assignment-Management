import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

class MAVC extends JFrame
{
    JFrame j6;
    // DashboardController cc = new DashboardController(this);
    MAVC(DashboardController d)
    {
        j6 = new JFrame("MAVC");
        j6.setLayout(null);
        ImageIcon img = new ImageIcon("icon-mavc.jpg");
        j6.setIconImage(img.getImage());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        j6.setBounds(0,0,screenWidth+5,screenHeight+5);

        ImageIcon screen = new ImageIcon("mavcpic.png");
        JLabel back_screen = new JLabel(screen);
        // back_screen.setBounds(0,0,screen.getIconWidth(),screen.getIconHeight());
        back_screen.setBounds(0,0,screenWidth,screenHeight);
        j6.add(back_screen);

        j6.setVisible(true);
        j6.setAlwaysOnTop(true);
        j6.setResizable(false);

    }
}