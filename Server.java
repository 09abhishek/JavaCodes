package day12pack;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
ServerSocket ss;
Socket clientsocket;
BufferedReader in,keyin;PrintWriter out;
public Server(){
	try{
		int portnumber=2000;
		
		ss=new ServerSocket(portnumber);
		
		while(true)
		{		
		System.out.println("server ready for accepting client....");
		clientsocket=ss.accept();
		in=new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
		keyin=new BufferedReader(new InputStreamReader(System.in));
		out=new PrintWriter(new OutputStreamWriter(clientsocket.getOutputStream()),true);
		System.out.println("enter message for client..:");
		String msg=keyin.readLine();
		out.println(msg);
		msg=in.readLine();
		System.out.println("message from  client...:"+msg);
		}
}
catch(Exception e)
	{
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	new Server();
}
}


  
