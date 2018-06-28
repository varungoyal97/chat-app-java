package string;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class server {
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss=new ServerSocket(4444);
		Socket s=ss.accept();
		DataInputStream dis=new DataInputStream(s.getInputStream());
		System.out.println(dis.readUTF());
	} 
}
