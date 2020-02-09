class Room
{
    int height,width,breadth;
void setdata(int h,int w,int b)
{
    height=h;
    width=w;
    breadth=b;
}
int calvolume()
{
    return height*width*breadth;
}
}
class RoomDemo
{
public static void main(String args[])
{
    Room r=new Room();
    r.setdata(15,10,5);

System.out.println(r.calvolume());
}
}
