package dsa.src.sorting;
public class SortingAlgos {

    // Insertion sort: Iterate over array and compare current element(key) with its predecessor
    void insertionSort(int[] arr, int n) {
        System.out.println("Insertion sort:");
        for(int i=0; i<=n-1; i++) {
            int j = i;
            while(j>0 && arr[j-1] > arr[j]) {  // Slide and place it till it place
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    // Bubble Sort : Comparing adjacent elements until array is sorted
    void bubbleSort(int[] arr, int n) {
        System.out.println("Bubble sort:");
        boolean swapped;
        for(int i=0; i<n-1; i++) {
            swapped = false;
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] > arr[j+1]) { // Comparing adjacent elements

                    int temp = arr[j];  // Swapping adjacent elements
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)    // If swapped is false means array is already sorted
                break;
        }
    }

    // Selection Sort: Pick min element from unsorted part
    //                 of array and put it in front of unsorted array
    void selectionSort(int[] arr,int n) {
        System.out.println("Selection sort:");
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        SortingAlgos ob = new SortingAlgos();
        int[] arr = {64,25,12,22,11};
        int n = arr.length;
        ob.selectionSort(arr, n);
        System.out.println("Sorted array");
        ob.printArray(arr);

        ob.bubbleSort(arr, n);
        System.out.println("Sorted array");
        ob.printArray(arr);

        ob.insertionSort(arr,n);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
