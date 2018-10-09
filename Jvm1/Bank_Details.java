import java.util.*;

 class Bank{
     int ROI;
     public int getDetails()
     {
         return 0;
     }
}
class SBI extends Bank{
    @Override
    public int getDetails() {
        ROI=7;
        return ROI;
    }
}
class ICICI extends Bank{
    @Override
    public int getDetails() {
        ROI=8;
        return ROI;
    }
}
class BOI extends Bank{
    @Override
    public int getDetails() {
        ROI=9;
        return ROI;
    }
}


public class Bank_Details {
     public static void main(String args[])
     {
         SBI sb=new SBI();
         ICICI ic=new ICICI();
         BOI boi=new BOI();
         System.out.println("Rate of interest of SBI : "+sb.getDetails());
         System.out.println("Rate of interest of ICICI: "+ic.getDetails());
         System.out.println("Rate of interest of BOI : "+boi.getDetails());
     }

}
