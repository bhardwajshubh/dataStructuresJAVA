public class MergeSort {

    public int[] mergeSort(int ar[] ){
        if(ar.length > 1){
            int mid = ar.length/2;
            int left[] = new int[mid];
            int right[] = new int[ar.length-mid];
            for(int i = 0 ; i <mid ; i++){
                left[i] = ar[i];
            }
            for(int i = mid ; i < ar.length ; i++){
                right[i-mid] = ar[i];
            }
            return merge(mergeSort(left) , mergeSort(right));
        }
        return ar;
    }
    public int[] merge(int left[] , int right[]){
        int i =0 , j = 0 , k = 0;
        int result[] = new int[left.length+right.length];
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                result[k] = left[i];
                i++;
            } else if(left[i] > right[j]){
                result[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length){
            result[k] = left[i];
            i++; k++;
        }
        while (j < right.length){
            result[k] = right[j];
            j++; k++;
        }
        return result;

    }
}
