package io.matthewbelongia;


import java.lang.reflect.Array;
import java.util.Iterator;

/**
 * Created by matthewb on 5/25/16.
 */
public class MyArrayList<T> {

    private int size;

    private T[] thingArray;

    public MyArrayList(Class<T> typeThing,int size){
        this.size = size;
        thingArray = (T[]) Array.newInstance(typeThing,size);
    }

    public MyArrayList(Class<T> typeThing){
        thingArray = (T[]) Array.newInstance(typeThing,0);
    }

    public T[] add(Class<T> addThing) {
        thingArray = (T[]) Array.newInstance(addThing, size++);
        Iterator<T> iter = null;
        return null;
    }
}
