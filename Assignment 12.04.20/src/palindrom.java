import java.util.Scanner;
public class palindrom {
	public static void main (String[] args){
		int p;
		System.out.println("Enter the no you want to cheak :: ");
		Scanner i=new Scanner(System.in);
		p=i.nextInt();
		int temp=p;
		int rev=0,rem;
		while(p!=0) {
			rem=p%10;
			rev=rev*10+rem;
			p=p/10;
			
		}
		if(temp==rev) {
			System.out.println("The no you inserted IS Palindrome ");
		}
		else {
			System.out.println("The no you inserted is  NOT Palindrome ");
		}
	}
	

}
