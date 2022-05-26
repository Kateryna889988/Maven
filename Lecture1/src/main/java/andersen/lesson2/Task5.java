package andersen.lesson2;

public class Task5 {

    public void rotateItems(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = 1;
            } else {
                nums[i] = 0;
            }

            System.out.println("array [" + i + "] = " + nums [i]);
        }
    }
}
