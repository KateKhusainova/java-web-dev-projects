package restaraunt;

import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {
        ArrayList<MenuItem> menuInTheRestaurant = new ArrayList<>();
        MenuItem firstCourse = new MenuItem("Chicken Caesar Salad", "Romaine Leaves, Shaved Parmesan, Garlic Croutons", "appetizer", 14, true);
        MenuItem secondCourse = new MenuItem("Lobster Ravioli", "Brandy Lobster Sauce, Shrimp", "main course", 26, false);
        MenuItem thirdCourse = new MenuItem("Molten Chocolate Cake", "With a Melted Chocolate Center. Served with Vanilla Ice Cream", "dessert", 12, false);

        Menu myMenu = new Menu(menuInTheRestaurant);
        menuInTheRestaurant.add(firstCourse);
        menuInTheRestaurant.add(secondCourse);
        menuInTheRestaurant.add(thirdCourse);

        myMenu.simplePrintItem(1);
        myMenu.printAll();
    }
}
