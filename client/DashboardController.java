
//package MiniCanvas;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
// import java.lang.*;
import java.net.*;
import java.util.*;

class DashboardController implements ActionListener {
    myprofile me;

    DashboardController(myprofile m) {
        this.me = m;
    }

    MAVC mv;

    DashboardController(MAVC m) {
        this.mv = m;
    }

    OOP op;

    DashboardController(OOP o) {
        this.op = o;
    }

    DE de;

    DashboardController(DE d) {
        this.de = d;
    }

    DashboardView d1;

    DashboardController(DashboardView d) {
        this.d1 = d;
    }

    CourseView cv;

    DashboardController(CourseView c) {
        this.cv = c;
    }

    AccountView a1;

    DashboardController(AccountView a) {
        this.a1 = a;
    }
    // CourseView cv = new CourseView(this);

    // AccountView a1 = new AccountView(this);
    public void actionPerformed(ActionEvent e) {
        // System.out.println(e.getActionCommand());
        if (e.getActionCommand().equals("ACCOUNT")) {
            AccountView a = new AccountView(this);
            a.j2.setVisible(true);
            d1.av = a;
            // a.setLocationRelativeTo(this.d1);
            // Thread.sleep(1500);
            // a.setAlwaysOnTop(true);

        }
        if (e.getActionCommand().equals("COURSE")) {
            CourseView c = new CourseView(this);
            c.j3.setVisible(true);
            d1.cv = c;  
        }
        if (e.getActionCommand().equals("LOG OUT")) {
            this.d1.j1.setVisible(true);
            d1.t1.setEditable(true);
            d1.t2.setEditable(true);
            d1.userLabel.setEnabled(true);
            d1.passwordLabel.setEnabled(true);
            d1.blogin.setEnabled(true);
            d1.breset.setEnabled(true);
            d1.m1.setEnabled(false);
            // a1.setEnabled(false);
            // a1.dispose();
            // cv.setEnabled(false);
            // cv.dispose();
            // this.a1.dispose();
            // AccountView a= new AccountView();
            // a.dispose();
            // d1.setEnabled(false);
            // CourseView c = new CourseView(this);
            // c.setEnabled(false);
            d1.cv.j3.setVisible(false);
            // this.cv.dispose();
            // AccountView a= new AccountView(this);
            d1.av.j2.setVisible(false);
            // this.a1.dispose();
        }

        if (e.getActionCommand().equals("LOGIN")) {
            // System.out.println("hehe");

            // char ch[] = new char[400];

            try {
                String userText = d1.t1.getText();
                char[] pass = d1.t2.getPassword();
                String pswdText = String.valueOf(pass);
                int i = 0;
                FileReader fr = new FileReader("DataCanvas.txt");
                // fr.read(ch);
                // fr.close();
                BufferedReader br = new BufferedReader(fr);
                String s1;
                // System.out.println("lol ");
                while ((s1 = br.readLine()) != null) {
                    String[] st = s1.split("-");
                    String name = st[0];
                    String passwor = st[1];
                    // System.out.println("hehehe");

                    if (userText.equalsIgnoreCase(name) && pswdText.equalsIgnoreCase(passwor)) {
                        i = i + 1;
                        // break;
                    }

                }
                if (i > 0) {
                    JOptionPane.showMessageDialog(this.d1, "Login Successful", "Status",
                            JOptionPane.INFORMATION_MESSAGE);
                    d1.j1.setTitle("Mini Canvas");
                    // String userfinal = d1.t1.getText();
                    // try{
                    // FileOutputSt);
                    // FileWriter fw = new FileWriter("Finaluser.txt");
                    // fw.write(userfinal);
                    // fw.close();
                    // FileWriter fw1 = new FileWriter("Finalpassword.txt");
                    // fw1.write(pswdText);
                    // fw1.close();
                    // }catch(Exception ase){}
                    d1.t1.setText("");
                    d1.t2.setText("");
                    d1.t1.setEditable(false);
                    d1.t2.setEditable(false);
                    d1.userLabel.setEnabled(false);
                    d1.passwordLabel.setEnabled(false);
                    d1.blogin.setEnabled(false);
                    d1.breset.setEnabled(false);
                    d1.m1.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(this.d1, "Invalid Username or Password", "Status",
                            JOptionPane.ERROR_MESSAGE);
                    d1.t1.setText("");
                    d1.t2.setText("");
                    // break;
                }
            } catch (Exception aeb) {
            }

        }
        if (e.getActionCommand().equals("RESET")) {
            d1.t1.setText("");
            d1.t2.setText("");
        }

        if (e.getActionCommand().equals("DIGITAL ELECTRONICS")) {
            // cv.setAlwaysOnTop(false);
            DE d = new DE(this);
            d.j4.setVisible(true);
            // this.cv.setVisible(true);
            // ImageIcon screen = new ImageIcon("dashboardpic.png");
            // JLabel back_screen = new JLabel(screen);
            // cv.j3.add(back_screen);

        }
        if (e.getActionCommand().equals("OOP")) {
            // this.cv.setVisible(true);
            OOP o = new OOP(this);
            o.j5.setVisible(true);
        }
        if (e.getActionCommand().equals("MAVC")) {
            MAVC mb = new MAVC(this);
            mb.j6.setVisible(true);
            // this.cv.setVisible(true);
        }
        if (e.getActionCommand().equals("Back to Dashboard")) {
            this.cv.j3.dispose();
            // this.a1.dispose();
        }

        if (e.getActionCommand().equals("VIEW PROFILE")) {
            myprofile m = new myprofile(this);
            m.j7.setVisible(true);

            // this.a1.setVisible(true);

            try {
                char[] ch = new char[50];
                FileReader fr = new FileReader("transferedfiles.txt");
                fr.read(ch);
                String chst = new String(ch);
                m.l1.setText(chst);
                m.l1.setVisible(true);
            } catch (Exception aere) {
            }

            // JLabel l2 = new JLabel(ch1st);

            // JLabel l1 = new JLabel(chst);
            // l1.setBounds(100,100,70,70);
            // a1.back_screen.add(l1);
            // char[] ch1 = new char[50];
            // FileReader fr1 = new FileReader("Finalpassword.txt");
            // fr1.read(ch1);

            // String ch1st = new String(ch1);
            // JLabel l2 = new JLabel(ch1st);
            // l2.setBounds(100,200,70,70);
            // a1.back_screen.add(l2);
            // fr1.close();
            // fr.close();
            // }catch(Exception aexo){System.out.println(aexo);}

        }
        if (e.getActionCommand().equals("SUBMISSIONS")) {
            cv.j3.setAlwaysOnTop(false);

            // this.a1.setVisible(true);
            // DataOutputStream d1;

            // a1.j2.setAlwaysOnTop(false);
            // System.out.println("hehe");
            FileDialog fileDialog = new FileDialog(this.cv, "TO SUBMIT", FileDialog.LOAD);
            fileDialog.setVisible(true);

            // PrintWriter put=new PrintWriter(cv.dos,true);
            // BufferedReader st=new BufferedReader(cv.isr);

            String path = fileDialog.getDirectory() + fileDialog.getFile();
            try {
                FileWriter fw3 = new FileWriter("transferedfiles.txt");
                fw3.write(path);
                fw3.close();
            } catch (Exception aaeds) {
            }
            if (path != null) {
                File filetosend = new File(path);
                // File[] filetosend = new File[1];
                try {
                    // filetosend[0] = new File(path);
                    FileInputStream myfile = new FileInputStream(filetosend.getAbsolutePath());
                    String filename = filetosend.getName();

                    byte[] filenamebyte = filename.getBytes();
                    byte[] filecontentbytes = new byte[(int) filetosend.length()];
                    myfile.read(filecontentbytes);

                    // cv.dos.writeInt(userfinal.length);
                    // cv.dos.write(userfinal);

                    cv.dos.writeInt(filenamebyte.length);
                    cv.dos.write(filenamebyte);

                    cv.dos.writeInt(filecontentbytes.length);
                    cv.dos.write(filecontentbytes);
                } catch (Exception aexs) {
                }
            }
            // if (path != null)
            // {
            // try{
            // cv.j3.setTitle("SUBMISSIONS"+fileDialog.getFile());
            // // int bytes = 0;
            // File f = new File(path);

            // BufferedReader d=new BufferedReader(new FileReader(f));
            // String line;
            // while((line=d.readLine())!=null)
            // {
            // put.write(line);
            // put.flush();
            // }
            // d.close();
            // }catch(Exception aex){}
            // }
            // FileInputStream fileInputStream = new FileInputStream(f);

            // cv.dos.writeLong(f.length());
            // byte[] buffer = new byte[4*1024];
            // while((bytes=fileInputStream.read(buffer))!=-1)
            // {
            // cv.dos.write(buffer,0,bytes);
            // cv.dos.flush();
            // }
            // fileInputStream.close();
            // }
            // catch(Exception aex){}
            // }

        }
        if (e.getActionCommand().equals("EDIT SETTING")) {
            // this.a1.setVisible(true);
        }
    }
}