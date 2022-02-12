package Algorithms;

/**
 * <h2>
 * -- Linear Search Algorithms --
 * <p>
 *   Dizinin icinde tek tek gezerek arama yapmaktadir.
 * <p/>
 * <h2/>
 */
public class LinearSearch {
    public int search(int[] arr, int x){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int[] arr = { 2, 3, 4, 10, 40 };
        int x = 10;
        int result = linearSearch.search(arr,x);
        if (result ==-1) System.out.print("Number is not present in array");
        else System.out.print("Number is present at index "+result);
    }

}
