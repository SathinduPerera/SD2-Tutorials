import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] int_array = {23, 67, 45, 34, 90, 1, 4, 78, 4};

        System.out.println(Arrays.toString(BubbleSort(int_array)));
    }

    public static int[] BubbleSort(int[] array){
        int[] sort_array = array.clone();

        int end = sort_array.length -1;
        int temp;
        boolean hasSwapped = true;

        while(hasSwapped){
            hasSwapped = false;

            for(int i = 0; i<end; i++){
                if(sort_array[i] > sort_array[i+1]){
                    temp = sort_array[i];
                    sort_array[i] = sort_array[i+1];
                    sort_array[i+1] = temp;
                    hasSwapped = true;
                }
            }
            end--;
        }

        return sort_array;
    }
}
