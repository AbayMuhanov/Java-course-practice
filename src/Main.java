
public class Main {
    public static void main(String[] args) {

//        int number1 = 1_000_000;
//        long number2 = 1_000_000L;

//        int a = 10;
//        long b = 2021L;
//        long result = a + b;

//        int a = 500;
//        long b = 400L;
//        long result = a - b;


//        byte value1 = 120;
//        byte value2 = 3;
//        int value3 = value1 + value2;
//
//        long value4 = 1_000_000_000L;
//        long value5 = 3_000_000_000L;
//
//        long value6 = value4 + value5;

//        System.out.printf("%.2f",0.257674);
//        System.out.println();
//        System.out.printf("%.4f",0.257674);


        // символьный литерал

//        char letter = 'N';

        // код символа Unicode в десятичном исчислении

//        char letter2 = 78;

// '\ uxxxx' – символ Unicode,

// где xxxx цифровой код символа Unicode вшестнадцатеричной форме

//        char letter3 = '\u0053';

//        System.out.println(letter);
//        System.out.println(letter2);
//        System.out.println(letter3);


//        ---- String -----


//        String text = "Welcome to Runtime";
//        char symbol = text.charAt(0); //W
//        int textLength = text.length(); //18
//
//        System.out.println(symbol);
//        System.out.println(textLength);


//        String s1 = "Welcome to Runtime";
//        String s2 = "Welcome to Runtime";
//
//        System.out.println(s1.equals(s2));
//
//        String value1 = "The lesson";
//        String value2 = " about";
//        String value3 = " objects";
//        String result = value1 + " " + value2 + " " + value3;

//        StringBuilder result = new StringBuilder();
//
//        result.append(value1);
//        result.append(value2);
//        result.append(value3);
//
//        result.toString();
//        System.out.println(result);


//        Условные операторы и циклы


//        int a = 1;
//        int b = 5;
//
//        a++;
//        b--;
//
//        System.out.println("a: " + a + ", b: " + b);

//        int a = 1;
//        int b = 5;
//
//        a = a + 1;
//        b = b - 1;
//
//        System.out.println("a: " + a + ", b: " + b);

//        int a = 0;

//        System.out.println(a++); // 0
//        System.out.println(a);   // 1

//        System.out.println(++a); // 1
//        System.out.println(a);   // 1

//        int a = 5;
//        int b = 2;
//
//        System.out.println(a % b);

//        int a = 5;
//        int b = 6;
//        System.out.println(a == b); // false, так как 5 не равно 6
//
//        int c = 2;
//        int d = 2;
//        System.out.println(c == d); // true, так как 2 равно 2

//        int a = 5;
//        int b = 6;
//        System.out.println(a != b); // true, так как 5 не равно 6
//        int c = 2;
//        int d = 2;
//        System.out.println(c != d); // false, так как 2 равно 2


//        int a = 3;
//        System.out.println(a == 2 ? "Hello" : "Error");

//        int refrigeratorTemperature = 100;
//        int switchOnRefrigeratorEngine = (refrigeratorTemperature >= 0) ? 1 : 0;
//
//        System.out.println(switchOnRefrigeratorEngine);

//        int product = 1;
//        while (product < 10) {
//            System.out.println("Текущее количество корзины: " + product);
//            product++;
//        }

//        int a = 1;
//        do {
//            System.out.println("Цифра: " + a);
//            a++;
//        } while (a <= 10);


//        int pasta = 0; // Количество макарон в кастрюле
//        int potSize = 50; // Емкость кастрюли
//        do {
//            pasta = pasta + 10;
//            System.out.println("Количество пасты в кастрюле: " + pasta);
//        } while (pasta < potSize);

//        for (int i = 1; i < 5; i++) {
//            System.out.println("Количество кусочков картошки: " + i);
//        }

//        int[] numbers = {1, 2, 3, 4, 5};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i]);
//        }
//        System.out.println();
//
//        int[] numberss = {1, 2, 3, 4, 5};
//        for (int number : numberss) {
//            System.out.print(number);
//        }


//        for (int i = 0; i < 10; i++) {
//            if (i % 2 != 0) {
//                continue;
//            }
//            System.out.println("Морковь номер: " + i);
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.print("Runtime ");
//            if (i == 3) {
//                break;
//            }
//        }

//        for (int i = 1; i <= 3; i++) {
//            System.out.println("Это первый цикл! Я выполняюсь " + i + " раз");
//            for (int a = 1; a <= 10; a++) {
//                System.out.println(" Это второй цикл! Я выполняюсь " + a + " раз");
//                if (a == 2) {
//                    break;
//                }
//            }
//        }

//        for (int i = 1; i <= 7; i++) {
//            System.out.println(i + ": я выполняюсь перед continue");
//            if (i > 2) {
//                continue;
//            }
//            System.out.println(" " + i + ": я выполняюсь всего два раза");
///        }

//        java.util.Scanner scan = new java.util.Scanner(System.in);
//        System.out.println("Введите число");
//        int num1 = scan.nextInt();
//        System.out.println("Ваше число: " + num1);

//        java.util.Scanner scan = new java.util.Scanner(System.in);
//        System.out.println("Введите первое число");
//        int num1 = scan.nextInt();
//        System.out.println("Введите второе число");
//        int num2 = scan.nextInt();
//        int result = num1 + num2;
//        System.out.println("Результат сложения: " + result);
//
//        DrumKit d = new DrumKit();
//
//        d.playSnare();
//        d.playTopHat();
//
//        d.snare = false;
//
//        if (d.snare == true){
//            d.playSnare();
//        }


//        int[] prices = new int[5];
//
//        prices[0] = 10;
//        prices[1] = 20;
//        prices[2] = 30;
//        prices[3] = 40;
//        prices[4] = 50;
//
//        int[] newPrices = new int[5];
//
//        newPrices = prices.clone();
//
//        newPrices[0] = 60;
//        newPrices[1] = 70;
//        newPrices[2] = 80;
//        newPrices[3] = 90;
//        newPrices[4] = 100;
//
//        System.out.print(Arrays.toString(prices));
//        System.out.println(Arrays.toString(newPrices));
//
        // [10, 20, 30, 40, 50][60, 70, 80, 90, 100]

//        int[] numbers = {4, 3, 5, 1, 2};
//        System.out.println(Arrays.toString(numbers)); // [4, 3, 5, 1, 2]
//
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 4, 5]

//        Cat[] kittens = new Cat[5];
//
//        kittens[0] = new Cat();
//        kittens[0].name = "Пушок";
//        System.out.println(kittens[0].name);
//        kittens[0].eat();
//
//
//        kittens[1] = new Cat();
//
//        System.out.println();
//
//        Cat pushok = new Cat();
//        pushok.name = "Пушок";
//        System.out.println(pushok.name);
//        pushok.run();
//        pushok.eat();

//        Books[] books = new Books[3];
//        int x = 0;
//
//        books[0] = new Books();
//        books[1] = new Books();
//        books[2] = new Books();
//
//        books[0].title = "Плоды Java";
//        books[1].title = "Java Гэтсби";
//        books[2].title = "Сборник рецептов по Java";
//
//        books[0].author = "Боб";
//        books[1].author = "Сью";
//        books[2].author = "Ян";
//
//        while (x < 3) {
//            System.out.print(books[x].title);
//            System.out.print(", автор: ");
//            System.out.println(books[x].author);
//            x = x + 1;
//        }
//        Hobbits[] h = new Hobbits[3];
//        int z = 0;
//
//        while (z < 3) {
//
//            h[z] = new Hobbits();
//            h[z].name = "Бильбо";
//
//            if (z == 1) {
//                h[z].name = "Фродо";
//            }
//            if (z == 2) {
//                h[z].name = "Сэм";
//            }
//            System.out.print(h[z].name + " - ");
//            System.out.println("Имя прохожего хоббита");
//            z = z + 1;
//        }

//        int[] index = new int[4];
//        index[0] = 1;
//        index[1] = 3;
//        index[2] = 0;
//        index[3] = 2;
//
//        String[] islands = new String[4];
//        islands[0] = "Бермуда";
//        islands[1] = "Фиджи";
//        islands[2] = "Азорские осторова";
//        islands[3] = "Косумель";
//
//
//        int y = 0;
//        int ref;
//
//        while (y < 4) {
//            ref = index[y];
//            System.out.print("осторов = ");
//            System.out.println(islands[ref]);
//            y = y + 1;
//
//        }


//        Animal animal = new Animal();
//        Cat cat = new Cat();
//
//        animal.voice();
//        cat.voice();


//        Overloading overloading = new Overloading();
//        overloading.test(2);
//        overloading.test("Runtime");
//        overloading.test(2.5);


//        Car c1 = new Car("Lamborghini Aventador",500);
//        System.out.println(c1.model);
//        System.out.println(c1.maxSpeed);

//        c1.color = "black";
//        c1.accelerationTo100km = 2;
//        c1.engineVolume = 6.5;
//        c1.manufacturerCountry = "Italy";
//        c1.ownerFirstName = "Petya";
//        c1.yearOfIssue = 2021;
//        c1.insurance = true;
//        c1.price = 2_000_000;
//        c1.isNew = true;
//        c1.placesInTheSalon = 2;
//        c1.maxSpeed = 500;
//        c1.model = "Lamborghini";
//
//        System.out.println("Модель Lamborghini Aventador. Объём двигателя - " +
//                c1.engineVolume + ", объём багажника - " + c1.trunkVolume + ", салон сделан из "
//                + c1.salonMaterial + ", ширина дисков - " + c1.wheels + ". Была приобретина в 2021 году господином " + c1.ownerFirstName);

//        Cat c1 = new Cat("Barsik ", 5);
//        Cat c2 = new Cat("Murzik");
//
//        System.out.print(c1.name);
//        System.out.println(c1.age);
//
//        System.out.println(c2.name);

//        Cat c3 = new Cat();
//        String personName = p1.getName();
//        int personAge = p1.getAge();
//        int personWeight = p1.getWeight();

//        System.out.println("Имя человека: " + personName);
//        System.out.println("Возраст человека: " + personAge);
//        System.out.println("Вес человека: " + personWeight);
//
//        System.out.println();
//
//        System.out.println("Изначально имя человека - " + p1.getName());
//        p1.setName("Алексей");
//        System.out.println("Новое имя человека - " + p1.getName());
//
//        System.out.println();
//
//        p1.setAge(-10);
//        System.out.println("Возраст Василия : " + p1.getAge() + " лет");

//        Animal animal = new Pet();
//        animal.introduce();
//
//        WildAnimal wildAnimal = new Coyote();
//        Coyote coyote = (Coyote) wildAnimal;
//        coyote.introduce();
//        Pet pet = (Pet) new Animal();
//        pet.introduce();
//        Pet pet = new Pet();
//        Animal animal = pet;
//
//        Pet pet2 = (Pet) animal;
//        pet2.introduce();

//
//        Truck truck = new Truck();
//        System.out.println(truck instanceof Car);
//
//        Car car = new Car();
//        System.out.println(car instanceof Truck);

//        Car car1 = new Car();
//        Truck truck1 = new Truck();
//
//        System.out.println(car1 instanceof  ObjectHachCode && truck1 instanceof  ObjectHachCode);
//        int orig = 42;
//        Xcopy x = new Xcopy();
//        int y = x.go(orig);
//        System.out.println(orig + " " + y);
//        Clock clock = new Clock();
//        clock.setTime("12345");
//        String tod = clock.getTime();
//        System.out.println("Время : " + tod);


//        int count = 0;
//        Mix4[] m4a = new Mix4[20];
//        int x = 0;
//
//        while (x < 20) {
//            m4a[x] = new Mix4();
//            m4a[x].counter = m4a[x].counter + 1;
//            count = count + 1;
//            count = count + m4a[x].maybeNew(x);
//            x = x + 1;
//        }
//        System.out.println(count + " " + m4a[1].counter);

//        Cat cat = new Cat();
//        Lion simba = new Lion();
//        Tiger tiger = new Tiger();
//        Cheetah cheetah = new Cheetah();
//        Doctor doctor = new Doctor();
//
//        doctor.headCat(simba);
//        doctor.headCat(tiger);
//        doctor.headCat(cheetah);

//        Car.myStatic += 20;
//
//        Car c1 = new Car();
//        System.out.println("Статические переменная c1: " + c1.myStatic);
//        c1.notStatic += 20;
//        System.out.println("Не статическое переменная 1: " + c1.notStatic);
//
//
//        Car c2 = new Car();
//        System.out.println("Статические переменная c2: " + c2.myStatic);
//        System.out.println("Не статическое переменная c2: " + c2.notStatic);

//        Counter.invokeCOUNTER();
//        Counter.invokeCOUNTER();
//        Counter.invokeCOUNTER();

//        System.out.println(StaticBlockDemo.ranks);

//        Example example1 = new Example();
//        Example example2 = new Example();


//        Cat cat = new Cat();
//        Dog dog = new Dog();
//
//        cat.voice();
//        dog.voice();


//        A a = new A();
//        B b = new B();
//        C c = new C();
//        A a2 = new A();
//
//        a2.m1();
//        a2.m2();
//        a2.m3();

//        Monster[] ma = new Monster[3];
//
//        ma[0] = new Vampire();
//        ma[1] = new Dragon();
//        ma[2] = new Monster();
//
//        for (int x = 0; x < 3; x++) {
//            ma[x].frighten(x);
//        }


    }
}

