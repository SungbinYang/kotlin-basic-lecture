package me.sungbin.lec03;

public class Lec03Main {
    static void main() {
        String str = """
                ABC
                TEXT
               
                """;
        System.out.println(str);

        String charString = "ABC";
        System.out.println(charString.charAt(0));
    }

    public static void printAgeIfPersonV1(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            System.out.println(person.getAge());
        }
    }

    public static void printAgeIfPersonV2(Object obj) {
        if (obj instanceof Person person) {
            System.out.println(person.getAge());
        }
    }
}
