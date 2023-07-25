package Collection;

import java.util.*;

public class Test {
    private static Map<Integer, DriverLicense> allLicenses = new HashMap<>();

    public static void main(String[] args) {
//        ArrayList<Cat> cats = new ArrayList<>();

        // метод для добавления нового элемента. Это метод add();
//        cats.add(new Cat("Барсик"));


//        Cat barsik = new Cat("Барсик"); // 0 , если раскоментировать прошлый объект то результат будет 1 а не 0;
//        Cat mikki = new Cat("Микки");   // 1
//        Cat markiz = new Cat("Маркиз"); // 2
//        Cat pushok = new Cat("Пушок");  // 3
//
//        cats.add(barsik);
//        cats.add(mikki);
//        cats.add(markiz);
//        cats.add(pushok);

//        int barsikIndex = cats.indexOf(markiz); // 1. Мы передаем в него ссылку на нужный объект, и indexOf() возвращает нам его индекс
//        System.out.println(barsikIndex);

//        Cat secondCat = cats.get(1); // Cat{name='Микки'} ,поиск элемента по индексу. Для этого в нем реализован метод get();
//        System.out.println(secondCat);

//        System.out.println(cats.contains(pushok)); // true
//        cats.remove(pushok); // удоляет элемент массива
//        System.out.println(cats.contains(pushok)); // false

//        System.out.println(cats); // [Cat{name='Барсик'}, Cat{name='Микки'}]
//        cats.set(0, markiz); // вставка через set() затирает старое значение, хранящееся в ячейке
//        System.out.println(cats); // [Cat{name='Маркиз'}, Cat{name='Микки'}]

//        System.out.println(cats); // [Cat{name='Барсик'}, Cat{name='Микки'}]
//        cats.add(0, markiz); // А вот add() сработал иначе. Он сдвинул все элементы вправо и после этого записал новое значение в ячейку 0.
//        System.out.println(cats); // [Cat{name='Маркиз'}, Cat{name='Барсик'}, Cat{name='Микки'}]

//        cats.clear(); // Чтобы полностью очистить список, используется метод clear():
//        System.out.println(cats); // [] (Пусто)

//        System.out.println(cats.size()); // 2, Кстати про размер. Текущий размер списка можно узнать при помощи метода size()

//        Map<String, Integer> ages = new HashMap<>();
//        // put(k,v) — добавить элемент v с ключом k;
//        ages.put("Иванов", 33);
//        ages.put("Петров", 27);
//
//        ages.put(null, 125);
//
//        System.out.println(ages); // {null=125, Иванов=33, Петров=27}
//        addLicenses();
//        printAll();

//        Set<String> set = new HashSet<>();
//
//        set.add("A");
//        set.add("B");
//        set.add("A");
//
//        System.out.println(set.contains("A")); // true
//        System.out.println(set); // [A, B]
//        set.remove("A");
//        System.out.println(set); // [B]

    }
//    private static void addLicense(DriverLicense license) {
//        allLicenses.put(license.getId(), license);
//    }
//
//    private static void addLicenses() {
//        addLicense(new DriverLicense(1, "Василий"));
//        addLicense(new DriverLicense(2, "Генадий"));
//        addLicense(new DriverLicense(3, "Кирилл"));
//        addLicense(new DriverLicense(4, "Володя"));
//        addLicense(new DriverLicense(5, "Иван"));
//    }
//
//    private static void printAll() {
//        for (Map.Entry<Integer, DriverLicense> entry : allLicenses.entrySet()) {
//            System.out.println("id: " + entry.getKey() + " license: " + entry.getValue());
//        }
//    }
}
