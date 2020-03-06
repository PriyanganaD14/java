import java.util.Scanner;
 class Floppy
 {
     public static void main(String args[])
     {
         Scanner scan=new Scanner(System.in);
         int f=scan.nextInt();
         System.out.println("Free byte : "+f);
         int u=scan.nextInt();
         System.out.println("Used byte : "+u);
         int o=scan.nextInt();
         System.out.println("Deleted byte : "+o);
         int n=scan.nextInt();
         System.out.println("Created byte : "+n);
         int TotalByte=f+n+o;
         System.out.println("The total free free bytes are");
         System.out.println(TotalByte);

         

     }

 }