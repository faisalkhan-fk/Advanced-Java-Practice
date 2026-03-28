// Lambda Expression - Single Parameter

package advancejava_sec_B;

public class lambda3 {

    interface MathOperation {
        int display(int x);
    }

    public static void main(String[] args) {

        MathOperation m = (x) -> x * x;

        System.out.println("Square = " + m.display(5));
    }
}
