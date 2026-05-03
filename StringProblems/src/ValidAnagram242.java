public class ValidAnagram242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram("rat","car"));
    }
    public static boolean isAnagram(String s, String t) {
        int[] a=new int[26];
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-'a']++;
            a[t.charAt(i)-'a']--;
        }
        for(int c: a)
        {
            if(c!=0)
            {
                return false;
            }
        }
        return true;
    }
}
