import java.util.*;
public class AddEle
 {
 public static void main(String args[])
 {
  Collection<Integer> a = new ArrayList<Integer>(5);
  
  a.add(3);
  a.add(5);
  a.add(9);
  
  for (Integer n : a)
  {
   System.out.println("The numbers are :" +a);
   }
   Collection<Integer> b = new ArrayList<Integer>();
   
   b.addAll(a);
   System.out.println("The modified arraylist is :" +b);
   }
   }