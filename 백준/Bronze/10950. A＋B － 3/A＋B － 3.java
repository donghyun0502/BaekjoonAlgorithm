import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			//for문 안에서 여러번 반복해서 사용하기 때문에 for문 밖에서
			//StringTokenizer를 선언하면 NumberFormatException 에러가 발생함
			st = new StringTokenizer(br.readLine()," ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			sb.append(A+B).append("\n");
		}
		System.out.println(sb);
	}
}