// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = {65,72,59,54,112,96,23,11,19,110,43};
        int size = nums.length;
        int temp =0;
        int minIndex = -1;


        System.out.println("Sorting process:");
        for(int num:nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        for( int i=0; i<size-1;i++){
            minIndex = i;

            for( int j=i+1; j<size; j++){
                if(nums[j] < nums[minIndex])
                minIndex = j;
            }
            temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;

        }

        System.out.println("After sorting:");
        for(int num:nums) {
            System.out.print(num + " ");
        }

    }
}