public class SwappingVariableWithoutTmpVariable {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        System.out.println("before swap : a="+a+", b="+b);
        a=a^b;
        System.out.println("a="+a);
        b=a^b;
        System.out.println("b="+b);
        a=a^b;
        System.out.println("a="+a);
        System.out.println("after swap : a="+a+", b="+b);
    }
}
