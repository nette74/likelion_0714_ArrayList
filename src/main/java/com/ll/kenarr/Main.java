package com.ll.kenarr;



public class Main {
    //강사님 정답코드
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        System.out.println("al.size() : " + al.size());
        // 출력 => al.size() : 0

        al.add(100);

        System.out.println("al.get(0) : " + al.get(0));
        // 출력 => al.get(0) : 100

        al.add(200);
        al.add(300);
        // 출력 => 배열의 크기가 증가되었습니다. 2 => 4

        System.out.println("al.size() : " + al.size());
        // 출력 => al.size() : 3

        System.out.println("al.get(1) : " + al.get(1));
        // 출력 => al.get(1) : 200

        al.removeAt(1);

        System.out.println("al.size() : " + al.size());
        // 출력 => al.size() : 2

        System.out.println("al.get(1) : " + al.get(1));
        // 출력 => al.get(1) : 300

        al.add(400);
        al.add(500);
        al.add(600);
        // 출력 => 배열의 크기가 증가되었습니다. 4 => 8

        System.out.println("al.get(3) + al.get(4) : " + (al.get(3) + al.get(4)));
        // 출력 => al.get(3) + al.get(4) : 1100

        System.out.println("al.get(3).intValue() + al.get(4).intValue() : " + (al.get(3).intValue() + al.get(4).intValue()));
        // 출력 => al.get(3) + al.get(4) : 1100

        al.showAllValues();
        // 출력 =>
		/*
		== 전체 데이터 출력 ==
		0 : 100
		1 : 300
		2 : 400
		3 : 500
		4 : 600
		*/

        al.add(700, 1);
        al.add(750, 1);

        al.showAllValues();
        // 출력 =>
		/*
		== 전체 데이터 출력 ==
		0 : 100
		1 : 750
		2 : 700
		3 : 300
		4 : 400
		5 : 500
		6 : 600
		*/
    }
}

class ArrayList {
    private Object[] datas;
    private int size;

    ArrayList() {
        datas = new Object[20];
        size = 0;
    }

    Integer get(int index) {
        return (Integer)datas[index];
    }

    void removeAt(int index) {
        for ( int i = index + 1; i < size; i++ ) {
            datas[i - 1] = datas[i];
        }
        size--;
    }

    private void extendToDatasSizeIfNeedToAdd() {
        boolean needToExtend = size >= datas.length;

        if ( needToExtend ) {
            Object[] newDatas = new Object[datas.length * 2];

            for ( int i = 0; i < datas.length; i++ ) {
                newDatas[i] = datas[i];
            }

            System.out.println("배열의 크기가 증가되었습니다. " + datas.length + " => " + newDatas.length);

            datas = newDatas;
        }
    }

    void add(int data) {
        add(data, size);
    }

    void add(int data, int indexToAdd) {
        extendToDatasSizeIfNeedToAdd();

        for ( int i = size; i > indexToAdd; i-- ) {
            datas[i] = datas[i - 1];
        }

        datas[indexToAdd] = data;
        size++;
    }

    int size() {
        return size;
    }

    void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");
        for ( int i = 0; i < size; i++ ) {
            System.out.print(i + " : ");
            System.out.println(datas[i]);
        }
    }
}