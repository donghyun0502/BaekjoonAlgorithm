import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // 정수의 개수
		int[] A = new int[N]; 
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<A.length;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		int v = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i=0;i<A.length;i++) {
			if(A[i]==v) {
				cnt++;
			}
		}
		System.out.println(cnt);
		br.close();
	}
}