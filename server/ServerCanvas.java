import java.net.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class ServerCanvas {
    // DataOutputStream dataOutputStream = null;
    // DataInputStream dataInputStream = null;
public static String getFileExtension(String filename)
{
    int i = filename.lastIndexOf('.');
    if(i>0)
    {
        return filename.substring(i+1);
    }else{
        return "No Extension Found";
    }
}
    public static void main(String[] args) throws Exception {
        ServerSocket ss=null;
        // BufferedReader get=null;
        Socket cs=null;
        // PrintWriter put=null;
        // while(true){
            try
            { 
                ss=new ServerSocket(5000);
                // s=new Socket("local host",5000);
                // ss=new Socket();
                cs=ss.accept();
                System.out.println("Connected");
                while(true)
                {
                DataInputStream dis = new DataInputStream(cs.getInputStream());
                    // char[] ch = new char[100];
                    // String ch=null;
                // FileReader fr = new FileReader("FinalLogin.txt");
                // fr.read(ch);
                // fr.close();
                // String filefolder = new String(ch);
                // System.out.pi
                int filenamelength = dis.readInt();
                if(filenamelength >0)
                {
                    byte[] filenamebyte = new byte[filenamelength];
                    dis.readFully(filenamebyte,0,filenamebyte.length);
                    
                    String filename = new String(filenamebyte);
                     int filecontentlength = dis.readInt();
                     if(filecontentlength>0)
                     {
                        byte[] filecontentbytes = new byte[filecontentlength];
                        dis.readFully(filecontentbytes,0,filecontentlength);
                        File filetodownload = new File(filename);
                        try{
                            FileOutputStream fos = new FileOutputStream(filetodownload);
                            // byte[] filedata;
                            fos.write(filecontentbytes);
                            System.out.println("File received");
                            fos.close();
                        }catch(Exception asd){}
                        // if (getFileExtension(filename).equalsIgnoreCase("txt"))
                        // {

                        // }

                     }
                }
            }
                // get=new BufferedReader(new InputStreamReader(cs.getInputStream()));
                // put=new PrintWriter(cs.getOutputStream(),true);
            }  
            catch(Exception e)
            {
                System.exit(0);
            }
            // File f1=new File("Desktop/new");
            // String u,f;
            // FileOutputStream  fs=new FileOutputStream(f1);
            // while((u=get.readLine())!=null)
            // { 
            //     byte jj[]=u.getBytes();
            //     fs.write(jj);
            // }
            // fs.close();
            
        // }
    }
}