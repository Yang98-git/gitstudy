public class Test06 {
    public static void main(String[] args) {
        Person p = new Person();
        p = null;
        //通知GC来收集垃圾
        System.gc();
    }
}

//项目需求：所有对象在JVM中被释放的时候，记录一下释放时间
class Person{
    @Override
    //Person对象被垃圾回收器回收的时候，GC负责调用p.finalize();
    protected void finalize() throws Throwable {
        System.out.println("即将被销毁");
    }
}

