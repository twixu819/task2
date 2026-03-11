package ex01;

public class Test {
    public static void main(String[] args) {
        View v = new View();
        v.show();

        System.out.println("\n test check");
        double u = 100.0;
        double r = 10.0;
        int result = (int)(u / r);
        String bin = Integer.toBinaryString(result);

        if (bin.equals("1010")) {
            System.out.println("test ok, 10 in binary is 1010");
        } else {
            System.out.println("test error");
        }
    }
}
