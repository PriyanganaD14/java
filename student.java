class student
{
    String name;
    float marks1,marks2,marks3;
    
    void getdata(String nm,float m1,float m2,float m3) //initial value
    {
        name=nm;
        marks1=m1;
        marks2=m2;
        marks3=m3;
    }
    float average()
    {
        return (marks1+marks2+marks3)/3;
    }
    void display()
    {
        System.out.println("The name of the student is "+name);
        System.out.println("\n The total marks is :"+(marks1+marks2+marks3));
    }
    public static void main(String args [])
    {
        student s=new student();
        s.getdata("Priyangana",80,90,85);
        System.out.println("Student information is :");
        s.display();
        System.out.println("The average marks is :"+s.average());
    }   
    
}