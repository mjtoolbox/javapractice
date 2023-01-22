package arrayexample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        char vowels[] = new char[5];

        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';

        System.out.println("These are the vowels: " + Arrays.toString(vowels));


        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //resizeArray();
        System.out.println("---------------");
        //angleTriangle();
        //linkedListDemo();
        linkedListManipulation();
    }

    public static void angleTriangle(){
        for(int i = 1; i< 5; i++){
            for (int j = 0; j < i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static void resizeArray(){
        String[] smallArray = new String[5];
        String[] largeArray = new String[10];
        System.arraycopy(smallArray, 0, largeArray, 0, smallArray.length );
    }

    private static void forEachError(){
//        String country = null;
//
//        List<String> cities = new ArrayList<>();
//        cities.add("Delhi");
//        cities.add("New York");
//        cities.add("Beijing");
//        cities.add("1kjh1231");
//
//        cities.forEach( elem -> {
//            if(elem.equals("Beijing"))
//                country = "China";
//        });
//        System.out.println(country); //Should be China
    }

    private static void forEachDemo() {
        final String[] country = {null};

        List<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("New York");
        cities.add("Beijing");
        cities.add("1kjh1231");


        cities.forEach( elem -> {
            if(elem.equals("Beijing"))
                country[0] = "China";
        });
        System.out.println(country[0]); //Should be China
    }

    private static void forEachDemoBetter(){
        String country;

        List<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("New York");
        cities.add("Beijing");
        cities.add("1kjh1231");

        country = cities.stream()
                .filter( c -> c.equals("Beijing"))
                .findAny()
                .map(v -> "China")
                .orElse(null);
        System.out.println(country);
    }

    private static void linkedListDemo(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        System.out.println(linkedList.size());

        for (int i = 0; i< linkedList.size(); i++){
            System.out.println("item:" + linkedList.get(i));
            System.out.println("peek:" + linkedList.peek());
//            linkedList.addLast("Hey");
            //linkedList.pop();
        }
        System.out.println(linkedList.size());

        List<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("New York");
        cities.add("Beijing");
        cities.add("1kjh1231");

//        for (int i = 0; i< cities.size(); i++){
//            System.out.println(cities.get(i));
//            cities.add("hi");
//            System.out.println(cities.size());
//        }
    }

    private static void linkedListManipulation(){
        // Creating a LinkedList object to represent a stack.
        LinkedList<Integer> stack = new LinkedList<>();

        // Pushing an element in the stack
        stack.push(10);

        // Pushing an element in the stack
        stack.push(20);

        System.out.println(stack);
        // Pop an element from stack
        Integer ele = stack.pop();

        // Printing the popped element.
        System.out.println("Popoed " + ele);

        // Pop an element from stack
        ele = stack.pop();

        // Printing the popped element.
        System.out.println("Popoed " + ele);

        // Throws NoSuchElementException
        ele = stack.pop();

        // Throwsca runtime exception
        System.out.println(ele);

        // Printing the complete stack.
        System.out.println(stack);
    }

}
