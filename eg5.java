import com.google.gson.*;
class Student implements java.io.Serializable
{
public int rollNumber;
public String name;
transient public String gender;
//above code could have been private properties follwed by setter/getter
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
s.gender="Male";
Gson g=new Gson();
String jsonString = g.toJson(s);
System.out.println(jsonString);
Student s2 = g.fromJson(jsonString,Student.class);
System.out.println(s2.rollNumber+ ","+s2.name+","+s2.gender);
}catch(Exception e)
{
System.out.println(e);
}
}
}