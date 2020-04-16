import java.util.Scanner;
public class star2 {
	public static void main(String[]args) {
		int n;
		System.out.println("Enter the no   :     ");
		Scanner inp=new Scanner(System.in);
		n=inp.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
				
				
			}
			System.out.println("");
		}
	}
}