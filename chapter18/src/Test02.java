public class Test02 {
    public static void main(String[] args) {
         MyTime t1 = new MyTime(2008, 8, 8);
         MyTime t2 = new MyTime(2008, 8, 8);

         //"=="比较的是内存地址，t1 t2为两个对象，内存地址不同
        System.out.println(t1 == t2);

        //重写equals方法之前
        //System.out.println(t1.equals(t2)); false

        //重写equals之后，比较对象属性
        System.out.println(t1.equals(t2));

        MyTime t3 = new MyTime(2008, 8 ,9);
        System.out.println(t1.equals(t3));

        MyTime t4 = null;
        System.out.println(t1.equals(t4));

    }
}


