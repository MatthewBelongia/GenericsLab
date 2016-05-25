package io.matthewbelongia;

/**
 * Created by matthewb on 5/25/16.
 */
public class MySet<T> extends MyArrayList {

    public MySet(T typeThing){
        super(typeThing);
    }

    public MySet(){
        super();
    }

    @Override
    public void add(Object addThing) {

        if(getSize()==0){
            super.add(addThing);
            return;
        }

        if (super.contains(addThing)){
            return;
        }
        super.add(addThing);
    }

    @Override
    public void add(Object addThing, int index) {
        if(getSize()==0){
            super.add(addThing);
            return;
        }

        if (super.contains(addThing)){
            return;
        }

        super.add(addThing, index);
    }

    @Override
    public T get(int index) {
        return (T)super.get(index);
    }
}


