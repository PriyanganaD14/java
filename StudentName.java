class student

{
    String name;
    public student(String s)
    {
        name=s;
    }
    public student()
    {
        name="Unknown";
    }
}
class ans
{
public static void main(String args[]){
    student s=new student("Priyangana");
    //student a=new student();
     System.out.println(s.name);
     System.out.println(a.name);
}
}