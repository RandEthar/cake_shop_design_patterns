
//abstract creator (factory method)
public abstract class CakeShop {
     public Cake orderCake(String type) {
         Cake cake = createCake(type);
       
         return cake;
     }
    public abstract Cake createCake(String type);
}
