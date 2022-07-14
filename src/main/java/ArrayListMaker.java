public class ArrayListMaker {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(300);

        int value = (int) ar.get(0);
        System.out.println(value);
        // 출력 : 100

        value = (int) ar.get(1);
        System.out.println(value);
        // 출력 : 200

        value = (int) ar.get(2);
        System.out.println(value);
        // 출력 : 300
    }
}
class ArrayList {

    int size;
    Object[] arr;
    ArrayList(){
        size = 0;
        arr = new Object[size];
    }
    void add(Object d){
        size+=1;
        Object[] newarr = new Object[size];
        if(size>1)
            System.arraycopy(arr,0,newarr,0,size-1);
        newarr[size-1] = d;
        arr = newarr;
    }
    Object get(int index){
        return arr[index];
    }
}