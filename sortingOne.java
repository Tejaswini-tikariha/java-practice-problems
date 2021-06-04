public class sortingOne {
    public static void main(String[] args) {

        int[] arr1 = {34, 5, 3, 4, 99, 1, 9};
        int l = arr1.length;

        for (int i = 0; i < l-1; i++) {
            for (int j = 0; j < l-1-i; j++) {
                if (arr1[j+1] < arr1[j]) {
                    int temp = arr1[j+1];
                    arr1[j+1] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for(int item: arr1) {
            System.out.print(item + "  ");
        }
    }
}
