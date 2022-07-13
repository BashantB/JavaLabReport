// use of constructor to calculate simple interest
public class constructor {
    int price;
    int rate;
    int time;

    public constructor(int p,int t,int r){
        price = p;
        rate = r;
        time = t;
    }

    public static void main(String[] args) {
        System.out.println("Bashant Bist 019-322");
        
        constructor cons = new constructor(100, 10, 7);
        double I = 0.01*cons.price*cons.rate*cons.time;
        System.out.println("Simple Interenst is"+I);
        

    }
    
}
