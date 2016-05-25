package io.matthewbelongia;

/**
 * Created by matthewb on 5/25/16.
 */
public class Main {

    public static void main(String[] args) {
        MyArrayList<String> stringMyArrayList = new MyArrayList<>();

        /*
        stringMyArrayList.add("test");
        stringMyArrayList.add("other");
        stringMyArrayList.add("third");
        //stringMyArrayList.add(42);
        System.out.println(stringMyArrayList.size());
        System.out.println("0: " + stringMyArrayList.get(0));
        System.out.println("1: " +stringMyArrayList.get(1));
        System.out.println("2: " +stringMyArrayList.get(2));
        stringMyArrayList.add("replaced",2);
        System.out.println("2: " +stringMyArrayList.get(2));
        try{System.out.println("3: " +stringMyArrayList.get(3));
        }catch (IndexOutOfBoundsException e){
            System.out.println("index error");
        }
        System.out.println("");
        stringMyArrayList.remove(1);
        System.out.println(stringMyArrayList.get(0));
        try{System.out.println(stringMyArrayList.get(1));
        }catch (IndexOutOfBoundsException e){
            System.out.println("index error");
        }
        try{System.out.println(stringMyArrayList.get(2));
        }catch (IndexOutOfBoundsException e){
            System.out.println("index error");
        }
        try{System.out.println(stringMyArrayList.get(3));
        }catch (IndexOutOfBoundsException e){
            System.out.println("index error");
        }
*/
        System.out.println(stringMyArrayList.contains("test"));
        System.out.println(stringMyArrayList.contains("fail"));
        System.out.println(stringMyArrayList.isEmpty());


        System.out.println("");
        MyArrayList<Integer> integerMyArrayList = new MyArrayList<>(5);
        System.out.println(integerMyArrayList.get(0));

        MySet<Integer> mySet = new MySet<>(42);
        System.out.println(mySet.get(0));
        mySet.remove(0);
        try{System.out.println(mySet.get(0));
        }catch (IndexOutOfBoundsException e){
            System.out.println("index error");
        }


    }
}
