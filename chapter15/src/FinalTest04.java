public class FinalTest04 {
    public static void main(String[] args) {
        System.out.println(Chinese.COUNTRY);
        //Chinese.COUNTRY = "USA"; //final只能赋值一次
    }
}

class Chinese{
    String idCard;
    String name;
    static final String COUNTRY = "China"; //static用类名访问
}
