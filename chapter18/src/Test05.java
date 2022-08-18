import java.util.Objects;

public class Test05 {
    public static void main(String[] args) {
        //Address addr = new Address("东莞", "东城区", "123456");
        User u1 = new User("小明", new Address("东莞", "东城区", "123456"));
        User u2 = new User("小明", new Address("东莞", "东城区", "123456"));
        User u3 = new User("小明", new Address("北京", "东城区", "123456"));

        System.out.println(u1.equals(u2));
        System.out.println(u1.equals(u3));
    }
}

class User{
    String name;
    Address addr;

    public User() {
    }

    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    @Override
    public boolean equals(Object o) { //Object和User形成多态，Object o = u, 自动类型转换，向下转型
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(addr, user.addr);
        //引用数据类型比较相等要使用equals
        //this.name.equals(user.name) && this.addr.equals(user.addr)
        //如果Address中equals没有重写，比较的还是内存地址，new了两个Address内存地址不同，则为false
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, addr);
    }
}

class Address{
    String city;
    String street;
    String zipcode;

    public Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) && Objects.equals(street, address.street) && Objects.equals(zipcode, address.zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, zipcode);
    }
}
