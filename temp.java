public class temp {

    static void rev(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateLeft(int[] a, int k) {
        int n = a.length;
        k = k % n;     
        rev(a, 0, k - 1);   
        rev(a, k, n - 1);   
        rev(a, 0, n - 1);

}

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int k = 4;
        rotateLeft(a, k);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
} 