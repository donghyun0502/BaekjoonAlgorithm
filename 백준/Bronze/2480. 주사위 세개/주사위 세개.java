import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int dice1 = Integer.parseInt(st.nextToken());
		int dice2 = Integer.parseInt(st.nextToken());
		int dice3 = Integer.parseInt(st.nextToken());
		
		if(dice1==dice2 && dice2==dice3) {
				System.out.println(10000+dice1*1000);
		}
		
		if(dice1==dice2 && dice1!=dice3) {
			System.out.println(1000+dice1*100);
		}else if(dice2==dice3 && dice1!=dice2) {
			System.out.println(1000+dice2*100);
		}else if(dice1==dice3 && dice1!=dice2) {
			System.out.println(1000+dice1*100);
		}
				
		if(dice1!=dice2 && dice2!=dice3 && dice1!=dice3) {
					int maxdice;
					
					if(dice1>dice2) {
						maxdice=dice1;
					}else {
						maxdice=dice2;
					}
					
					if(dice3>maxdice) {
						maxdice=dice3;
						System.out.println(maxdice*100);
					}else {
						System.out.println(maxdice*100);
					}	
		}
	}
}