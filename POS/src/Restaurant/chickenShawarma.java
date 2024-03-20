
package Restaurant;

public class chickenShawarma extends shawarma {
    private boolean extraCheese;
    
    protected chickenShawarma(boolean extraCheese){
    this.extraCheese = extraCheese;
    };
    
   @Override
   public float price() {
       if (extraCheese == false)
            return 9.0f;
       else
            return 12.0f;
   }

   @Override
   public String name() {
      if (extraCheese == false) 
        return "Chicken Shawarma";
      else
        return "Chicken Shawarma + Extra Cheese";
   }
}
