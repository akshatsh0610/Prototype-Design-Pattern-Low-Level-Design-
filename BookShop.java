import java.util.ArrayList;
import java.util.List;

public class BookShop extends Object implements Shop , Cloneable
{
    private boolean Load;
    private String address;
    private String Name;

    private ArrayList<Book> books;
    private BookShop()
    {

    }
    public BookShop(String name , String address)
    {
        Load = false;
        this.setName(name);
        this.setAddress(address);
        this.books = new ArrayList<>();
    }

    @Override
    public void showAddress()
    {
        System.out.println(this.getAddress());
    }
    @Override
    public void showName()
    {
        System.out.println(this.getName());
    }


    public void loadData()
    {
        if(!this.Load)
        {
            this.Load = true;
            DataBase db = new DataBase();   //db object creation
            db.LoadData(this);        //db  connectivity

        }
    }

    public void addBook(Book book)
    {
        this.getBooks().add(book);
    }
    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }


    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    void showBooks()
    {
//        for(Book book : this.books)
//        {
//            System.out.print(book.getName() + "    ");
//        }
//        System.out.println();
         System.out.println(this.getBooks());
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException
    {
         BookShop tempShop = new BookShop("null","null");
         for(Book book : this.books)
         {
             tempShop.getBooks().add(new Book(book.getName()));
         }
         return tempShop;
    }
}
