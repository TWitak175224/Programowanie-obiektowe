public class Main {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();
        Box<Double> box3 = new Box<>();
        box1.setValue("Hello");
        box2.setValue(123);
        box3.setValue(21.37);
        System.out.println(box1.getValue());
        System.out.println(box2.getValue());
        System.out.println(box3.getValue());
        System.out.println("\n\n\n\n");

        Dog[] tablica = new Dog[5];
        Pies first1 = new Pies("Pyza", 11);
        Pies second1 = new Pies("Morfik", 17);
        System.out.println(findmax(first1, second1).getName());

        System.out.println("\n\n\n\n");

        Dog first = new Dog("Pyza", 11);
        Dog second = new Dog("Morfik", 17);
        Dog third = new Dog("Zira", 22);
        Dog Andrzej = new Dog("Andrzej", 10);
        Dog Kamil = new Dog("Kamil", 11);

        tablica[0] = first;
        tablica[1] = second;
        tablica[2] = third;
        tablica[3] = Andrzej;
        tablica[4] = Kamil;
        Pair<Dog> para = new Pair<>(first, second);
        findMinMaxAge(tablica, para);
        System.out.println(para.getFirst().getName() + " " + para.getFirst().getAge());
        System.out.println(para.getSecond().getName() + " " + para.getSecond().getAge());
        System.out.println("\n\n\n\n");

        Integer[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] myStringArray = {"aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh"};
        swap(myIntArray, 2, 5);
        swap(myStringArray, 1, 3);
        System.out.println("\n\n\n\n");


    }

    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }

    public static <T extends Zwierze> T findmax(T element1, T element2) {
        if (element1.getAge() > element2.getAge()) {
            return element1;
        }
        return element2;

    }

    public static void findMinMaxAge(Dog[] table, Pair<? super Dog> pair) {
        Dog min = table[0];
        Dog max = table[0];
        for (int i = 1; i < table.length; i++) {
            if (table[i].getAge() < min.getAge()) {
                min = table[i];
            }
            if (table[i].getAge() > max.getAge()) {
                max = table[i];
            }
        }
        pair.setFirst(min);
        pair.setSecond(max);
    }

    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T extends Comparable<T>> T minValue(T[] array) {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public static <T extends Zwierze> T findMax(Pair<?extends Zwierze> pair) {
        if (pair.getFirst().getAge() > pair.getSecond().getAge()) {
            return (T)pair.getFirst();
        }
        return (T)pair.getSecond();

    }
}

class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class Triple<T, U, V> {
    private T a;
    private U b;
    private V c;

    public void setValue(T a, U b, V c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getFirst() {
        return a;
    }

    public U getSecond() {
        return b;
    }

    public V getThird() {
        return c;
    }
}

class Zwierze {
    private final int age;

    Zwierze(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Pies extends Zwierze {
    private String name;

    Pies(String name, int age) {
        super(age);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Animal {
    private final String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    private int age;

    Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(String name) {
        this.age = age;
    }
}

class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
