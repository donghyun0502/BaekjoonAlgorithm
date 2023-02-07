import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int[] n = new int[31];
		
		for(int i=1;i<29;i++) {
			int submit = Integer.parseInt(br.readLine());
			n[submit] = 1;
		}
		
		for(int i=1;i<n.length;i++) {
			if(n[i] != 1)
				System.out.println(i);
		}
	}
}