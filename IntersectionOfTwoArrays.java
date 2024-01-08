import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2){
        List<Integer> temp = new ArrayList<>();
        for (int i=0; i<nums1.length; i++){
            temp.add(nums1[i]);
        }

        List<Integer> out = new ArrayList<>();

        for (int j=0; j<nums2.length; j++){
            if (temp.contains(nums2[j]) && !out.contains(nums2[j])){
                out.add(nums2[j]);
            }
        }

        int[] output = new int[out.size()];

        for (int i=0; i<out.size(); i++){
            output[i] = out.get(i);
        }

        return output;
    }
    public static void main(String[] args) {
        int[] a = {4,9,5};
        int[] b = {9,4,9,8,4};

        System.out.println(Arrays.toString(intersection(a,b)));
    }
}
