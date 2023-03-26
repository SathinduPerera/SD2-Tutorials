public class Linear_search {
    public static void main(String[] args) {
        int[] int_array = {23, 67, 45, 34, 90, 1, 4, 78, 4};

        System.out.println(linearSearch(int_array, 90));
        System.out.println(linearSearch(int_array, 4));
        System.out.println(linearSearch(int_array, -1));
        System.out.println(linearSearch(int_array, 100));
    }

    public static int linearSearch(int[] array, int searchValue){
        int index = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i] == searchValue){
                index = i;
                break;
            } else if (array[i] == array[array.length - 1]) {
                index =  -1;
            }
        }

        return index;
    }
}
