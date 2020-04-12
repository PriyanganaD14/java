class A extends Thread
{
    public void run()
    {
        int i;
        for(i=1;i<=10;i++)
        System.out.println(" i="+i+" Thread A ");
    }
}

class B extends Thread
{
    public void run()
    {
        int y;
        for(y=10;y>=1;y--)
        System.out.println(" y="+y+" Thread B ");
    }
}

class Examplethread 
{
    public static void main(String args[])
    {
        A obj1=new A();
        B obj2=new B();
        obj1.start();
        obj2.start();
    }
}