package ex01;

public class View {
    public void show() {
        Calc c = new Calc();
        double[] rs = {10.0, 20.0, 5.0, 2.0};

        System.out.println("calculation");
        c.calculate(100.0, rs);
        printList(c);

        try {
            c.save();
            System.out.println("\nsaved, being restored");
            c.restore();
            printList(c);
        } catch (Exception e) {
            System.out.println("error of file");
        }
    }

    private void printList(Calc c) {
        for (int i = 0; i < c.list.size(); i++) {
            Item2d item = c.list.get(i);
            System.out.println("U: " + item.u + " R: " + item.r + " I: " + item.binaryResult);
        }
    }
}
