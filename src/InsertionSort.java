public class InsertionSort {
    public static int[] insertionSort(int[] ar){
        if(ar.length == 0){
            return ar;
        }
        for(int i = 1 ; i < ar.length ; i++){
            int hole = i;
            int temp = ar[hole];
            while(hole > 0 && ar[hole-1] > temp){
                ar[hole] = ar[hole-1];
                hole = hole-1;
            }
            ar[hole] = temp;
        }
        return ar;
    }
}
