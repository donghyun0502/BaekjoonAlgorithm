import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int Testcase = Integer.parseInt(br.readLine());
		
		for(int i=0;i<Testcase;i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			
			char[] arr = S.toCharArray();
			
			for(char chr : arr) {
				for(int j=0;j<R;j++) {
					sb.append(chr);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}