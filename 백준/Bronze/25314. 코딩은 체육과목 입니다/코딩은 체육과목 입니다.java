import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int M = N/4;
		for(int i=0;i<M;i++) {
			sb.append("long ");
		}
		sb.append("int");
		
		System.out.println(sb.toString());
	}
}