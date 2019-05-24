import java.util.*;
public class Segregate
 {
   public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int a[] = new int[n];
     int i,j,temp=0;
   for(i = 0;i<n;i++) 
      {
       a[i] = s.nextInt();
     
       }
   i=0;
   j=n-1;
          while(i<=j)
           {
            if(a[i]==0)
             i++;
           else {
              if(a[j] == 0)
               { 
                 temp=a[i];
                  a[i] = a[j];
                  a[j] =temp;
                  j--;
                  i++;
                }
else
    j--;
}
}
  for(i=0;i<n;i++)
  System.out.print(a[i]+" ");
}
}