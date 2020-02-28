class Multiplication
{
    int n;
   /* Multiplication(int n)  //Paramerised Constructor
    {
        n=number;
    }*/
    Multiplication()  // Default Constructor
    {
        n=10;
    }
    
    void multiply() 
    {  
        for(int i=1;i<=10;i++)
      System.out.println(n*i);

    }


}
class Main
{
    public static void main(String[] args) 
    {
         Multiplication m=new Multiplication();
         m.multiply();
        
    }
}