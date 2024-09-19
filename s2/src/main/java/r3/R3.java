package r3;

import java.util.ArrayList;
import java.util.List;

public class R3 {
    public static void main(String[] args) {
        String[] cars = new String[]{"Kia", "Honda", "Tesla", "Ford"};

        List<String> carList = new ArrayList<>();
        carList.add("Kia");
        carList.add("Honda");
        carList.add("Tesla");
        carList.add("Ford");

        for (String car : carList) {
            System.out.print(car + " ");
        }
        System.out.println();
        int i = 0;
        while(i < carList.size()){
            System.out.print(carList.get(i) + " ");
            i++;
        }
    }
}
