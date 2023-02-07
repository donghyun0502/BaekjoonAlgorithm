import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int[] A = new int[10];
		
		for(int i=0;i<A.length;i++) {
			A[i] = Integer.parseInt(br.readLine()) % 42;
		}
	
		int cnt = 0;
		
		for(int i=0;i<A.length;i++) {
			int tmp = 0;
			for(int j=i+1;j<A.length;j++) {
				if(A[i]==A[j]) {
					tmp++;
				}
			}
			if(tmp == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}