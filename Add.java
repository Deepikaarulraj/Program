import java.util.*;
 class Add
 {
static boolean list(int arr[],int size,int sum)
{
  int l,m;
  Arrays.sort(arr);
   l= 0;
   m = size-1;
     while(l<m)
      {
       if(arr[l] + arr[m] == sum)
         return true;
       else if(arr[l] + arr[m] < sum)
         l++;
       else
         m--;
  
}
 return false;
}
public static void main(String[] args)
    {
      
      Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int arr[] = new int[n];
     for(int i=0;i<n;i++)
        {
          arr[i] = s.nextInt();
        }
        int size = arr.length;
        int k = s.nextInt();

         if(list(arr,size,k))
            System.out.println("true");
         else
            System.out.println("false");
    }
}