package string;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.util.*;
public class chat_1 {
	public static void main(String args[]) throws Exception
	{
		
		ServerSocket ss=new ServerSocket(4444);
		Socket s=ss.accept();
		th t=new th();
		t.start();
		DataInputStream dis=new DataInputStream(s.getInputStream());
		while(true)
		{
		System.out.println(dis.readUTF());
		}
	} 
}
class th extends Thread
{
	public void run()
	{
		try
		{
			Scanner s1=new Scanner(System.in);
			//String s=new String;
		Socket so=new Socket("192.168.43.134",1111);
		DataOutputStream dos=new DataOutputStream(so.getOutputStream());
		while(true)
		{
		dos.writeUTF(s1.nextLine());
		}
		}
		catch(Exception e)
		{}
		}
	}
