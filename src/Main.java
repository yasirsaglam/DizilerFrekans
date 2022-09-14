import java.util.Arrays;

public class Main {
    public static void frekans(int[] sayac, int n) {
        boolean[] a = new boolean[n];
        Arrays.fill(a, false);
        for (int i = 0; i < n; i++) {
            if (a[i])
                continue;
            int tekrar = 1;
            for (int j = i + 1; j < n; j++) {
                if (sayac[i] == sayac[j]) {
                    a[j] = true;
                    tekrar++;
                }
            }
            System.out.println(sayac[i] + " sayısı " + tekrar + " kere tekrar edildi.");
        }
    }
    public static void main(String[] args) {
        int[] dizi = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
        int n = dizi.length;
        System.out.println((Arrays.toString(dizi)));
        System.out.println("Tekrar Sayıları :");
        frekans(dizi, n);
    }
}
