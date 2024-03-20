
package Restaurant;

public class tea extends drink {
   private boolean ice;
   
   protected tea(boolean ice){
       this.ice = ice;
   }
   @Override
   public float price() {
      if (ice == false)
        return 5.0f;
      else
        return 6.0f;
   }

   @Override
   public String name() {
      if (ice == false)
        return "Hot Tea";
      else
        return "Iced Tea";
   }
}
