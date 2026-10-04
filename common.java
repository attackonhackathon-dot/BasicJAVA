public class common {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3};
        int[] b = {2, 3, 3, 5};
        boolean[] used = new boolean[b.length];
        int[] c = new int[Math.min(a.length, b.length)];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (!used[j] && a[i] == b[j]) {
                    c[k++] = a[i];
                    used[j] = true;
                    break;
                }
            }
        }

        System.out.println("Common elements are:");
        for (int i = 0; i < k; i++) {
            System.out.print(c[i] + " ");
        }
    }
}