import java.util.Arrays;

public class Binary_search {

    public static void main(String[] args) {
        int[] int_array = {23, 67, 45, 34, 90, 1, 4, 78, 4, 300, 5, 12};
        System.out.println(Arrays.toString(Bubble_sort.BubbleSort(int_array)));

        System.out.println(BinarySearch(int_array, 23));
    }

    public static int BinarySearch(int[] array, int searchValue) {
        int[] searchArray = Bubble_sort.BubbleSort(array);
        int start = 0;
        int end = array.length-1;
        while(true){
            int mid = (start + end)/2;
            if(searchArray[mid] == searchValue){
                return mid;
            } else if (searchArray[mid] > searchValue) {
                end=mid;
            } else if (searchArray[mid] < searchValue) {
                start=mid;
            } else if (end == start) {
                return -1;

            }
        }
    }
}
