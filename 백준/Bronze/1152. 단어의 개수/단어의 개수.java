import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		
		StringTokenizer st = new StringTokenizer(N," ");
		
		System.out.println(st.countTokens());
	}
}