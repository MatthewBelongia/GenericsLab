package io.matthewbelongia;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by matthewb on 5/25/16.
 */
public class GenericSpecs {

    MyArrayList<Integer> myArrayList;
    MySet<String> mySet;

    @Before
    public void init(){
        myArrayList = new MyArrayList<>();
        mySet = new MySet<>();
    }

    @Test
    public void testGet(){
        String errorMessage = "passed";
        try{myArrayList.get(-1);}
        catch (IndexOutOfBoundsException e){
            errorMessage = "failed";
        }
        assertEquals("Error message should say failed","failed",errorMessage);
        try{myArrayList.get(100);}
        catch (IndexOutOfBoundsException e){
            errorMessage = "failed again";
        }
        assertEquals("Error message should say failed","failed again",errorMessage);
    }


    @Test
    public void testArrayAdd(){
        String errorMessage = "passed";
        try{myArrayList.get(0);}
        catch (IndexOutOfBoundsException e){
            errorMessage = "Array is empty";
        }
        assertEquals("Error message should have failed","Array is empty",errorMessage);

        myArrayList.add(25);
        int afterAdd = myArrayList.get(0);
        assertEquals("Both should be 25",25,afterAdd);
        myArrayList.add(25);
        int anotherAdd = myArrayList.get(1);
        assertEquals("Both should be 25",25,anotherAdd);
        myArrayList.add(100);
        int thirdAdd = myArrayList.get(2);
        assertEquals("Both should be 100",100,thirdAdd);

    }

    @Test
    public void testSetAdd(){
        String errorMessage = "passed";
        try{myArrayList.get(0);}
        catch (IndexOutOfBoundsException e){
            errorMessage = "Set is empty";
        }
        assertEquals("Error message should have failed","Set is empty",errorMessage);

        mySet.add("same");
        String afterAdd = mySet.get(0);
        assertEquals("Both should be 25","same",afterAdd);
        mySet.add("same");
        String anotherAdd = "";
        try{anotherAdd = mySet.get(1);}
        catch (IndexOutOfBoundsException e){
            errorMessage = "same string doesn't get added";
        }
        assertEquals("Error message should have failed","same string doesn't get added",errorMessage);

        assertEquals("String should still be blank","",anotherAdd);
        mySet.add("different");
        String thirdAdd = mySet.get(1);
        assertEquals("Both should be 100","different",thirdAdd);
    }

    @Test
    public void testRemove(){
        myArrayList.add(50);
        int beforeRemove = myArrayList.get(0);
        assertEquals("Index 0 should be 50",50,beforeRemove);
        myArrayList.remove(0);
        String errorMessage = "passed";
        try{myArrayList.get(0);}
        catch (IndexOutOfBoundsException e){
            errorMessage = "Array is empty";
        }
        assertEquals("Error message should have failed","Array is empty",errorMessage);

        myArrayList.add(75);
        myArrayList.add(100);
        int afterRemove = myArrayList.get(0);
        assertEquals("Should now be set to 75",75,afterRemove);
        myArrayList.remove(0);
        int afterAnotherRemove = myArrayList.get(0);
        assertEquals("Should now be set to 100",100,afterAnotherRemove);
    }

    @Test
    public void testSet(){
        myArrayList.add(69);
        int beforeSet = myArrayList.get(0);
        assertEquals("Both should be 69",69,beforeSet);
        myArrayList.set(42,0);
        int afterSet = myArrayList.get(0);
        assertEquals("Should now be 42",42,afterSet);
    }

    @Test
    public void testClear(){
        String errorMessage = "passed";
        myArrayList.add(50);
        myArrayList.add(40);
        myArrayList.add(20);
        int beforeClear = myArrayList.get(1);
        assertEquals("should be 40",40,beforeClear);
        myArrayList.clear();
        try{int afterClear = myArrayList.get(0);}
        catch (IndexOutOfBoundsException e){
            errorMessage = "failed";
        }
        assertEquals("should have failed","failed",errorMessage);
    }

    @Test
    public void isEmpty(){
        Boolean beforeAdd = myArrayList.isEmpty();
        myArrayList.add(250);
        Boolean afterAdd = myArrayList.isEmpty();
        assertTrue("is empty",beforeAdd);
        assertFalse("is not empty",afterAdd);
    }

    @Test
    public void contains(){
        Boolean beforeAdd = myArrayList.contains(50);
        myArrayList.add(50);
        Boolean afterAdd = myArrayList.contains(50);
        assertFalse("does not contain",beforeAdd);
        assertTrue("does contain",afterAdd);
    }


}
