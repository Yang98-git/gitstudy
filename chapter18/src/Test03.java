public class Test03 {
    public static void main(String[] args) {
        //创建了两个String对象，有两个内存地址，不能用“==”比较相等
        String s1 = "abc";
        String s2 = "abc";

        //String也是一个类，并且已经重写了equals方法和toString方法
        System.out.println(s1.equals(s2));
        System.out.println(s1);
    }
}
