package org.ex2;

public class GenericMethods<T> {

    @SafeVarargs
    public GenericMethods(T... objets) {
       for(T item :objets) {
           print(item);
       }
    }

    public void print(T obj) {
        System.out.println(obj);
    }

}
