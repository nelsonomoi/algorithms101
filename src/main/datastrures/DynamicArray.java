package main.datastrures;

public class DynamicArray {
    private Object[] data;
    private int size;
    private int initalizeCapacity;

    public DynamicArray(int initalizeCapacity){
        this.initalizeCapacity = initalizeCapacity;
        this.data = new Object[initalizeCapacity];
    }

    public String get(int index){
       return  (String)data[index];
    }

    public void set(int index,String value){
        data[index] = value;
    }

    public void insert(int index,String value){
//        copy up
        for(int i = size; i > index ; i--){
            data[i] = data[i-1];
        }
        data[index] = value;
        size++;
    }

    public void print(){
        for(int i = 0; i < size; i++){
            System.out.println("data[i] = "+data[i]);
        }
    }

    public void resize(){
        Object[] newObj = new Object[initalizeCapacity*2];

        for(int i = 0; i < size ; i++){
            newObj[i] = data[i];
        }

        data = newObj;
    }
}

