import javax.xml.crypto.Data;

public class DataBase
{
    public DataBase()
    {

    }
    public void LoadData(BookShop shop)
    {
        //fetching
        for(int i=0;i<10;i++)
        {
            shop.getBooks().add(new Book("bool" + " " + i));
        }
    }
}
