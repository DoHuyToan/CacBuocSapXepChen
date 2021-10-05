public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9,8,6,5,3,2};

        insertionSort(arr);
    }

    public static void insertionSort(int[] arr){
        int pos, x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            System.out.println("giá trị để so sánh " + x);
            pos = i;
            System.out.println("index so sánh " + i);
            while (pos > 0 && x < arr[pos - 1]){
                System.out.println("gán index hiện tại " + i + " = giá trị phía trước " + arr[pos - 1]);
                arr[pos] = arr[pos - 1];

                pos--;
                System.out.println("giảm index  " + pos);
            }
            if(pos != i){
                arr[pos] = x;
                System.out.println("gán giá trị tại index " + pos + " cho giá trị so sánh " + x);
            }

        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
