import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int sum = A+B;
		int minus = A-B;
		int multiply = A*B;
		int division = A/B;
		int remainder = A%B;
		
		System.out.println(sum);
		System.out.println(minus);
		System.out.println(multiply);
		System.out.println(division);
		System.out.println(remainder);
	}
}