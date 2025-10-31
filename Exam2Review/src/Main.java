import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] data = {1,2,3,4};
        int[] data2 = new int[4];

        int[][] twoDArray = new int[4][3];
        for(int[] outer: twoDArray) {
            System.out.println(outer);
        }
        data = new  int[12];
        String s = "asdfasdf";


        int[][] data5 = new int[3][];
        int[][][] data6 = new int[3][][];
        doSomething(data);
        int[][][][][][][][][][][][][][][][] data3;

        int[][] data4 = {
            {1},
            {1},
            {1},
            {1},
        };


        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.get(0);


        // polymorphism/inheritance

        Animal animal = new Dog();

        animal = new Fish();
    }



    public static void doSomething(int[] data) {

    }

}

abstract class Animal {
    public Animal() {
        System.out.println("Animal constructed");
    }
    public void eat() {
        System.out.println("I am eating");
    }

    abstract void speak();
}

abstract class Mammal extends Animal{

    public Mammal(String name) {
        System.out.println("Name is " + name);
    }


}

class Dog extends Mammal {
    public Dog() {
        super("asdfasdf");
    }
    @Override
    void speak() {
        System.out.println("Arf!");
    }
}

class Fish extends Animal {
    @Override
    void speak() {
        System.out.println("I am a fish!");
    }
}
