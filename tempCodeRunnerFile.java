class MatrixVar {

    int[][] arr = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};

    void rowSum() {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int v : arr[i]) {
                sum += v;
            }
            System.out.println(sum);
        }
    }
}

public class P09 {

    public static void main(String[] args) {
        new MatrixVar().rowSum();
    }
}
