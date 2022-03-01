package Algorithms.SearchAlgorithms;

/**
 * <h1>Jump Search<h1/>
 * <p>
 *      Linear Search'e benzer bir sekilde sirali arama yapmaktadir fakat
 *      en buyuk fark tum ogeleri gezmek yerine sabit adimlarla atlayarak daha az ogeyi kontrol etmektedir.
 * <p/>
 *
 * <li>Math.sqrt(n) karekoku alindiktan sonra.</>
 * <li>Math.floor(Math.sqrt(n)) elde edilen sayiyi mu method ile asagi dogru yuvarlar.
 * <li>Math.min methodu ile iki deger arasindan kucuk olani dondurur.
 */

public class JumpSearch {
    public int search(int[] arr, int x){
        int n = arr.length;

        int step = (int) Math.floor(Math.sqrt(n));

        int previus = 0;
        while (arr[Math.min(step,n)-1]<x){
            previus = step;
            step+= (int) Math.floor(Math.sqrt(n));
            if(previus >=n) return -1;
        }
        while (arr[previus] < x){
            previus++;
            if (previus == Math.min(step,n)) return -1;
        }
        if (arr[previus] == x) return previus;

        return -1;
    }

    public static void main(String[] args) {
        JumpSearch jumpSearch = new JumpSearch();

        int[] arr = { 0, 1, 1, 2, 3, 5, 8, 13, 21,
                34, 55, 89, 144, 233, 377, 610};
        int x = 89;

        int index = jumpSearch.search(arr, x);
        System.out.println("Number " + x +
                " is at index " + index);
    }
}
