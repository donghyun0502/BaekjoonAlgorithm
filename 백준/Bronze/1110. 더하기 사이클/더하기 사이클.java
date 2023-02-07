import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int copy = N;
		int cnt = 0;
		
		//주어진 수 N , 새로운 수 T
		while(true) {
			    //T의 십의 자릿수    N의 각 자릿수의 합, T의 일의 자릿수
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
			
			if(copy == N) {
				break;
			}
		}
		System.out.println(cnt);
	}
}