import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++) {
			
			String type = sc.next();
			
			switch (type) {
		
			case "push":
				stack.push(sc.nextInt());
				break;
				
			case "pop":
				if(stack.isEmpty())
					sb.append("-1").append("\n");
				else{
					sb.append(stack.peek()).append("\n");
					stack.pop();
				}
				break;
				
			case "size":
				sb.append(stack.size()).append("\n");
				break;
                    
			case "empty":
				if(stack.isEmpty())
					sb.append("1").append("\n");
				else
					sb.append("0").append("\n");
				break;
				
			case "top":
				if(stack.isEmpty())
					sb.append("-1").append("\n");
				else
					sb.append(stack.peek()).append("\n");
				break;
			}
		}
		System.out.println(sb.toString());
	}
}