public class test {
    public static void main(String[] args) {
        Person p1 = new Person("ravi");
        Person p2 = new Person("sachin",27);
        p1.display();
        p2.display();
    }

    }


class Person {
    String name;
    int age;

    public Person(String name) {
        this.name = name;
        this.age = 18;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    void display() {
        System.out.println("name " + name);
        System.out.println("age " + age);
    }
}