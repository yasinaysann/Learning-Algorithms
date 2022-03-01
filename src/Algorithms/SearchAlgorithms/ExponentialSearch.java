package Algorithms.SearchAlgorithms;

/**
 * <h2>
 * Exponential Search Algorithm
 * <p>
 *     <li>1.Aranacak Degerin araligi bulunur.</li>
 *     <li>2.Ikili arama, arama araligini tekrar tekrar yariya bolerek siralanmis bir dizide kullanilabilir.</li>
 * <p/>
 * <li>Tüm diziyi kapsayan bir aralıkla başlayın.<li/>
 * Arama anahtarının değeri, aralığın ortasındaki öğeden küçükse, aralığı alt yarıya kadar daraltın.<li/>
 * Aksi takdirde, üst tarafi yarıya kadar daraltın.<li/>
 * Değer bulunana veya aralık boş olana kadar tekrar tekrar kontrol edin.
 * <h2/>
 */
public class ExponentialSearch {

    static int binarySearch(int[] arr, int l, int r,int x){
        if(r >=1){
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) return mid;

            if(arr[mid] > x) return binarySearch(arr, l, mid-1,x);

            return binarySearch(arr, mid + 1,r,x);
        }
        return -1;
    }


     static int exponentialSearch(int arr[], int n, int x){
        if(arr[0] == x) return 0;

        int i = 1;
        while (i < n && arr[i] <= x)
            i = i * 2;

        return binarySearch(arr, i/2,Math.min(i, n-1),x);

    }

    public static void main(String[] args) {
        int[] arr = {15,20,22,24,29};
        int x = 20;
        int result = exponentialSearch(arr,arr.length,x);
        if (result == -1)
            System.out.println("Number is not present in array ");
        else
            System.out.println("Number is present at index "+ result);
    }
}
