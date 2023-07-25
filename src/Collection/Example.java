package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example {
    public static void main(String[] args) {

//        List<String> fruits = Arrays.asList("Apple", "Orange", "Banana");

        // Обычный цикл
//        for (int i = 0; i < fruits.size(); i++) {
//            String fruit = fruits.get(i);
//            System.out.println("fruit: "+ fruit);
//        }


        // Обычный цикл с итератором
//        for (Iterator<String> it = fruits.iterator(); it.hasNext(); ) {
//            String fruit = it.next();
//            System.out.println("fruit: " + fruit);
//        }


        // Итератор с циклом while
//        Iterator<String> it = fruits.iterator();
//        while (it.hasNext()) {
//            String fruit = it.next();
//            System.out.println("fruit: " + fruit);
//        }


        // foreach цикл
//        for (String fruit : fruits) {
//            System.out.println("fruit: " + fruit);
//        }


//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(12);
//        numbers.add(8);
//        numbers.add(2);
//        numbers.add(23);

//        Iterator<Integer> it = numbers.iterator();
//
//        while (it.hasNext()) {
//            Integer i = it.next();
//            if (i < 10) {
//                it.remove();
//            }
//        }
//        System.out.println(numbers);


//        Iterator<Integer> iterator = numbers.iterator();
//        while (iterator.hasNext()) {
//            Integer num = iterator.next();
//            numbers.remove(num); // с этим кодом выдаст исключение ConcurrentModificationException

//            Integer num = iterator.next();
//            iterator.remove();
        /* это моя переделанная
                                  [8, 2, 23]
                                  [2, 23]
                                  [23]
                                  []
            */
//            System.out.println(numbers);

//        Iterator<String> iterator = fruits.iterator();
//        while (iterator.hasNext()) {
//            iterator.next();
//            iterator.remove();
//        }


    }

}
