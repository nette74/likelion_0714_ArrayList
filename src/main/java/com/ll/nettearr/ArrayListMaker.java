package com.ll.nettearr;

public class ArrayListMaker {
    //직접 만들어본 코드
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(300);

        int value = ar.get(0);
        System.out.println(value);
        // 출력 : 100

        value = ar.get(1);
        System.out.println(value);
        // 출력 : 200

        value = ar.get(2);
        System.out.println(value);
        // 출력 : 300
    }
}
class ArrayList {
    int size;
    private Object[] arr;
    ArrayList(){
        size = 0;
        arr = new Object[size];
    }
    void add(Object d){
        if(isFull()){
            size = size + 1;
            Object[] newArray = new Object[size];
            System.arraycopy(arr, 0, newArray, 0, size - 1);
            newArray[size - 1] = d;
            arr = newArray;
        }
        else
            arr[size] = d;

    }
    void remove(int index){
        if(0<=index && index<size) {
            size= size-1;
            Object[] newArray = new Object[size];
            System.arraycopy(arr, 0, newArray, 0, index);
            System.arraycopy(arr, index+1, newArray, index, size-index);
            arr=newArray;
        }
        else
            System.out.println("index 가 허용범위를 벗어났습니다. remove -1");
        //  size =+(index - 1)
        // 0 1 2 3 4 5 //6 4
        // 0 1 2 4 5 //5
    }
    void removeSoft(int index){
        for(int i=index+1 ; i<size ;i++)
        {
            arr[i] = arr[i+1];
        }
        size-- ;
    }
    void add(Object d, int index){
        if(0<=index && index<=size){
            size= size +1;
            Object[] newArray = new Object[size];
            System.arraycopy(arr, 0, newArray, 0, index);
            newArray[index] = d;
            System.arraycopy(arr, index, newArray, index+1, size-index-1);
            arr=newArray;
        }
        else
            System.out.println("index 가 허용범위를 벗어났습니다. add -1");
    }
    int get(int index){
        return (int)arr[index];
    }
    public int size() {
        return size;
    }
    public int lastIndex(){return size-1;}
    boolean isFull(){
        if(size< arr.length)
            return false;
        return true;
    }
}