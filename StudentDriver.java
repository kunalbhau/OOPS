public class StudentDriver
 {
 public static void main(String args[])
 {
 Student s1 = new Student("Tushar", 143, "IIT", 9865242102L);
 Student s2 = new Student("Tushar", 143, "IIT", 9865242102L);

 System.out.println(s1);
 System.out.println(s2);
 System.out.println(s1 == s2);
 System.out.println(s1.equals(s2));
 }
 }