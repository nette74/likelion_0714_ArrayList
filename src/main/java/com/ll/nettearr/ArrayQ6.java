package com.ll.nettearr;

public class ArrayQ6 {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(100, 0);
        ar.add(200, 1);
        ar.add(300, 2);
        ar.add(400, 3);
        ar.add(500, 4);
        ar.add(600, 2); // 2번좌석으로 새치기, 기존의 2번좌석 손님부터 끝 손님까지 뒤로 한칸씩 밀린다.
        ar.add(700, 0); // 0번좌석으로 새치기, 기존의 0번좌석 손님부터 끝 손님까지 뒤로 한칸씩 밀린다.

        for ( int i = 0; i < ar.size(); i++ ) {
            int value = ar.get(i);

            System.out.println(i + " : " + value);
        }

        // 출력
        // 0 : 700
        // 1 : 100
        // 2 : 200
        // 3 : 600
        // 4 : 300
        // 5 : 400
        // 6 : 500


    }
}