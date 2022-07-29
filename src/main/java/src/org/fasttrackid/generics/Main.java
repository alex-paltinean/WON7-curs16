package src.org.fasttrackid.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>("Ana");
        System.out.println(box1.getItem().length());

        Box<Integer> box2 = new Box<>(5);
        System.out.println(box2.getItem() > 4);

        Box<List<Integer>> listBox;


        OldBox old1 = new OldBox("Ana");
        System.out.println(((String) old1.getItem()).length());

        OldBox old2 = new OldBox(5);
        if (old2.getItem() instanceof String) {
            System.out.println(((String) old2.getItem()).length());
        }


        NumberBox<Integer> numberBox1 = new NumberBox<>(2);
        NumberBox<Double> numberBox2 = new NumberBox<>(4.67);

        System.out.println(numberBox2.getIntValue());
    }

    public static List<Pair<String, Integer>> nameToAge() {
        List<Pair<String, Integer>> pairs = new ArrayList<>();
        pairs.add(new Pair<>("Ane", 20));
        pairs.add(new Pair<>("Alex", 22));
        return pairs;
    }
}
