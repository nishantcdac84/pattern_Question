package ASSIGNMENT_1.java_coding_uestion.Collection_Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ques4 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("White");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Purple");
        colours.add("Black");
        colours.add(0, "Nishant");

        for (String color : colours) {
            System.out.println(color);
        }

        Collections.sort(colours);
        System.out.println("--------------------------------------------------------------------");
        for (String color : colours) {
            System.out.println(color);
        }

        Collections.sort(colours, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
    }
}
