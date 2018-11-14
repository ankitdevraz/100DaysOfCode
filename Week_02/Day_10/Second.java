2. Program to sort array in ascending & descending order.

Input:
5
8 6 9 2 7
Output:
2 6 7 8 9
9 8 7 6 2


Solution:

class GFG {


//Take Input Function

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    //Printing Function
    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    // Bubble Sort in Increasing order
    public static void bubbleSortIncreasing(int[] arr) {
        for (int round = 0; round < arr.length-1 ; round++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    //Swaping
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortDecreasing(int[] arr) {
        for (int round = 0; round < arr.length-1 ; round++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i]< arr[i + 1]) {
                    //Swaping
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = takeInput();

    bubbleSortIncreasing(arr);printArray(arr);
    bubbleSortDecreasing(arr);printArray(arr);

    }


}

    // Bubble Sort in Increasing order
    public static void bubbleSort(int[] arr) {
        for (int round = 0; round < arr.length-1 ; round++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    //Swaping
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }



    public static void main(String[] args) {
        int arr[] = takeInput();

    bubbleSort(arr);printArray(arr);

    }


}