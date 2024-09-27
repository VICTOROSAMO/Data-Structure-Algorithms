
public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {2,4,5,7,9,12,14,17,19,45,67,78};
        int target = 45;

        int result = binarySearch(nums, target, 0, nums.length);

        if(result != -1)
            System.out.println("The element is found at index " + result);
         else
            System.out.println("The element is not found");

    }

    public static int binarySearch(int[] nums, int target, int left, int right) {

        int steps = 0;

        while(left <= right){
            steps++;
            int mid = (left + right)/2;
            if(nums[mid] == target){

                System.out.println("Number of steps for binary search " + steps);
                return mid;
            } else if (nums[mid] < target) {
                return binarySearch(nums,target, mid+1, nums.length);
            } else
                return binarySearch(nums,target,0,mid-1);
        }

        return -1;
    }
}