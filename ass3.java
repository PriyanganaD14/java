class Box
{
    int height,width,breadth;
    public Box()
    {
        height=100;
        width=50;
        breadth=25;
    }
    public Box(int h,int w,int b)
    {
        height=h;
        width=w;
        breadth=b;
    }
    int getvolume()
    {
        return height*width*breadth;
    }
    int getarea()
    {
        return height*breadth;
    }
}
class demo
{
    public static void main(String args[])
     {
         Box b1=new Box();
         Box b2=new Box(30,20,10);
         System.out.println(b2.getvolume());
         System.out.println(b2.getarea());   
    }
}