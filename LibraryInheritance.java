import java.util.ArrayList;
import java.util.List;
abstract class Publication
{
    public int noOfPages;
    public float price;
    public String publisherName;
    publication(int noOfPages,float price,String PublisherName)
    { this.noOfPages=noOfPages;
     this.price=price;
    this.PublisherName=PublisherName;

    }
}
public class Book extends Publication
{
    Book(int noOfPages,float price,String publication)
    {
        super(noOfPages,price,Publishername);
    }

}
public class Journal extends Publication
{
    Journal(int noOfPages,float price,String publication)
    {
        super(noOfPages,price,Publication);
    }
}
public class Library1
{
    public ArrayList<Publication>publicationList;
    Library1()
    {
        publicationList=new ArrayList<>();
    }
    public void AddPublication(Publication firstBook)
}
{
publictionList.add(firstBook);
}
public voidshowPublications()
{
    for(int i=0;i<publicationList.size();i++)
    {
        publication p=publicationList.get(i);
        System.out.println(p.noOfPages+""+p.price+""+p.publicationName+"\n");
    }
}

{
    publictionList.add(firstJournal);
    }
    public voidshowPublications()
    {
        for(int i=0;i<publicationList.size();i++)
        {
            publication p=publicationList.get(i);
            System.out.println(p.noOfPages+""+p.price+""+p.publicationName+"\n");
        }
    }
public static void main(String args[])
{
    Publication firstBook=new Book(100,180,"O'Really");
    Publication secondBook=new Book(1000,1800,"Oxford");
    Publication thirdBook=new Book(2000,1880,"The Name of the Wind");
    Publication firstjournal=new Book(50,500,"Windeye");
    Publication secondjournal=new Book(60,600,"Battleborn");
    Library1 lib=new Library1();
    lib.AddPublication(firstBook);
    lib.AddPublication(secondBook);
    lib.AddPublication(thirdBook);
    lib.AddPublication(firstJournal);
    lib.AddPublication(secondJournal);
    lib.showPublication();
}