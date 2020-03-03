import java.io.IOException;

class FileInputStreamDemo
{
    public static void main(String args[])
    {
        FileInputStream fis=null;
        int nextByte;
        try{
            fis=new FileInputStream("a.txt");
            while((nextByte=fis.read())!=-1)
            System.out.println((char)nextByte);
        }
        catch(IoException ioe)
        {
         System.out.println("Catch");
        }
        finally{
            try{
                fis.close();
            }
            catch(IOException io)
            {
              System.out.println("do something");
            }
        }
    }
}