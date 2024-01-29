import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		char[] arr = S.toCharArray();
		
		int I = Integer.parseInt(br.readLine());
		for(int i=I;i<=I;i++) {
			System.out.println(arr[i-1]);
		}
	}
}