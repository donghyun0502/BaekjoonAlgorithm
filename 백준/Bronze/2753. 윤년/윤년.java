import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int year(int y) {
		return(y%4==0 && y%100!=0 || y%400==0 ? 1:0);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int y = Integer.parseInt(br.readLine());
		
		System.out.println(year(y));
	}
}