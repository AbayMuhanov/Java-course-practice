package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
//        System.out.println("Начало Программы");

//        try {
//            System.out.println("Перед вызовом method1");
//            method1();
//            System.out.println("После вызова method1. Это строка некогда не будет показана");
//        } catch (Exception e) {
//            System.out.println("Исключение было поймано");
//        }
//        System.out.println("Программа всё ещё работает");
//    }
//
//    public static void method1() {
//        int a = 5;
//        int b = 0;
//        System.out.println(a / b);
//    }

//        try {
//            int a = 5;
//            int b = 0;
//            System.out.println(a / b);
//        } catch (ArithmeticException ex) {
//            System.out.println("Нельзя делить на 0");
//        } catch (RuntimeException ex) {
//            System.out.println("Введенные данные не коректны");
//        } finally {
//            System.out.println("Этот блок выполняется всегда");
//        }

//        try {
//            method2();
//        } catch (Exception e) {
//            System.out.println("Исключение обработано");
//        }

//        method4();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число");
//        int value = scanner.nextInt();
//
//        if (value < 0) {
//            throw new Exception("Ваше значение не должно быть меньше нуля");
//        }

        Dog dog = new Dog("Шарик");
        dog.putCollar();
        dog.putLeash();
        dog.putMuzzle();

        try {
            dog.walk();
        } catch (DogIsNotReadyException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Проверяем сняряжение! ошейник одет? " + dog.isCollarPutOn
                    + "\nповодот надет? " + dog.isLeashPutOn + "\nнамордник надет ? "
                    + dog.isMuzzlePutOn);
        }
    }

    //    public void myMethod() throws FileNotFoundException {
//        FileInputStream test = new FileInputStream("C://SomeDir//notes.txt");
//    }

//    public static void method1() throws FileNotFoundException, ClassNotFoundException {
//        FileInputStream fis = new FileInputStream("C2://fileName.txt");
//    }
//
//    public static void method2() throws FileNotFoundException, ClassNotFoundException {
//        method1();
//    }
//
//    public static void method3() throws ClassNotFoundException {
//        try {
//            method1();
//        } catch (FileNotFoundException e) {
//            System.out.println("FileNotFoundException был пойман.");
//        }
//    }
//
//    public static void method4() {
//        try {
//            method1();
//        } catch (FileNotFoundException e) {
//            System.out.println("FileNotFoundException был пойман");
//        } catch (ClassNotFoundException e) {
//            System.out.println("ClassNotFoundException был пойман");
//        }
//    }
}
