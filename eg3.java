import com.google.gson.*;
import java.io.*;
class Student
{
public int rollNumber;
public String name;
//above code could have been private properties follwed by setter/getter
}
class psp2
{
public static void main(String gg[])
{
try
{
FileReader fileReader = new FileReader("student.data");
Gson gson = new Gson();
Student s;
s=gson.fromJson(fileReader,Student.class);
System.out.println(s.rollNumber+","+s.name);
fileReader.close();
}catch(Exception e)
{
System.out.println(e);
}
}
}