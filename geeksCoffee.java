import java.util.*;
public class geeksCoffee {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int l=0;
int m=0;
for(int j=0;j<n;j++)
{
l=s.nextInt();
m=s.nextInt();
for(int i =1;i<m;i++)
{
l=l/2;
}
System.out.println(l);
}}
}