public class ArrayQ4 {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();

        for ( int i = 0; i < 100; i++ ) {
            ar.add((i + 1) * 10);
        }

        int ar_size = ar.size(); // ar_size의 값은 100 이어야 합니다.

        for ( int i = 0; i < ar_size; i++ ) {
            int value = ar.get(i);
            System.out.println(value);
        }

    }
}
