package org.ex1;

public class GenericMethods<T> {
    private T obj1;
    private T obj2;
    private int number;

    public GenericMethods(T obj1, T obj2, int number) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.number = number;

        print(this.obj1);
        print(this.obj2);
        print(this.number);
    }

    private void print(int number) {
        System.out.println(number);
    }

    public void print(T obj) {
        System.out.println(obj);
    }

}
