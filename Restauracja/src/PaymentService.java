import java.util.ArrayList;

class PaymentService {

    public static void printBill (ArrayList<Dish> order){
        double priceSum = 0;
        for (Dish d:order) {
            priceSum+=d.getPRICE();
        }
        double tip = 0;
        if (priceSum<100){
            tip = priceSum*0.15;
        }else {
            tip = priceSum*0.1;
        }
        System.out.printf("Do zapłaty: %.2f, w tym koszt obsługi: %.2f", priceSum+tip, tip);
    }
}
