
package Restaurant;

public class lambShawarma extends shawarma {
   private boolean extraCheese;
   
   protected lambShawarma(boolean extraCheese){
       this.extraCheese = extraCheese;
   }
   @Override
   public float price() {
      if (extraCheese == false)
        return 13.0f;
      else
        return 16.0f;
   }

   @Override
   public String name() {
      if (extraCheese == false)
        return "Lamb Shawarma";
      else
        return "Lamb Shawarma + Cheese";
   }
}
