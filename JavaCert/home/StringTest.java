import java.io.*;

class StringTest 
{
 public static void main(String[] args)
 {
String s = "123456789";

//C. StringBuffer s = new StringBuffer("123456789");
s.substring(3,6).delete(1,3).insert(1, "24");

System.out.println(s);
 }
}
