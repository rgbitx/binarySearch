public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] nums = {1, 6, 4, 10, 15, 7, 20};
        int target = 15;
        int ret = binarySearch(nums, target);

        System.out.println(ret);

    }

    public static int binarySearch(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                end = mid;
            } else if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (nums[start] == target) {
            return start;
        }
        if (nums[end] == target) {
            return end;
        }
        return -1;
    }
}
