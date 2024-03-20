
package Restaurant;

public class beefShawarma extends shawarma {
    
   private boolean extraCheese;
   protected beefShawarma (boolean extraCheese){
       this.extraCheese = extraCheese;
   }

   @Override
   public float price() {
      if (extraCheese == false)
        return 11.5f;
      else
        return 14.5f;
   }

   @Override
   public String name() {
      if (extraCheese == false)
        return "Beef Shawarma";
      else
        return "Beef Shawarma + Extra Cheese";
   }
}
