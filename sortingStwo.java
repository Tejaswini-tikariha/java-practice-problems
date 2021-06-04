public class sortingStwo {
    public static void main(String[] args) {

        int[] arr1 = {2, 5, 4, 9, 6, 0, 1};
        int n = arr1.length;

        for (int i = 0; i < n - 1; i++) {
            int minInd = i;
            for (int j = i; j < n; j++) {
                if (arr1[minInd] > arr1[j]) {
                    minInd = j;
                }
            }
            int temp = arr1[i];
            arr1[i] = arr1[minInd];
            arr1[minInd] = temp;
        }
        for (int item: arr1) {
            System.out.print(item + "  ");
        }
    }
}
