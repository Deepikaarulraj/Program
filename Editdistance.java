import java.util.*;
public class Editdistance
{
 public static int minimum(int x,int y,int z)
{
  if(x<=y&&x<=z)
   return x;
  if(y<=x&&y<=z)
   return y;
  else 
   return z;
}
public static int Distance(String str1,String str2,int m,int n)
{
  if(m==0)
   return n;
  if(n==0)
   return m;
if(str1.charAt(m-1)==str2.charAt(n-1))
 return Distance(str1,str2,m-1,n-1);
 return 1 + minimum(Distance(str1,str2,m,n-1),Distance(str1,str2,m-1,n),Distance(str1,str2,m-1,n-1));
}
 public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    String s1 = s.nextLine();
    String s2 = s.nextLine();
  System.out.println(Distance(s1,s2,s1.length(),s2.length()));
   }
}