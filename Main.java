public class Main
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
            BookShop bs1 = new BookShop("bookworld","downStreet");
            bs1.loadData();
            //bs1.showBooks();

//          BookShop bs2 = new BookShop("bookstore","upstreet");    //expresive network call to database and expensive procedure
//          bs2.loadData();
//          bs2.showBooks();

            //BookShop bs2 = new BookShop("bookstore","upstreet");
//          bs2 = bs1;   //all the fields wil be same in the assignmnet operator

//          BookShop bs2 = new BookShop("bookstore","upstreet");   //self cloning
//          bs2.clone(bs1);
//          bs2.showBooks();
//
//          System.out.println();
//
//          bs1.getBooks().get(0).setName("new name");
//
//          bs1.showBooks();
//          bs2.showBooks();

//          BookShop bs2 = new BookShop("bookstore","upstreet");     //object time is require // resources consuption
//          bs2.clone(bs1);
//
//          bs1.showBooks();
//          bs2.showBooks();


            BookShop bs2 = new BookShop("bookstore" , "upstreet");
            bs2 = bs1.clone();

            bs1.showBooks();
            bs2.showBooks();

            System.out.println();

            bs2.setName("bookstore");
            bs2.setAddress("upstreet");

            bs1.showName();
            bs2.showName();
    }
}
