package Algorithms.SearchAlgorithms;


import java.util.Arrays;

/**
 * <h2>
 * Binary Search Algorithm
 * <p>
 *      Ikili arama, arama araligini tekrar tekrar yariya bolerek siralanmis bir dizide kullanilabilir.
 * <p/>
 * <li>Tüm diziyi kapsayan bir aralıkla başlayın.<li/>
 * Arama anahtarının değeri, aralığın ortasındaki öğeden küçükse, aralığı alt yarıya kadar daraltın.<li/>
 * Aksi takdirde, üst tarafi yarıya kadar daraltın.<li/>
 * Değer bulunana veya aralık boş olana kadar tekrar tekrar kontrol edin.
 * <h2/>
 */
public class BinarySearch {
    public int search(int[] arr, int x){
        Arrays.sort(arr);
        int l = 0, r = arr.length- 1;

        while (l<= r){
            int m = l + (r - 1)/2;
            if (arr[m] == x) return m;

            if (arr[m] < x)
                l = m+1;
            else
                r = m -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = { 2, 3, 4, 10, 40 };
        int x = 10;
        int result = binarySearch.search(arr,x);
        if (result == -1)
            System.out.println("Number not present");
        else
            System.out.println("Number found at index "+ result);
    }
}
