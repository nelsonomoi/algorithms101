package main.datastrures;

public class Driver {

    static final DynamicArray posts = new DynamicArray(3);

    public static void main(String[] args){
        posts.insert(0,"Election");
        posts.insert(1,"Education");
        posts.print();
        posts.set(0,"Business");
        String value = posts.get(0);
        System.out.println("get element at index 0 =  "+value);
    }
}
