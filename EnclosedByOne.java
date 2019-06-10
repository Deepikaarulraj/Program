import java.util.*;
public class EnclosedByOne{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n=sc.nextInt();
		int a=0;
		int b=0;
		while(n>0){
			b=n%2;
			n=n/2;
			a=a+b;
		}
		if(n==1){
			a=a+1;
		}
		if(a==2){
			System.out.println("Yes");
		}
		else{
			System.out.print("No");
		}
	}
}