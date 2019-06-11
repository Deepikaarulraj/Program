import java.util.*;
public class LongestConsecutiveSequence{
public static void main(String[] args){
int num,count=0,i;
Scanner s=new Scanner(System.in);
num=s.nextInt();
int arr[]=new int[num];
for(i=0;i<num;i++)
arr[i]=s.nextInt();
Arrays.sort(arr);
i=0;
while(i<arr.length-1){
if(arr[i]+1==arr[i+1])
count++;
else if(count>1)
break;

i=i+1;}

System.out.println(count+1);
}}