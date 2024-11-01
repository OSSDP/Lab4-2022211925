package org.example;

/**
 * @description: 给你一个字符串 s ，请你去除字符串中重复的字母，使得每个字母只出现一次。需保证 返回结果的字典序最小（要求不能打乱其他字符的相对位置）。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "bcabc"
 * 输出："abc"
 * 示例 2：
 * <p>
 * 输入：s = "cbacdcbc"
 * 输出："acdb"
 * <p>
 * 1 <= s.length <= 104
 * s 由小写英文字母组成
 */
public class Solution2 {
    public String removeDuplicateLetters(String s) {
        boolean[] vis = new boolean[26];  // 记录字符是否已经加入结果
        int[] num = new int[26];           // 记录字符的出现次数

        // 统计每个字符出现的次数
        for (char ch : s.toCharArray()) {
            num[ch - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        // 遍历字符串
        for (char ch : s.toCharArray()) {
            num[ch - 'a']--;  // 每遇到一个字符，减少其剩余出现的次数

            // 如果字符已经在结果中，跳过
            if (vis[ch - 'a']) continue;

            // 保持字典序最小，并且该字符后面还有剩余
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > ch && num[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                vis[sb.charAt(sb.length() - 1) - 'a'] = false;  // 标记字符未使用
                sb.deleteCharAt(sb.length() - 1);  // 删除末尾字符
            }

            // 添加当前字符到结果
            sb.append(ch);
            vis[ch - 'a'] = true;  // 标记字符已使用
        }

        return sb.toString();
    }
}

