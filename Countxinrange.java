import java.util.*;
public class Countxinrange
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
int n;
     System.out.println("Enter the occurences : ");
      n= s.nextInt();
     System.out.println();

System.out.println("Enter the boundaries : ");
     int lb = s.nextInt();
     int ub = s.nextInt();

int count = 0,temp;       
    temp = lb + 1;
int i,j;
  while(temp < ub)
     {
       j = temp;
    while(temp != 0)
      {
        i = temp % 10;
          
          if(i==n) 
             count++; 
              temp = temp / 10;
           }
 temp = j + 1;
}
System.out.println(count);
}
}
              
