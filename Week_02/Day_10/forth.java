4.
  Sort first half of an array in ascending and second half in descending order.

Input:
 8
2 4 7 9 3 1 6 8
Output:
 1 2 3 4 9 8 7 6
Example 2:
Input:
6
1 2 3 4 5 6
Output:
1 2 3 6 5 4

Solution:

class GFG
{

    static void printOrder(int[] arr, int n)
    {

        Arrays.sort(arr);

        // printing first half in ascending
        // order
        for (int i = 0; i < n / 2; i++)
            System.out.print(arr[i]+" ");

        // printing second half in descending
        // order
        for (int j = n - 1; j >= n / 2; j--)
            System.out.print(arr[j]+" ");

    }  public static int[] takeInput() {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = s.nextInt();
    }
    return arr;
}

    //Function  for Printing the input Array
    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }



    // Driver code
    public static void main(String[] args)
    {
       int [] arr=takeInput();
       int n=arr.length;
        printOrder(arr, n);

    }
}