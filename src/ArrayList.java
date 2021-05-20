import java.util.List;

public class ArrayList {


    public void excercises() {

        //Write a Java program to create a new array list, add some colors (string) and print out the collection
        List<String> colors = new java.util.ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("White");
        colors.add("Black");
        colors.add("Green");

        colors.forEach(x -> System.out.println(x));

        //Write a Java program to insert an element into the array list at the first position.
        colors.add(0,"Pink");
        colors.add(5,"Brown");

        System.out.println();
        colors.forEach(x -> System.out.println(x));

        //Write a Java program to retrieve an element (at a specified index) from a given array list.
        System.out.println();
        String element = colors.get(5);
        System.out.println(element);

        //Write a Java program to update specific array element by given element.
        System.out.println();
        colors.set(5,"Orange");

        //Write a Java program to remove the third element from a array list.
        colors.remove(2);
        colors.forEach(x -> System.out.println(x));

        //Write a Java program to search an element in a array list.


    }


}
