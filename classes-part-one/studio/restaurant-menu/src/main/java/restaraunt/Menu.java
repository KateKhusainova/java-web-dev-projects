package restaraunt;

import java.util.Date;
import java.util.ArrayList;

public class Menu {
   private Date lastUpdated;
   private ArrayList<MenuItem> items;
   public Menu (ArrayList<MenuItem> items) {
      this.items = items;
      this.lastUpdated = new Date();
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
    // add
    public void add(MenuItem item) {
       this.items.add(item);
   }
   // delete
    public void deleteItem(int index) {
       this.items.remove(index);
    }
    //print one item
    public void simplePrintItem(int index){
       MenuItem oneItem = this.items.get(index);
       System.out.println(oneItem.getName() + ":" + oneItem.getPrice());
    }
    //print all
    public void printAll () {
       for(int i=0; i<this.items.size(); i++) {
           MenuItem oneItem = this.items.get(i);
           System.out.println(oneItem.toString());
       }
    }
}
