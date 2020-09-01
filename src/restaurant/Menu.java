package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu
{
    private ArrayList<MenuItem> menuItems;
    private Date dateOfLastUpdate;
    private String menuType; //Breakfast, Lunch, or Dinner

    public Menu(String menuType){
        this.menuItems = new ArrayList<>();
        this.menuType = menuType;
        this.dateOfLastUpdate = new Date();
    }

    public ArrayList<MenuItem> getMenuItems(){
        return this.menuItems;
    }

    public void addItem(MenuItem newItem){
        if(this.menuItems.contains(newItem)){
            System.out.println("That item is already on the menu");
        }else{
            this.menuItems.add(newItem);
            this.dateOfLastUpdate = new Date();
        }
    }

    public void removeItem(MenuItem itemToRemove){
        this.menuItems.remove(itemToRemove);
        this.dateOfLastUpdate = new Date();
    }

    public Date getDateOfLastUpdate(){
        return this.dateOfLastUpdate;
    }

    @Override
    public String toString()
    {
        return "Menu: " + menuItems;
    }
}
