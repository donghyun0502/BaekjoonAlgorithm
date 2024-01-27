import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		
		if(X%4==0 && X%100!=0 || X%400==0) {
			System.out.println("1");
		}else
		{
			System.out.println("0");
		}
		
	}
}