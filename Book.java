public class Book extends Item
{
    private long isbn_number;
    private String author;

    public long getIsbn_number()
    {
        return isbn_number;
    }

    public void setIsbn_number(long isbn_number)
    {
        this.isbn_number = isbn_number;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    Book()
    {
        isbn_number = 0;
        author = "";
        setTitle("");
    }

    Book(String t, long i, String a)
    {
        setTitle(t);
        isbn_number = i;
        author = a;
    }

    @Override
    public String getListing()
    {
        return "Book Name - " + this.getTitle() + "\nAuthor - " + this.getAuthor() + "\nISBN # - " + this.getIsbn_number();
    }
}
