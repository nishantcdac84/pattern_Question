package ASSIGNMENT_1.java_coding_uestion.Collection_Question;

import java.util.ArrayList;

public class ques1 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("White");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Purple");
        colours.add("Black");

        for (String color : colours) {
            System.out.println(color);
        }
    }
}
