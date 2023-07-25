public class Example {

    static int i;
    int j;


    static {
        i = 10;
        System.out.println("Вызван статический блок");
    }

    Example() {
        System.out.println("Вызов конструктора");
    }
}
