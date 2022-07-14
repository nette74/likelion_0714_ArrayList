public class ArrayListMaker {
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
    private int size;
    private Object[] arr;
    ArrayList(){
        size = 0;
        arr = new Object[size];
    }
    void add(Object d){
        size=size+1;
        Object[] newarr = new Object[size];
        System.arraycopy(arr,0,newarr,0,size-1);
        newarr[size-1] = d;
        arr = newarr;
    }
    int get(int index){
        return (int)arr[index];
    }
}