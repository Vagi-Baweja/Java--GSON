import com.google.gson.*;
class Student
{
public int rollNumber;
public String name;
//above code coulf have been proavte properties follwed by setter/getter
}
class psp
{
public static void main(String gg[])
{
try
{
Student s = new Student();
s.rollNumber=101;
s.name="Suresh";
Gson g=new Gson();
String jsonString = g.toJson(s);
System.out.println(jsonString);
}catch(Exception e)
{
System.out.println(e);
}
}
}