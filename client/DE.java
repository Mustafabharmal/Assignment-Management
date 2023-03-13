import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

class DE extends JFrame
{
    JFrame j4;
    // DashboardController cc = new DashboardController(this);
    DE(DashboardController d)
    {
        j4 = new JFrame("Digital Electronics");
        j4.setLayout(null);
        ImageIcon img = new ImageIcon("icon-de.PNG");
        j4.setIconImage(img.getImage());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        j4.setBounds(0,0,screenWidth+5,screenHeight+5);

        ImageIcon screen = new ImageIcon("depic.png");
        JLabel back_screen = new JLabel(screen);
        // back_screen.setBounds(0,0,screen.getIconWidth(),screen.getIconHeight());
        back_screen.setBounds(0,0,screenWidth,screenHeight);
        j4.add(back_screen);

        j4.setVisible(true);
        j4.setAlwaysOnTop(true);
        j4.setResizable(false);

    }
}