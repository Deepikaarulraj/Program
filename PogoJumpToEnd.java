import java.util.*;
public class PogoJumpToEnd {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int c=0,f=0;
int a[]=new int[n];
for(int i=0;i<n;i++) {
a[i]=s.nextInt();
}
for(int i=0;i<n;i++) {
c=a[i];
i=i+c;
if(i==(n-1)) {
f=1;
break;
}
if(a[i]==0) {
System.out.println("false");
break;
}
}
if(f==1) {
System.out.println("true");
}
}
}
