package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket stk = new Socket("192.168.1.43",2000);  

		BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
		PrintStream ps = new PrintStream(stk.getOutputStream());
		
		String msg;
		
		do
		{
			msg = keyb.readLine();
			
			ps.println(msg);
			msg=br.readLine();
			System.out.println("From Server: "+msg);
		}while(!msg.equals("dne"));
		
		stk.close();
	}
	

}
