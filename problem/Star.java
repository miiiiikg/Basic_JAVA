package problem;

public class Star {
	public static void main(String[] args) {
		int i;
		int j;
		
		for(i=1; i<6; i++) {
			System.out.print("*");
			for(j=1; j<i-1; j++)
				System.out.println("*");
			
		}
	}
}


