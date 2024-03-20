
package Restaurant;

public class MealBuilder {
    private double discount10 = 0.9;
    private double discount20 = 0.8;
    private double itemDiscount;
    private double bundleDiscount;
    
   protected meal chickenShawarmaMeal (boolean extraCheese){
      meal meal = new meal();
      meal.addItem(new chickenShawarma(extraCheese));
      return meal;
   }   

   protected meal beefShawarmaMeal (boolean extraCheese){
      meal meal = new meal();
      meal.addItem(new beefShawarma(extraCheese));
      return meal;
   }
   
    protected meal lambShawarmaMeal (boolean extraCheese){
        meal meal = new meal();
        meal.addItem(new lambShawarma(extraCheese));
        itemDiscount=0.9;
        return meal;
   }
    
   protected meal cocacolaMeal (boolean extraIce){
       meal meal = new meal();
       meal.addItem (new cocacola(extraIce));
       return meal;
   }
   
   protected meal spriteMeal (boolean extraIce){
       meal meal = new meal();
       meal.addItem (new sprite(extraIce));
       return meal;
   }
   
   protected meal teaMeal (boolean ice){
       meal meal = new meal();
       meal.addItem (new tea(ice));
       return meal;
   }
   
   protected meal setAMeal(boolean extraCheese, boolean extraIce){
       meal meal = new meal ();
       meal.addItem(new chickenShawarma(extraCheese));
       meal.addItem(new cocacola(extraIce));
       bundleDiscount = 0.90;
       return meal;
   }
   
   protected meal setBMeal (boolean extraCheese, boolean extraIce){
       meal meal = new meal ();
       meal.addItem(new beefShawarma(extraCheese));
       meal.addItem(new sprite(extraIce));
       bundleDiscount = 0.85;
       return meal;
   }
   
    protected meal setCMeal (boolean extraCheese, boolean ice){
       meal meal = new meal ();
       meal.addItem(new lambShawarma(extraCheese));
       meal.addItem(new tea(ice));
       bundleDiscount = 0.8;
       return meal;
   }
    protected double getDiscount10(){
    return discount10;
    }
   
    protected double getDiscount20(){
    return discount20;
    }
    
    protected double getBundleDiscount(){
        return bundleDiscount;
    }
    
    protected double getItemDiscount(){
        return itemDiscount;
    }
   
   
    
}
