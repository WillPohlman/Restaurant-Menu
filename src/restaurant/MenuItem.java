package restaurant;

public class MenuItem
{
    private double price;
    private String description, category, name;
    private boolean isNew;

    public MenuItem(String name, String description, String category, double price){
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = true;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean isNew()
    {
        return isNew;
    }

    public void setNew(boolean aNew)
    {
        isNew = aNew;
    }
}
