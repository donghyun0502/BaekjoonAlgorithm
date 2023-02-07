import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int[] A = new int[9];
		
		for(int i=0;i<A.length;i++) {	
			A[i] = Integer.parseInt(br.readLine());
		}

		int cnt = 0;
		int max = A[0];
		
		for(int i=0;i<A.length;i++) {
			if(A[i]>max) {
				max = A[i];
			}
		}
		for(int i=0;i<A.length;i++) {
			if(A[i]!=max) {
				cnt++;
			}else {
				cnt++;
				break;
			}
		}
		
		System.out.println(max);
		System.out.println(cnt);
	}
}