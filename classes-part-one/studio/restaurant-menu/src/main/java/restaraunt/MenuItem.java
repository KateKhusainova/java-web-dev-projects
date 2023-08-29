package restaraunt;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private double price;
    private boolean isNew;

    public MenuItem (String name, String description, String category, double price, boolean isNew){
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = isNew;
    }
    //Setters
    public void setName (String name) {
        this.name = name;
    }
    public void setDescription (String description) {
        this.description = description;
    }
    public void setCategory (String category) {
        this.category = category;
    }
    public void setPrice (double price) {
        this.price = price;
    }
    public void setIsNew (boolean aNew) {
        this.isNew = aNew;
    }

}
