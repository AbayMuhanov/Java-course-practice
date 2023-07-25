package Comparable_And_Comparator;

import java.util.*;

public class Test {
    public static void main(String[] args) {

//        List<Car> cars = new ArrayList<>();
//
//        Car bmw = new Car("BMW E34", 310, 1990);
//        Car mercedes = new Car("Mercedes S63", 290, 2020);
//        Car audi = new Car("Audi Q5", 350, 2010);
//
//        cars.add(bmw);
//        cars.add(mercedes);
//        cars.add(audi);
//
////        Collections.sort(cars); // Comparable
//
//        Comparator<Car> speedComparator = new MaxSpeedCarComparator(); // Comparator
//        cars.sort(speedComparator);
//        System.out.println(cars);

        List<MilitaryPerson> unit = Arrays.asList(
                new MilitaryPerson("Иван", 18, Rank.Рядовой),
                new MilitaryPerson("Саша", 22, Rank.Сержант),
                new MilitaryPerson("Макс", 25, Rank.Саршина),
                new MilitaryPerson("Вова", 33, Rank.Майор),
                new MilitaryPerson("Петя", 50, Rank.Генерал));

        Comparator<MilitaryPerson> nameFilter = new NameFilter();
        unit.sort(nameFilter);

        Comparator<MilitaryPerson> ageFilter = new AgeFilter();
        unit.sort(ageFilter);

        Comparator<MilitaryPerson> rankFilter = new RankFilter();
        unit.sort(rankFilter);

        System.out.println(unit);
    }
}
