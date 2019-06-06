import java.util.*;
public class greatOnRight{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int g=0;
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
for(int i=1;i<n;i++){
g=a[i];
for(int j=i+1;j<n;j++){
if(a[j]>g){
g=a[j];
}
}
a[i-1]=g;
if(i==a.length-1){
a[i]=-1;
}
}
for(int i=0;i<n;i++){
System.out.println(a[i]);
}

}
}