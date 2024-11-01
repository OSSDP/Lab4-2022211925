import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.example.Solution2;

public class Solution2Test {

    @Test
    public void testRemoveDuplicateLetters() {
        Solution2 solution = new Solution2();

        // 测试用例1
        String input1 = "bcabc";
        String expected1 = "abc";
        assertEquals(expected1, solution.removeDuplicateLetters(input1));

        // 测试用例2
        String input2 = "cbacdcbc";
        String expected2 = "acdb";
        assertEquals(expected2, solution.removeDuplicateLetters(input2));

        // 测试用例3
        String input3 = "aaaaa";
        String expected3 = "a";
        assertEquals(expected3, solution.removeDuplicateLetters(input3));

        // 测试用例4
        String input4 = "abcdef";
        String expected4 = "abcdef";
        assertEquals(expected4, solution.removeDuplicateLetters(input4));


    }
}
