import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String A = br.readLine();
		
		char[] change = A.toCharArray();
		
		for(int i=0;i<change.length;i++) {
			
			if(change[i]>='A' && change[i]<='Z') {
				change[i] = (char)(change[i]+32);
			}else if(change[i]>='a' && change[i]<='z') {
				change[i] = (char)(change[i]-32);
			}
		}
		System.out.println(change);
	}
}