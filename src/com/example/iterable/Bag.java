package com.example.iterable;

//Import package for Array & Iterator
import java.util.ArrayList;
import java.util.Iterator;

//Implement Container
public class Bag<T> implements Container<T>{

    //Construct ArrayList
    ArrayList<T> Array = new ArrayList<T>();

    //Test if its empty
    @Override
    public boolean isEmpty() {
        return Array.isEmpty();
    }

    //Return # of elements in Array
    @Override
    public int size() {
        return Array.size();
    }

    /*@Override
    public void add(Object item) {
        Array.add((T) item);
    }*/


    //Specific position in List
    @Override
    public void add(T item) {
        //add(int item)
        Array.add(item);
    }

    @Override
    public Iterator iterator() {
        return Array.iterator();
    }
}


//Good resource:
// ArrayList: https://www.ccs.neu.edu/home/vkp/213-sp07/Lectures/AllLectures/lec-mar-19.html

