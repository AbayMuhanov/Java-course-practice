package Interface;

public class Test {
    public static void main(String[] args) {

//        Student student = new Student("Ivan");
//        System.out.println(student.getName());
//
//        Student2 student2 = new StudentImpl("Alexey");
//        System.out.println(student2.getName());


        F1Car f1Car = new F1Car();
        Sedan sedan = new Sedan();
        Truck truck = new Truck();

        truck.gas();
        sedan.gas();
        f1Car.brake();

    }
}
