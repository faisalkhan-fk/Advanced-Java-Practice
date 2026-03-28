//Lambda Expression - No Parameter

package advancejava_sec_B;

public class lambda1 {

    interface NoParameter {
        String display();
    }

    public static void main(String[] args) {

        NoParameter n2 = () -> "hello Lambda!";

        System.out.println(n2.display());
    }
}
