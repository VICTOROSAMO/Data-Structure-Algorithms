
public class LinearSearch {

    public static void main(String[] args) {
      int num[] = {2,4,5,7,9,12,14,17,19,45,67,78};
      int target = 45;


      int result = linearSearch(num, target);

      if(result != -1) {

          System.out.println("The target is found at index " + result);
      } else {
          System.out.println("The element is not found");
      }
    }

    public static int linearSearch(int[] num, int target) {
        int steps = 0;

        for (int i = 0; i < num.length; i++) {
            steps++;

            if (num[i] == target) {
                System.out.println("Number of steps for LinearSearch is " + steps);
                return i;
            }
        }
        System.out.println("Number of steps for LinearSearch is " + steps);
        return -1;
    }

}
