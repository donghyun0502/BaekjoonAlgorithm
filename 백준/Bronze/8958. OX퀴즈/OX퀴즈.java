import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int A = Integer.parseInt(br.readLine());
		String[] arr = new String[A];
		
		for(int i=0;i<A;i++) {
			arr[i] = br.readLine();
		}
		
		for(int i=0;i<A;i++) {	
			
			int score = 0;
			int cnt = 0;
			
			for(int j=0;j<arr[i].length();j++) {
				
				if(arr[i].charAt(j) == 'O') {
					cnt++;
				}else {
					cnt = 0;
				}
				score += cnt;
			}
			sb.append(score).append("\n");
		}
		System.out.println(sb);
	}
}