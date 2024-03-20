
package Restaurant;

public class sprite extends drink {
   private boolean extraIce;
   
   protected sprite(boolean extraIce){
       this.extraIce = extraIce;
   }
   @Override
   public float price() {
      if (extraIce == false)
        return 2.5f;
      else
        return 3.5f;
   }

   @Override
   public String name() {
      if (extraIce == false)
        return "Sprite";
      else
        return "Sprite + Extra Ice";
   }
}
