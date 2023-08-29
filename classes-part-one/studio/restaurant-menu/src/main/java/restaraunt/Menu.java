package restaraunt;

import java.util.Date;
import java.util.ArrayList;

public class Menu {
   private Date lastUpdated;
   private ArrayList<MenuItem> items;
   public Menu (Date lastUpdated, ArrayList<MenuItem> items) {
      this.lastUpdated = lastUpdated;
      this.items = items;
   }
//Setters
   public void setLastUpdated (Date lastUpdated) {
      this.lastUpdated = lastUpdated;
   }
   public void setItems (ArrayList<MenuItem> items) {
      this.items = items;
   }
//Getters
    public Date getLastUpdated () {
       return lastUpdated;
    }
    public ArrayList<MenuItem> getItems () {
       return items;
    }
}
