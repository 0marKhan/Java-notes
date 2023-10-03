import java.util.ArrayList;
import java.util.*;

public class ArrayListCode {
    public static void main(String[] args){
        
        // 1D ARRAY LISTS
        ArrayList<String> food = new ArrayList<String>();
        food.add("hamburger");
        food.add("hot dog");
        food.add("sushi");

        // use .size for ArrayLists
        for(int i=0;i<food.size();i++){
            // for index of array list
            System.out.println(food.get(i));
        }

        System.out.println();
        System.out.println("setting food at index 0 to pizza");
        food.set(0, "pizza");
         for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }

        System.out.println();
        System.out.println("removing sushi from the list");
        food.remove(2);
         for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }

        System.out.println();
        System.out.println("clearing the list");
        food.clear();
         for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }



        // 2D ARRAY LISTS
        System.out.println();
        
        ArrayList<String> bakery = new ArrayList<String>();
        bakery.add("pasta");
        bakery.add("garlic bread");
        bakery.add("donuts");

        ArrayList<String> produce = new ArrayList<String>();
        produce.add("tomatoes");
        produce.add("peppers");
        produce.add("chillis");

         ArrayList<String> drinks = new ArrayList<String>();
        drinks.add("monster");
        drinks.add("poweraid");

        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
        groceryList.add(bakery);
        groceryList.add(drinks);
        groceryList.add(produce);
        System.out.println("Printing 2D array list");
        // for list in grocery list
         for (ArrayList<String> list : groceryList) {
            // for item item in list
            for (String item : list) {
                System.out.println(item);
            }
        }

        System.out.println();
        System.out.println("goes to first list in arrayList of lists");
        System.out.println("returns first item from first list");
        System.out.println(groceryList.get(0).get(0));
     
        

    }
}
