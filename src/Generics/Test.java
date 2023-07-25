package Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

//        BoxInteger box1 = new BoxInteger(1, 404);
//        BoxString box2 = new BoxString(1, "Шапка");
//
//        BoxAnyType box3 = new BoxAnyType(2, Math.PI);
//        Double value = (Double) box3.getValue();
//
//
//        System.out.println(box1); // Generics.BoxInteger@2d98a335
//        System.out.println(box2); // Generics.BoxString@16b98e56
//        System.out.println(value); // 3.141592653589793


//        Box<Integer> box = new Box<>(1, 404);
//        Box<String> box2 = new Box<>(1, "Шапка ");
//        Box<Double> box3 = new Box<>(1, Math.PI);
//        Box box4 = new Box(2500, 12L);
//        Box box5 = new Box(2500, 12);
//
//        System.out.println(box.getKey()); // 1
//        System.out.println(box.getValue()); // 404
//        System.out.println();
//
//        System.out.println(box2.getKey()); // 1
//        System.out.println(box2.getValue()); // Шапка
//        System.out.println();
//
//        System.out.println(box3.getKey()); // 1
//        System.out.println(box3.getValue()); // 3.141592653589793
//        System.out.println();
//
//        System.out.println(box4.getKey()); // 2500
//        System.out.println(box4.getValue()); // 12
//        System.out.println();
//
//        System.out.println(box5.getKey()); // 2500
//        System.out.println(box5.getValue()); // 12

//        List<String> strings = new ArrayList<>();
//
//        strings.add("Старая сторока 1");
//        strings.add("Старая сторока 2");
//        strings.add("Старая сторока 3");
//
//        fill(strings, "Новая сторока");
//        System.out.println(strings);
//
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//
//        fill(numbers, 888);
//        System.out.println(numbers);
//    }
//
//    public static <T> void fill(List<T> list, T val) {
//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, val);
//        }


//        BoxET<String, String> box3 = new BoxET<>("Шапка1","Шапка2");
//
//        System.out.println(box3.getKey());
//        System.out.println(box3.getValue());


// Wildcards

//        List<Animal> animals = new ArrayList<>();
//        animals.add(new Animal());
//        animals.add(new Animal());
//
//        List<Pet> pets = new ArrayList<>();
//        pets.add(new Pet());
//        pets.add(new Pet());
//
//        List<Cat> cats = new ArrayList<>();
//        cats.add(new Cat());
//        cats.add(new Cat());
//
//        List<Dog> dogs = new ArrayList<>();
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//
//        iterateAnimals(animals);
//        iterateAnimals(pets);
//        iterateAnimals(cats);
//        iterateAnimals(dogs);
    }
//    public static void iterateAnimals(Collection<? super Cat> animals) {
////        for (Animal animal : animals) {
////            System.out.println("Ещё один шаг в цикле пройден!");
////        }
//
//        for (int i = 0; i < animals.size(); i++) {
//            System.out.println("Ещё один шаг в цикле пройден!");
//        }
//
//    }
}
