import java.util.*;
/*
187. Repeated DNA Sequences
Solved
Medium

Topics
premium lock icon
Companies
The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.

For example, "ACGAATTCCG" is a DNA sequence.
When studying DNA, it is useful to identify repeated sequences within the DNA.

Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.



Example 1:

Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
Output: ["AAAAACCCCC","CCCCCAAAAA"]
Example 2:

Input: s = "AAAAAAAAAAAAA"
Output: ["AAAAAAAAAA"]


Constraints:

1 <= s.length <= 105
s[i] is either 'A', 'C', 'G', or 'T'.

 */
public class RepeatedDNASequences187 {
    public static void main(String[] args) {
        System.out.println(findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
        System.out.println(findRepeatedDnaSequences("AAAAAAAAAAA"));
    }
    public static List
            <String> findRepeatedDnaSequences(String s) {
        int len=s.length();
        Map<String, Integer> map=new HashMap<>();
        for(int i=0;i<len;i++)
        {
            if(i+10>len)
            {
                break;
            }
            String token = s.substring(i, i+10);
            map.put(token, map.getOrDefault(token, 0)+1);
        }

        List<String> list=new ArrayList<>();
        map.forEach((k,v)->{
            if(v>1)
                list.add(k);
        });
        return list;
    }
}
