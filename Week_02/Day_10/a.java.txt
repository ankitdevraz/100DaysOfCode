1. Printing Distict Numbers


class GFG {

    static void printDistinct(int arr[])
    {

        for (int i = 0; i < arr.length; i++)
        {
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;
            if (i == j)
                System.out.print( arr[i] + " ");
        }
    }
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    // Driver program
    public static void main (String[] args)
    {
        int arr[] = takeInput();

        printDistinct(arr);

    }
}


2.



