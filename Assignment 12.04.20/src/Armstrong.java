import java.util.Scanner;
public class Armstrong {
	public static void main (String[] args){
		int no;
		System.out.println("Enter the no you want to cheak :: ");
		Scanner inp=new Scanner(System.in);
		no=inp.nextInt();
		int temp1=no;
		int leng=0;

		while(temp1!=0) {
			leng=leng+1;
			temp1=temp1/10;
			}
		
		int temp2=no;
		int rem;
		int arm=0;
		
		while(temp2!=0) {
			int mul=1;
			rem=temp2%10;
			for(int i=1;i<=leng;i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			temp2=temp2/10;
		}
		
		if(arm==no) {
			System.out.println("The no you inserted IS Armstrong no ");
		}
		else {
			System.out.println("The no you inserted is  NOT Armstrong ");
		}
	}
	

}
