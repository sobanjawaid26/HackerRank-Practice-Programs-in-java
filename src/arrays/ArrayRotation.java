package arrays;

public class ArrayRotation {
    // 2nd method using temp integer
    public int[] leftRotate2(int[] arr, int n, int d){
        for(int i = 0; i<d; i++)
            leftRotate2Helper(arr, n);
        return arr;
    }
    public int[] leftRotate2Helper(int[] arr, int d){
        int temp , i;
        temp = arr[0];
        for(i = 0; i< arr.length - 1; i++)
            arr[i] = arr[i+1];
        arr[i] = temp;
        return arr;
    }
    // first method using temp array
    public int[] leftRotate1(int[] arr, int n){
        int[] temp = new int[n];
        for (int i = 0; i< n; i++)
            temp[i] = arr[i];
        int[] res = new int[arr.length];
        for (int i = n, j = 0; i< arr.length; i++, j++)
            res[j] = arr[i];
        for (int i = res.length - n, j = 0; i< arr.length; i++, j++)
            res[i] = temp[j];
        return res;
    }
    public void traverseArray(int arr[]){
        for(int i = 0; i< arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        ArrayRotation obj = new ArrayRotation();
//        int[] outputArray = obj.leftRotate1(array, 4);
//        obj.traverseArray(outputArray);
        int[] outputArray = obj.leftRotate2(array, 9, 4);
        obj.traverseArray(outputArray);
    }
}
