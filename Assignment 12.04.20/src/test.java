import java.util.Scanner;
public class test{ 
	public static void main(String[]args) {
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
		
	}

}
