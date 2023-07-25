package ObjectHachCode;

public class Test {
    public static void main(String[] args) {

        // toString
//        Person person = new Person("Abay", "Muhanov", 21);
//        System.out.println(person.toString());
//
//        Person p1 = new Person();
//        p1.name = "Abay";
//        p1.dnaCode = 900423402;
//
//        Person p2 = new Person();
//        p2.name = "Abay";
//        p2.dnaCode = 900423402;
//
//        System.out.println(p1.equals(p2)); // true


        LuxuryAuto l1 = new LuxuryAuto("Mercedes GLA", 2022, 70_000);
        LuxuryAuto l2 = new LuxuryAuto("Mercedes GLA", 2022, 70_000);
//        System.out.println(l1.equals(l2));

        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());
        System.out.println(l1.hashCode() == l2.hashCode());


    }
}
