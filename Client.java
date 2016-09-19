package day12pack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
Socket clientsocket;
BufferedReader in,keyin;
PrintWriter out;

public Client()
{

	try
	{
	while(true)
	{
	clientsocket=new Socket("localhost",2000);
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
		new Client();
	
	}
}
