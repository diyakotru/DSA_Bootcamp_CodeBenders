// Binary Search 
// rotate an array 
// Two Pointers
// Sorting (Quick / Selection / Insertion Sort)-> Arrays.sort(nums)
// 2D Arrays


// static void rotate(int[] arr, int k) {
//     int n = arr.length;
//     k = k % n;

//     reverse(arr, 0, n - 1);
//     reverse(arr, 0, k - 1);
//     reverse(arr, k, n - 1);
// }

// static void reverse(int[] arr, int l, int r) {
//     while (l < r) {
//         int temp = arr[l];
//         arr[l] = arr[r];
//         arr[r] = temp;
//         l++;
//         r--;
//     }
// }


// static void selectionSort(int[] arr) {
//     int n = arr.length;

//     for (int i = 0; i < n - 1; i++) {
//         int min = i;

//         for (int j = i + 1; j < n; j++) {
//             if (arr[j] < arr[min]) min = j;
//         }

//         int temp = arr[i];
//         arr[i] = arr[min];
//         arr[min] = temp;
//     }
// }


// static void insertionSort(int[] arr) {
//     for (int i = 1; i < arr.length; i++) {
//         int key = arr[i];
//         int j = i - 1;

//         while (j >= 0 && arr[j] > key) {
//             arr[j + 1] = arr[j];
//             j--;
//         }

//         arr[j + 1] = key;
//     }
// }


// static void quickSort(int[] arr, int low, int high) {
//     if (low >= high) return;

//     int pivot = arr[high];
//     int i = low - 1;

//     for (int j = low; j < high; j++) {
//         if (arr[j] < pivot) {
//             i++;
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//         }
//     }

//     int temp = arr[i + 1];
//     arr[i + 1] = arr[high];
//     arr[high] = temp;

//     int p = i + 1;
//     quickSort(arr, low, p - 1);
//     quickSort(arr, p + 1, high);
// }




import java.util.*;

public class arr_practice {
    public static void main(String[] args) {
        //binary search ->O(logn)
        // linear search (every ele was checked -> O(N))
        // int[] nums={1,2,3,4,56,78,88};
        // int target=156;
        // int n=nums.length;
        // int l=0;
        // int r=n-1;
        // boolean flag=false;
        // while(l<=r){
        //     int mid=(l+r)/2;
        //     if(nums[mid]==target){
        //         flag=true;
        //         break;
        //     }
        //     else if (nums[mid]>target){
        //         r=mid-1;
        //     }else{
        //         l=mid+1;
        //     }
        // }

        // if(flag==true){
        //     System.out.println("Element found ");
        // }else{
        //     System.out.println("Element not found");
        // }

        // 2d array 
        // Scanner sc =new Scanner(System.in);
        // //initialisation of 2d array 
        // int[][] arr=new int[2][3];
        // for(int i=0;i<2;i++){
        //     for(int j=0;j<3;j++){
        //         arr[i][j]=sc.nextInt();

        //     }
        // }

        // //printing of 2d array 
        // for(int i=0;i<2;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print(arr[i][j]+" ");

        //     }
        //     System.out.println();
        // }


        // binary search in 2d array 
        // int n = matrix.length;
        // int m = matrix[0].length;

        // int low = 0;
        // int high = m * n - 1;

        // while (low <= high) {
        //     int mid = low + (high - low) / 2;

        //     int row = mid / m;
        //     int col = mid % m;

        //     if (matrix[row][col] == target) {
        //         return true;
        //     } else if (matrix[row][col] < target) {
        //         low = mid + 1;
        //     } else {
        //         high = mid - 1;
        //     }
        // }

        // return false;



    }
    
}
