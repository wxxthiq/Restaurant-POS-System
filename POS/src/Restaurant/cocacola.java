
package Restaurant;

public class cocacola extends drink {
   private boolean extraIce;
   
   protected cocacola(boolean extraIce){
       this.extraIce = extraIce;
   }
   @Override
   public float price() {
      if (extraIce == false)
        return 3.0f;
      else
        return 4.0f;
   }

   @Override
   public String name() {
      if (extraIce == false)
        return "Coca Cola";
      else
        return "Coca Cola + Extra Ice";
   }
}
