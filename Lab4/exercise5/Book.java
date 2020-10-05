package Lab4.exercise5;

public class Book {

    private String title;
    private double price;
    private  String ISBN;
    private int pages;


    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public String getISBN(){
        return ISBN;
    }
    public int getPages(){
        return pages;
    }


    public void setTitle(String title){

        if(!title.equals(""))
        this.title = title;
    }
    public void setPrice(double price){
        if(price > 0)
        this.price = price;
    }
    public void setISBN(String ISBN){
        if(!ISBN.equals(""))
        this.ISBN = ISBN;
    }
    public void setPages(int pages){
        this.pages = pages;
    }


    public Book(String title, double price, String ISBN, int pages){
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setPages(pages);
    }


    public Book() {
        this("Title not available", 0.00, "ISBN not available", 0);
    }

    public String toString(){
        return "Title: " + getTitle() + "  Price: " + getPrice() + "  ISBN: " + getISBN() +
                "  Pages: " + getPages();
    }





}
