package restaurant;

import java.util.Objects;

public class MenuItem
{
    private double price;
    private String name, description, category;
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

    @Override
    public String toString()
    {
        return "Name: '" + name + '\'' +
                ", Description: '" + description + '\'' +
                ", Price: '$" + price + '\'';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.getPrice(), getPrice()) == 0 &&
                isNew() == menuItem.isNew() &&
                getName().equals(menuItem.getName()) &&
                getDescription().equals(menuItem.getDescription()) &&
                getCategory().equals(menuItem.getCategory());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getPrice(), getName(), getDescription(), getCategory(), isNew());
    }
}
