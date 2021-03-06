package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseEcho {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(2000);  
		Socket stk = ss.accept();

		BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
		PrintStream ps = new PrintStream(stk.getOutputStream());
		
		String msg;
		StringBuilder sb ;
		do
		{
			msg = br.readLine();
			sb = new StringBuilder(msg);
			msg = sb.reverse().toString();
			
			ps.println(msg);
		}while(!msg.equals("dne"));
		
		stk.close();
		ss.close();
	}

}
