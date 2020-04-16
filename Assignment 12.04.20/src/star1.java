import java.util.Scanner;
public class star1 {
	public static void main(String[]args) {
		int n;
		System.out.println("Enter the no   :     ");
		Scanner inp=new Scanner(System.in);
		n=inp.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

