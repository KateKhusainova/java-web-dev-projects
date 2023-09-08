package restaraunt;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private double price;
    private boolean isNew;
    public static int nextId = 1;
    private final int id;


    public MenuItem (String name, String description, String category, double price, boolean isNew){
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = true;
        this.id = nextId;
        nextId++;
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
        isNew = aNew;
    }

    //Getters
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }
    public double getPrice() {
        return price;
    }
    public boolean isNew() {
        return isNew;
    }
    public int getId() {
        return id;
    }
    public boolean equals(Object o) {
        if(this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return id == menuItem.id;
    }

}
