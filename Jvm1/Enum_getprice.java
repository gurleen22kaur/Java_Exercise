
import java.util.*;

enum House {
    COTTAGE(5000), BUNGALOW(6000), APARTMENT(5500), CARAVAN(2000), CASTLE(10000), DUPLEX(8000), FARMHOUSE(6500);
    private int price;

    House(int p) {
        price = p;

    }
    public int getPrice() {
        return price;
    }
}
    public class Enum_getprice {
    public static void main(String[] args) {
        System.out.println("Prices for all the houses: ");
        for(House h : House.values()){
            System.out.println(h+" is priced at "+h.getPrice());
            
        }
    }
}





