import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcase = Integer.parseInt(br.readLine());
		String arr[] = new String[testcase];
		
		for(int i=0;i<testcase;i++) {
			arr[i] = br.readLine();
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<testcase;i++) {
			sb.append(arr[i].charAt(0)).append(arr[i].charAt(arr[i].length()-1)).append("\n");
		}
		System.out.println(sb);
	}
}