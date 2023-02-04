import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int soldiers[] = {1,1,2,2,2,8}; //6개의 초기배열 생성
		int input[] = new int[6]; //6개의 인풋값 입력
		
		//입력받은 input의 길이만큼 for문 반복
		for(int i=0;i<input.length;i++) {
			input[i] = Integer.parseInt(st.nextToken());
			System.out.print(soldiers[i]-input[i]+" ");
		}
	}
}