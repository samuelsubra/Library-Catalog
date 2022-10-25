public class Item
{
    private String title;

    Item()
    {
        title = "";
    }

    Item(String t)
    {
        title = t;
    }

    public String getListing()
    {
        return "";
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    @Override
    public String toString()
    {
        return "";
    }
}
