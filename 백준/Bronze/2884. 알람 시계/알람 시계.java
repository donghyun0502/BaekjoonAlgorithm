import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int Hour = Integer.parseInt(st.nextToken());
		int Minute = Integer.parseInt(st.nextToken());
		
		if(Minute < 45) {
			Hour = Hour-1;
			Minute = 60-(45-Minute);
		}else {
			Minute = Minute-45;
		}
		
		if(Hour<0) {
			Hour=23;
		}
		System.out.println(Hour+" "+Minute);
	}
}