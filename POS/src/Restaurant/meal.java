
package Restaurant;

import java.util.ArrayList;
import java.util.List;

public class meal {
   private List<item> items = new ArrayList<item>();	

   protected void addItem(item item){
      items.add(item);
   }

   protected float getCost(){
      float cost = 0.0f;
      
      for (item item : items) {
         cost += item.price();
      }		
      return cost;
   }
   protected String getName(){
       String itemName = "";
       for (item item : items)
           itemName = itemName +" + "+ item.name();
       return itemName;
   }
	
}
