import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine()); //정수 개수
		int[] A = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<A.length;i++){
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		
		System.out.println(A[0]+" "+A[N-1]);
	}
}