package com.ll.nettearr;

public class ArrayQ5 {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(300);
        ar.add(400);

        ar.remove(2);
        int value = ar.get(2);
        System.out.println(value);
        // 출력 : 400

        ar.remove(0);
        value = ar.get(0);
        System.out.println(value);
        // 출력 : 200

        ar.add(78);
        value = ar.get(2);
        System.out.println(value);
        // 출력 : 78



    }
}
