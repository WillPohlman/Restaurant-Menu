package restaurant;

public class Restaurant
{
    public static void main(String[] args){
        MenuItem pulledPorkSandwich = new MenuItem("Pulled Pork Sandwich", "description", "main course", 10.00);
        MenuItem toastedRavs = new MenuItem("Toasted Ravioli", "Deep-fried Beef Ravioli", "appetizer", 5.00);
        MenuItem gooeyButterCake = new MenuItem("Gooey Butter Cake", "", "dessert", 7.50);
        Menu dinnerMenu = new Menu("Dinner");
        dinnerMenu.addItem(pulledPorkSandwich);
        dinnerMenu.addItem(toastedRavs);
        dinnerMenu.addItem(gooeyButterCake);
        System.out.println(dinnerMenu);
        System.out.println(toastedRavs);
        dinnerMenu.removeItem(gooeyButterCake);
        System.out.println(dinnerMenu);
    }
}
