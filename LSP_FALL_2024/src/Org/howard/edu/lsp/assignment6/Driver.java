package Org.howard.edu.lsp.assignment6;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        IntegerSet set1 = new IntegerSet(list);

        System.out.println("Value of Set1 is: " + set1.toString());

        // Handle exception for smallest() and largest()
        try {
            System.out.println("Smallest value in Set1 is: " + set1.smallest());
        } catch (IntegerSetException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Largest value of Set1 is: " + set1.largest());
        } catch (IntegerSetException e) {
            System.out.println("Error: " + e.getMessage());
        }

        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Union of Set1 and Set2");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        set1.union(set2);
        System.out.println("Result of union of Set1 and Set2");
        System.out.println("Value of Set1 is: " + set1.toString());

        System.out.println("Intersection of Set1 and Set2");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        set1.intersect(set2);
        System.out.println("Result of intersection of Set1 and Set2");
        System.out.println("Value of Set1 is: " + set1.toString());

        System.out.println("Difference of Set1 and Set2");
        System.out.println("Value of set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        set1.diff(set2);
        System.out.println("Result of difference of Set1 and Set2");
        System.out.println("Value of Set1 is: " + set2.toString());

        System.out.println("Complement of Set1 and Set2");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        set1.complement(set2);
        System.out.println("Result of complement of Set1 and Set2");
        System.out.println("Value of Set1 is: " + set1.toString());

        System.out.println("Is Set1 empty? " + set1.isEmpty());
        System.out.println("Is Set2 empty? " + set2.isEmpty());
        set1.clear();

        System.out.println("Is Set1 empty? " + set1.isEmpty());
        System.out.println("Length of Set2 is: " + set2.length());
        System.out.println("Are Set1 and Set2 equal? " + set1.equals(set2));
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println("Are Set1 and Set2 equal? " + set1.equals(set2));

        System.out.println("Does Set2 contain 3? " + set2.contains(3));
    }
}
