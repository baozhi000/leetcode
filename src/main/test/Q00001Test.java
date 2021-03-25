import java.util.Arrays;

import static org.junit.Assert.assertEquals;

class Q00001Test {

    @org.junit.Test
    void twoSumTest() {
        System.out.println("twoSumTest Start");
        Q00001 q1=new Q00001();
        int[] arr=new int[]{2,7,11,15};
        int[] result=q1.twoSum(arr,9);
        System.out.println(Arrays.toString(result));
        assertEquals(new int[]{0,1},result);

    }

    @org.junit.Test
    void twoSum2Test() {
        Q00001 q1=new Q00001();
        int[] arr=new int[]{2,7,11,15};
        int[] result=q1.twoSum2(arr,9);
        System.out.println(Arrays.toString(result));
        assertEquals(new int[]{0,1},result);
        System.out.println("twoSumTest End");
    }
}