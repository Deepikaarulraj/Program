import java.util.*;
public class Inplace
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
    int n=s.nextInt();   
    int arr[] = new int[n];
    int temp=0,i;
   for( i = 0;i<n;i++)
     {
       arr[i] = s.nextInt();
     }
    for(i = 0;i<=n/2;i++)
     {
       temp=arr[i];
       arr[i]=arr[n-1-i];
       arr[n-1-i]=temp;
     }  
       for(i=0;i<n;i++)
        {
        System.out.print(arr[i]);
}}
}

