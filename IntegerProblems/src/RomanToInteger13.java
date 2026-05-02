import java.util.Map;

public class RomanToInteger13 {
    public static void main(String[] args) {
        System.out.println("romanToInt(\"III\") : "+romanToInt("III"));
        System.out.println("romanToInt(\"LVIII\") : "+romanToInt("LVIII"));
        System.out.println("romanToInt(\"MCMXCIV\") : "+romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> map=Map.of(
                'I',1,
                'V',5,
                'X',10,
                'L',50,
                'C',100,
                'D',500,
                'M',1000
        );
        int sum=0;
        int n=s.length();
        for (int i=0;i< s.length();i++)
        {
            if(i<n-1 && map.get(s.charAt(i))<map.get(s.charAt(i+1)))
            {
                sum-=map.get(s.charAt(i));
            }
            else
            {
                sum+=map.get(s.charAt(i));
            }
        }
        return sum;
    }
}
