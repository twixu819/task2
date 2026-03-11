package ex01;

import java.util.ArrayList;
import java.io.*;


public class Calc {

    public ArrayList<Item2d> list = new ArrayList<Item2d>();

    public void calculate(double u, double[] rs) {
        list.clear();
        for (int i = 0; i < rs.length; i++) {
            Item2d item = new Item2d(u, rs[i]);
            int iValue = (int)(u / rs[i]);
            item.binaryResult = Integer.toBinaryString(iValue);
            list.add(item);
        }
    }

    public void save() throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("save.bin"));
        out.writeObject(list);
        out.close();
    }

    public void restore() throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("save.bin"));
        list = (ArrayList<Item2d>) in.readObject();
        in.close();
    }
}
