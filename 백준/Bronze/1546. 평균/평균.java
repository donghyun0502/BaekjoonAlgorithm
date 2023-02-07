import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
			
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<A.length;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		
		double max = A[N-1];
		double sum = 0;
		
		for(int i=0;i<A.length;i++) {
			sum += A[i]/max*100;
		}
		sum = sum/N;
	
		System.out.println(sum);
	}
}