package task2;

import java.util.ArrayList;

public class Tree {

    private Saka theTree = new Saka();

    private Saka saka0 = new Saka();
    private Saka saka1 = new Saka();

    private Saka saka00 = new Saka();
    private Saka saka01 = new Saka();
    private Saka saka02 = new Saka();

    private Saka saka10 = new Saka();
    private Saka saka11 = new Saka();

    private Saka saka000 = new Saka();

    public Saka getTheTree() {
        return theTree;
    }

    private void initialize(){
        theTree.sakos = new ArrayList<Saka>();
        saka0.sakos = new ArrayList<Saka>();
        saka1.sakos = new ArrayList<Saka>();
        saka00.sakos = new ArrayList<Saka>();
        saka01.sakos = new ArrayList<Saka>();
        saka02.sakos = new ArrayList<Saka>();
        saka10.sakos = new ArrayList<Saka>();
        saka11.sakos = new ArrayList<Saka>();
        saka000.sakos = new ArrayList<Saka>();
    }

    public void generateTree(){
        initialize();
        saka00.sakos.add(saka000);

        saka0.sakos.add(saka00);
        saka0.sakos.add(saka01);
        saka0.sakos.add(saka02);

        saka1.sakos.add(saka10);
        saka1.sakos.add(saka11);

        theTree.sakos.add(saka0);
        theTree.sakos.add(saka1);
    }
}
