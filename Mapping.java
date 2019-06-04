import java.util.*;
public class Mapping
{
 public static void main(String[] args)
  {
 HashMap<Character,Character> hm = new HashMap<Character,Character>();
 Scanner s = new Scanner(System.in); 
 String s1=s.nextLine();
   String s2=s.nextLine();
   char ch1[] = s1.toCharArray();
   char ch2[] = s2.toCharArray();
  for(int i =0;i<ch1.length;i++)
  {
  for(int j=0;j<ch2.length;j++)
  {
    if(ch1.length != ch2.length)
    {
      System.out.print("Invalid");
      break;
    }
 hm.put(ch1[i],ch2[j]);
}
}
 for(Map.Entry<Character,Character> m:hm.entrySet())
 {
 System.out.print(m.getKey() + "" +m.getValue());
if(hm.size() == s1.length())
{
 System.out.print("Valid");
 }
else
 {
  System.out.print("Invalid");
}}
}
 }
  

