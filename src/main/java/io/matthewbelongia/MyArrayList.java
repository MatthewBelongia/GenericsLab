package io.matthewbelongia;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by matthewb on 5/25/16.
 */
public class MyArrayList<T> {

    private int size;
    private Object[] thingArray;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getThingArray() {
        return thingArray;
    }

    public void setThingArray(Object[] thingArray) {
        this.thingArray = thingArray;
    }

    public MyArrayList(T typeThing){
        this.size = 0;
        //thingArray = (T[]) Array.newInstance(typeThing,size);
        this.thingArray = new Object[1];
        this.add(typeThing);
    }


    public MyArrayList(){
        this.size =0;
        this.thingArray = new Object[0];
        //thingArray = (T[]) Array.newInstance(typeThing,0);
    }

    public void add (T addThing){
        if(size < this.thingArray.length){
            thingArray[size]=addThing;
        }
        else{
            Object[] newThingArray = new Object[this.size+1];
            int i = 0;
            for(Object thing : thingArray){
                newThingArray[i] = thing;
                i++;
            }
            newThingArray[size] = addThing;
            thingArray = newThingArray;
        }
        ++size;
    }

    public void add(T addThing,int index){
        if(index>= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        else{
            Object[] newThingArray = new Object[this.size+1];
            int i = 0;
            for(Object thing : thingArray){
                if(i==index){
                    System.out.println("adding " + addThing);
                    newThingArray[i] = addThing;
                    i++;
                    index = -1;
                }
                newThingArray[i] = thing;
                i++;

            }
            thingArray = newThingArray;
        }
        ++size;
    }

    public void set (T addThing,int index){

        if(index> thingArray.length || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        else{
            thingArray[index]=addThing;
        }

    }

    public T get(int index){
        if(index>= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T)thingArray[index];

    }

    public int size(){
        return this.size;
    }

    public void remove(int index){
        if(index> thingArray.length || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + thingArray.length);
        }
        else{
            Object[] newThingArray = new Object[this.size-1];
            int i = 0;
            for(Object thing : thingArray){
                if(i==index){
                    //System.out.println("removing " + thing);
                    index = -1;
                    continue;
                }
                else {
                    newThingArray[i] = thing;
                    i++;
                }
            }
            thingArray = newThingArray;
        }
        --size;
    }

    public void clear(){
        thingArray = new Object[0];
        for(Object thing : thingArray){
            int i = 0;
            thingArray[i] =null;
            i++;
        }
    }

    public Boolean contains(T lookingForThing){
        for(Object thing : thingArray){
            int i = 0;
            if(this.thingArray[i].equals(lookingForThing)){
                return true;
            }
            i++;
        }
        return false;
    }

    public Boolean isEmpty(){
        for(Object thing : thingArray){
            if(!thing.equals(null)){
                return false;
            }
        }
        return true;
    }



}
