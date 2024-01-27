import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int arr[] = new int[N];
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int cnt=0;
		int v = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			if(arr[i]==v)
				cnt++;
		}
		System.out.println(cnt);
	}
}