import java.util.Scanner;

public class Main {
	
	static int yearresult(int y) {
		return(y%4==0 && y%100!=0 || y%400==0 ? 1 : 0);
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		System.out.println(yearresult(year));
	}
}