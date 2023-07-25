package String;

public class StringTest {
    public static void main(String[] args) {


//        String str = "berlin";
//        str = str + "-" + str;
//        System.out.println(str);
//
//        System.out.println();
//
//        String s = "berlin";
//        StringBuilder s2 = new StringBuilder(s);
//        s2.append("-");
//        s2.append(s);
//        s = s2.toString();
//        System.out.println(s);

//        String str = "Good morning";
//        int n = str.length();

//        System.out.println(str);
//        System.out.println(n);

//        char c = str.charAt(5);
//        System.out.println(c);

//        String str = "cat";
//        boolean test1 = str.equals("cat"); // true
//        boolean test2 = str.equals("Cat"); // false
//        boolean test3 = str.equals("c" + "a" + "t"); // true

//        System.out.println(test1);
//        System.out.println(test2);
//        System.out.println(test3);

//        boolean test4 = str.equalsIgnoreCase("cat"); // true
//        boolean test5 = str.equalsIgnoreCase("Cat"); // true
//        boolean test6 = str.equalsIgnoreCase("cAT"); // true
//
//        System.out.println(test4);
//        System.out.println(test5);
//        System.out.println(test6);
//

//        String str = "Good morning";
//        String str1 = str.toUpperCase();
//        String str2 = str.toLowerCase();

//        System.out.println(str1);
//        System.out.println(str2);

//        str = str.trim();
//        System.out.println(str);

//        str = str.substring(1);
//        System.out.println(str);

//        String str = "apple apple";
//        System.out.println(str.contains("apple"));
//        System.out.println();
//        System.out.println(str.equals("apple"));
//        System.out.println(str.contains("apple"));


//        String str = "Good news everyone!";
//        String str2 = str.replace('o','a');
//        System.out.println(str2);

//        String value1 = "The lesson";
//        String value2 = "about ";
//        String value3 = "objects";
//
//        StringBuilder result = new StringBuilder();
//        result.append(value1);
//        result.append(value2);
//        result.append(value3);
//
//        System.out.println(result);

//        String str = "Runtime";
//        StringBuilder str2 = new StringBuilder(str);
//        str2.append(" the best");
//        str = str2.toString();
//        System.out.println(str);

//        str2.deleteCharAt(2);
//        System.out.println(str); // Rutime
//        System.out.println(str2);

//        str2.replace(2, 5, "_T_"); // Ru_T_me
//
//        System.out.println(str);
//        System.out.println(str2);

//        str2.reverse(); // emitnuR
//        System.out.println(str2);


//        String text = "application hello template";
//        String word = "hello";
////
//        if (text.contains(word)) {
//            System.out.println("Слово " + word + " есть в стороке text");
//        } else {
//            System.out.println("Слово " + word + "нет в стороке text");
//        }

//        if (text.indexOf(word) != -1) {
//            System.out.println("Слово " + word + " есть в стороке text");
//        } else {
//            System.out.println("Слово " + word + "нет в стороке text");
//        }


        String[] names = {"Alex", "Drake", "Anya", "Leon", "Adam"};

//        for (String name : names){
//            if (name.startsWith("A")){
//                System.out.println(name);
//            }
//        }

//        for (String name : names) {
//            if (name.indexOf("A") == 0) {
//                System.out.println(name);
//            }
//        }

//        for (String name : names) {
//            if (name.charAt(0) == 'A') {
//                System.out.println(name);
//            }
//        }


        String text = "application hello transaction template";

        System.out.println(text.length());

        int firstSpacePos = text.indexOf(' ');
        String firstWord = text.substring(0, firstSpacePos);
        System.out.println("Первое слово: " + firstWord);
        int lastSpacePos = text.lastIndexOf(' ');
        String lastWord = text.substring(lastSpacePos + 1);
        System.out.println("Последнее слово: " + lastWord);

    }
}
