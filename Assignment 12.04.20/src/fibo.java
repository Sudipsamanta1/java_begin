import java.util.Scanner;
public class fibo {
	public static void main(String[]args) {
		int no;
		int a=0,b=1,c;
		System.out.println("Enter the no upto you  genarate :: ");
		Scanner inp=new Scanner(System.in);
		no=inp.nextInt();
		for(int i=1;i<=no;i++) {
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
	}
}
