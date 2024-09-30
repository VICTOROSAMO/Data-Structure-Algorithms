// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = {65,72,59,54,112,96,23,11,19,110,43};
        int size = nums.length;
        int temp =0;

        System.out.println("Sorting process:");
        for(int num:nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        for(int i=0; i<size;i++){

            for(int j=0; j<size-i-1; j++){
                if(nums[j] > nums[j+1]){
                    temp= nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;

                    for(int num:nums) {
                        System.out.print(num + " ");

                    }
                    System.out.println();
                }
            }
        }

        System.out.println("After sorting:");
        for(int num:nums) {
            System.out.print(num + " ");
        }

    }
}