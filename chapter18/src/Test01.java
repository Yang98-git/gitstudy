import java.util.Objects;

public class Test01 {
    public static void main(String[] args) {
        MyTime mt = new MyTime(2022, 2, 25);
        System.out.println(mt);
    }
}

class MyTime{
    int year;
    int month;
    int day;

    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /*public String toString(){
        return this.year + "/" + this.month + "/" + this.day;
    }*/

    @Override
    public String toString() {
        return "MyTime{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    /*public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || !(obj instanceof MyTime)){
            return false;
        }
        //获取第一个日期的年月日 this.

        //获取第二个日期的年月日，传obj进来
        //访问子类型中特有的东西 year, month, day，向下转型
        if (obj instanceof MyTime){
            MyTime t = (MyTime) obj;
            //开始比较
            if (this.year == t.year && this.month == t.month && this.day == t.day) {
                return true;
            }
        }
        return false;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTime myTime = (MyTime) o;
        return year == myTime.year && month == myTime.month && day == myTime.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
