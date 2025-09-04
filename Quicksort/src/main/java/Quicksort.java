public class Quicksort {
    public static void quickSortRecursive(int[] arr, int low, int high) {
        
        if (low < high) {
            int pivot = arr[high];
            int index = low - 1; // index out of bounds to start

            for (int i = low; i < high; i++) {
                if (arr[i] < pivot) { // Move everything less than pivot to the left
                    index++; // Only increment when arr[i] < pivot, other values will be "moved right" (smaller values to the left)
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                }
            }
            // Move pivot (change high value)
            int temp = arr[index + 1];
            arr[index + 1] = arr[high];
            arr[high] = temp;
            
            quickSortRecursive(arr, low, index);
            quickSortRecursive(arr, index + 2, high);
        }
    }



    public static void quickSortRegular(int[] arr) {
        //
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 0, 100, 23, 49, 24};

        System.out.print("Before : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        quickSortRecursive(arr, 0, arr.length - 1);
        
        System.out.print("After : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}