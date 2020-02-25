class Vehicle
{
    int Speed;
    int Milege;

    void setSpeed(int sp)
    {
        this.Speed=sp;
    }
    void setMilege(int m)
    {
        Milege=m;
    }
    void display()
    {
        System.out.println("Speed"+Speed+"Milege"+Milege);
    }
}
class Bike extends Vehicle
{
 int SeatHeight;
 int Engine;
 void setData(int sh,int eng,int s,int m)
 {
     super.setSpeed(s);
     super.setMilege(m);
     SeatHeight=sh;
     Engine=eng;
 }
 void display()
 {
     super.display();
     System.out.println(SeatHeight);
     System.out.println(Engine);
 }
}
class Demo
{
    public static void main(String args[])
    {
        Bike b=new Bike();
        b.setData(10,20,30,40);
        b.display();
    }
}