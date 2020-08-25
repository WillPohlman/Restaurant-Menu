package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu
{
    private ArrayList<MenuItem> menuItems;
    private Date dateOfLastUpdate;
    private String menuType; //Breakfast, Lunch, or Dinner

    public Menu(ArrayList<MenuItem> itemList, String menuType){
        this.menuItems = itemList;
        this.menuType = menuType;
        this.dateOfLastUpdate = new Date();
    }

    public ArrayList<MenuItem> getMenuItems(){
        return this.menuItems;
    }

    public void addItem(MenuItem newItem){
        this.menuItems.add(newItem);
        this.dateOfLastUpdate = new Date();
    }

    public void removeItem(MenuItem itemToRemove){
        this.menuItems.remove(itemToRemove);
        this.dateOfLastUpdate = new Date();
    }
}
