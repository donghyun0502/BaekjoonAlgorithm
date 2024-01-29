import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++) {
			String chr = br.readLine();
			char[] arr = chr.toCharArray();
			
			sb.append(arr[0]).append(arr[arr.length-1]).append("\n");
		}
		System.out.println(sb);
	}
}
