interface Building{
    final int room = 20;
    final int area = 5000;//sq feet
     void CompoundArea();// by default every method inside class is public abstract 
    void Floor();
}
//you cannot instanciate the interface because interface is abstract type
class Hotel implements Building{
    public void CompoundArea(){
        System.out.println(" Compound area is 3000 sq feet");
    }
    public void Floor(){
        System.out.println("floor : 5");
    }
}

public class Interface {
    public static void main(String[] args) {
        System.out.println("Bashant Bist 019-322");
        Building b = new Hotel();
        b.CompoundArea();
        b.Floor();
        
    }
}