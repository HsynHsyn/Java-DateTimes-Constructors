package Saturday_Reviews.week10;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.ArrayList;
import java.util.Arrays;


public class TestFood {
    public static void main(String[] args) {
        Food[] foodArray = new Food[5];
        foodArray[0] = new Food("apple", 3, 3.45);
        foodArray[1] = new Food("strawberry", 5, 2.75);
        foodArray[2] = new Food("pineapple", 2, 6.45);
        foodArray[3] = new Food("avocado", 4, 5.95);
        foodArray[4] = new Food("almonds", 6, 2.25);
         System.out.println(Arrays.toString(foodArray));
        ArrayList<Food> foodList = new ArrayList<>();
        foodList.addAll(Arrays.asList(foodArray));
        for (Food each : foodList) {
            if (each.name.charAt(0) == 'a')
                System.out.println(each.name);

        }
        System.out.println("===========================");
        for (Food e : foodList) {
            if (e.totalPrice > 20.0)
                System.out.println(e.name);
        }
    }
}
