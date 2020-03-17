package array;

public class SwitchArray {

    public static int[] swapBorder(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums, 0, 5);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}

