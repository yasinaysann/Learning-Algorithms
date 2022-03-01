package Algorithms.SearchAlgorithms;

/**
 * <h2>
 *  Interpolation Search
 *  <p>
 *
 *  <p/>
 *  <li>Tüm diziyi kapsayan bir aralıkla başlayın.<li/>
 *  sol ve sag ile ifade edilen değerler arama yapılan alandaki aralığın başlangış ve bitiş indisleridir.
 *  a dizisi ise arama yapılan dizinin ismidir. x değeri ise aranan değer olarak kabul edilir.
 *
 *
 *  <li>Formul: "orta = sol + ((x-a[sol]) * (sag – sol) ) / ( a[sag] – a[sol])"
 *  <h2/>
 */
public class InterpolationSearch {

    public static int interpolationSearch(int[] array,int startingIndex,int endingIndex, int x){

        int position;
        if(startingIndex<= endingIndex && x >= array[startingIndex] && x <= array[endingIndex]){
            position = startingIndex + (((endingIndex - startingIndex) /
                    (array[endingIndex] - array[startingIndex])) * (x - array[startingIndex]));
            if (array[position] == x)
                return position;

            if (array[position]< x )
                return interpolationSearch(array,position + 1, endingIndex, x);

            if(array[position] > x )
                return interpolationSearch(array, startingIndex,position-1,x);

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 12, 13, 16, 18, 19, 20, 21,
                22, 23, 24, 33, 35, 42, 47 };

        int n = arr.length;
        int x = 18;
        int index = interpolationSearch(arr, 0, n - 1, x);
        if(index != -1)
            System.out.println("Number found at index " + index);
        else
            System.out.println("Number not found");
    }
}
