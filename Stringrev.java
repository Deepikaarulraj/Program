import java.util.*;
public class Stringrev 
{
public static void main(String[] args) 
{
Scanner s = new Scanner(System.in);
System.out.println("Enter a String : ");
String str = s.nextLine();
String rev = "";
int i;
for(i=str.length()-1;i>=0;i--)
{
rev = rev+str.charAt(i);
}
System.out.println("Result : " +rev);
}
}  