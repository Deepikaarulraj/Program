import java.util.*;
public class Removestringchar
{
public static void main(String[] args)
{
 String str1,str2;
 Scanner s = new Scanner(System.in);
  str1 = s.nextLine();
  str2 = s.nextLine();
 s.close();
  char ch[] = str1.toCharArray();
for(int i = 0;i<ch.length;i++)
 {
   str2 = str2.replaceAll(Character.toString(str1.charAt(i)),"");
 }
 System.out.println(str2);
}
}
	