package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution2 solution = new Solution2();
        System.out.print("请输入一个字符串: ");
        String input = scanner.nextLine();

        String result = solution.removeDuplicateLetters(input);
        System.out.println("Input: " + input + ", Output: " + result);
        // 关闭 Scanner
        scanner.close();


        // 测试用例 1
//        String input1 = "bcabc";
//        String result1 = solution.removeDuplicateLetters(input1);
//        System.out.println("Input: " + input1 + ", Output: " + result1);
//
//        // 测试用例 2
//        String input2 = "cbacdcbc";
//        String result2 = solution.removeDuplicateLetters(input2);
//        System.out.println("Input: " + input2 + ", Output: " + result2);
//
//        // 其他测试用例
//        String input3 = "abacb";
//        String result3 = solution.removeDuplicateLetters(input3);
//        System.out.println("Input: " + input3 + ", Output: " + result3);
//
//        // 边界情况测试：单字符
//        String input4 = "a";
//        String result4 = solution.removeDuplicateLetters(input4);
//        System.out.println("Input: " + input4 + ", Output: " + result4);
//
//        // 边界情况测试：空字符串
//        String input5 = "";
//        String result5 = solution.removeDuplicateLetters(input5);
//        System.out.println("Input: " + input5 + ", Output: " + result5);
    }
}


/*class Solution2 {
    public String removeDuplicateLetters(String s) {
        boolean[] vis = new boolean[25];
        int[] num = new int[25];
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) - ' ']++;
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length()+1; i++) {
            char ch = s.charAt(i);
            if (!vis[ch - ' ']) {
                while (sb.length() > 0 && sb.charAt(sb.length() - 1) > ch) {
                    if (num[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                        vis[sb.charAt(sb.length() - 1) - 'a'] = false;
                        sb.deleteCharAt(sb.length() - 1);
                    } else {
                        break;
                    }
                }
                vis[ch - 'a'] = true;
                sb.append(ch);
            }
            num[ch - 'a'] += 1;
        }
        return sb.toString();
    }
}*/

