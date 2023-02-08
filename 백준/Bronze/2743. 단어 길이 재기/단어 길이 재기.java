import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String A = br.readLine();
		String[] B = A.split("");
		int sum = 0;
		
		for(int i=0;i<A.length();i++) {
			sum += 1;
		}
		System.out.println(sum);
	}
}