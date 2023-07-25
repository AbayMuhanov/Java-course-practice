package ObjectHachCode;

public class Person {
    //    private String name;
    private String surname;
    private int age;

    public String name;
    int dnaCode;

//    public Person(String name, String surname, int age) {
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//    }


    // toString()
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", age=" + age +
//                '}';
//    }

    // метод equals
//    @Override
//    public boolean equals(ObjectHachCode obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        Person person = (Person) obj;
//        return dnaCode == person.dnaCode;
//    }

    @Override
    public int hashCode() {
        return dnaCode;
    }

}
