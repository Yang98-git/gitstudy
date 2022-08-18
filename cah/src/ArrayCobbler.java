import java.util.ArrayList;

public class ArrayCobbler{
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a1.add(new Integer(10));
        a1.add(new Integer(4));
        a2.add(new Integer(7));
        a2.add(new Integer(9));
        a2.add(new Integer(11));

        cobblerArrays(a1,a2);

        System.out.println("Contents of a1: ");
        for (int i = 0; i < a1.size(); i++){
            System.out.println(a1.get(i));
        }

        System.out.println("Contents of a2: ");
        for (int i = 0; i < a2.size(); i++){
            System.out.println(a2.get(i));
        }
    }

    public static void cobblerArrays(ArrayList<Integer> a1, ArrayList<Integer> a2){
        a2 = a1;
        a2.add(new Integer(42));
        a1 = new ArrayList<Integer>();
        a1.add(new Integer(41));
    }
}
