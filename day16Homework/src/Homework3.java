/*在程序中经常要对时间进行操作但是并没有时间类型的数
        那么我们可以自己实现一个时间类来满足程序中的需要。
        定义名为MyTime的类其中应有三个整型成员 时 hour 分 minute 秒 second
        为了保证数据的安全性这三个成员变量应声明为私有。
        为 MyTime类定义构造方法以方便创建对象时初始化成员变量
        再定义display方法用于将时间信息打印出来。
        为 MyTime类添加以下方法
        addSecond(int sec)
        addMinute(int min)
        addHour(int hou)
        subSecond(int sec)
        subMinute(int min)
        subHour(int hou)
        分别对时、分、秒进行加减运算。*/

public class Homework3 {
    public static void main(String[] args) {
        MyTime t1 = new MyTime();
        t1.display();

        MyTime t2 = new MyTime(15, 2, 30);
        t2.display();

        t2.addSecond(121);
        t2.display();

        t2.addMinute(3);
        t2.display();

    }
}

class MyTime{
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void display(){
        System.out.println(this.hour + "时" + this.minute + "分" + this.second + "秒");
    }

    public void addSecond(int sec){
        int newSec = this.second + sec;
        if (newSec < 60) {
            this.setSecond(newSec);
        }else if (newSec == 60){
            //分钟+1
            this.addMinute(1);
            this.setSecond(0);
        }else{
            //秒数大于60
            this.addMinute(newSec / 60);
            this.setSecond(newSec % 60);
        }
    }

    public void addMinute(int min){
        int newMin = this.minute + min;
        if (newMin < 60) {
            this.setMinute(newMin);
        }else if (newMin == 60){
            //小时+1
            this.addHour(1);
            this.setMinute(0);
        }else{
            //秒数大于60
            this.addHour(newMin / 60);
            this.setMinute(newMin % 60);
        }
    }

    public void addHour(int hou){

        /*int Min = hou * 60;
        addMinute(Min);*/
    }

    public void subSecond(int sec){

    }

    public void subMinute(int min){

    }

    public void subHour(int hou){

    }

}
