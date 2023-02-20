
public class aam {

	public static void main(String[] args) {
		int n = 3;
		int sum = 0; 
		
		 for (int i = 1; i <= n; i++) { 
		  for (int j = 1; j <= n; j = j * 2) { 
		   sum += i * j; 
		   System.out.println(sum);
		  } 
		 } 
		 System.out.println("Final: " + sum);
	}
}
