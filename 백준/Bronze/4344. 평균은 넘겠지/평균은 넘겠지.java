import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] arr;
		int testcase = Integer.parseInt(br.readLine());
		
		for(int i=0;i<testcase;i++) {
			
			st = new StringTokenizer(br.readLine()," ");
			
			int N = Integer.parseInt(st.nextToken());//학생수
			arr = new int[N];
			
			double sum = 0;
			
			for(int j=0;j<N;j++) {
				
				int val = Integer.parseInt(st.nextToken());//학생의 성적
				arr[j] = val;
				sum += val;
			}
			
			double avg = (sum / N);//학생 평균
			double count = 0;//평균 넘는 학생의 수
			
			for(int j=0;j<N;j++) {
				if(arr[j]>avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
	}
}