import java.util.Scanner;

public class MenuDriven {
public static void main(String[]args) {
	int test;  
	
	System.out.println("Enter  0  for test Alphabets ::");
	System.out.println("Enter  1 for Armstrong ::");
	System.out.println("Enter 2 for fibonacci::");
	System.out.println("Enter 3 for palimdrome ::");
	System.out.println("Enter  4 for numeric pattern 1 ::");
	System.out.println("Enter  5 for numeric pattern 2 ::");
	System.out.println("Enter  6  for star pattern 1 ::");
	System.out.println("Enter  7  for star pattern 2 ::");
	
	
	
	System.out.println("Enter your choice ::");
	Scanner ins=new Scanner(System.in);
	test=ins.nextInt();
	
	
	
	switch(test)
	{
	case 1:
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
			break;
	case 0:	
		char ch;
		Scanner i=new Scanner(System.in);
		System.out.println("Enter Any Alphabets  ");
		ch=i.next().charAt(0);
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		System.out.println("THIS IS A VOWELS");
		}
		else if(ch=='B'||ch=='C'||ch=='D'||ch=='F'||ch=='G'||ch=='J'||ch=='K'||ch=='L'||ch=='M'||ch=='N'||ch=='P'||ch=='Q'||ch=='R'||ch=='S'||ch=='T'||ch=='V'||ch=='W'||ch=='X'||ch=='Y'||ch=='Z'||ch=='b'||ch=='c'||ch=='d'||ch=='f'||ch=='g'||ch=='h'||ch=='j'||ch=='k'||ch=='l'||ch=='m'||ch=='n'||ch=='p'||ch=='q'||ch=='r'||ch=='s'||ch=='t'||ch=='v'||ch=='w'||ch=='x'||ch=='y'||ch=='z') {
		System.out.println("THIS IS A CONSTANT");	
		}

	else{
		System.out.println("Enter right alphabets");
	}
		break;
		
	case 2:
		int n;
		int a=0,b=1,c;
		System.out.println("Enter the no upto you  genarate :: ");
		Scanner ina=new Scanner(System.in);
		n=ina.nextInt();
		for(int k=1;k<=n;k++) {
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
		break;
		
	case 3:
		int p;
		System.out.println("Enter the no you want to cheak :: ");
		Scanner inf=new Scanner(System.in);
		p=inf.nextInt();
		int temp=p;
		int rev=0;
		int remen;
		while(p!=0) {
			remen=p%10;
			rev=rev*10+remen;
			p=p/10;
			
		}
		if(temp==rev) {
			System.out.println("The no you inserted IS Palindrome ");
		}
		else {
			System.out.println("The no you inserted is  NOT Palindrome ");
		}
		break;
		
		
	case 4:
		int na;
		System.out.println("Enter the no   :     ");
		Scanner inb=new Scanner(System.in);
		na=inb.nextInt();
		for(int s=1;s<=na;s++) {
			for(int j=1;j<=s;j++) {
				System.out.print(" "+j);
			}
			System.out.println("");
		}
		break;
		
	case 5:
		int nb;
		System.out.println("Enter the no   :     ");
		Scanner inc=new Scanner(System.in);
		nb=inc.nextInt();
		for(int t=nb;t>=1;t--) {
			for(int j=1;j<=t;j++) {
				System.out.print(" "+j);
				
				
			}
			System.out.println("");
		}
		break;
		
	case 6:
		int nc;
		System.out.println("Enter the no   :     ");
		Scanner ind=new Scanner(System.in);
		nc=ind.nextInt();
		for(int u=1;u<=nc;u++) {
			for(int j=1;j<=u;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		break;
		
	case 7:
		int nd;
		System.out.println("Enter the no   :     ");
		Scanner ine=new Scanner(System.in);
		n=ine.nextInt();
		for(int f=n;f>=1;f--) {
			for(int j=1;j<=f;j++) {
				System.out.print(" * ");
				
				
			}
			System.out.println("");
		}
		break;

	default:
		
		System.out.println("Enter right choice");
		
		break;
		
}
}
}
