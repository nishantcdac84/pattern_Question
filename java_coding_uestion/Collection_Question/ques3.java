package ASSIGNMENT_1.java_coding_uestion.Collection_Question;

import java.util.ArrayList;
import java.util.Scanner;

public class ques3 {
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

        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();
        if (index>=0 && index<colours.size()) {
            System.out.println(colours.get(index));
        } else {
            System.out.println("Enter Invalid index");
        }
    }
}
