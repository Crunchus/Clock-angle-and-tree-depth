package task2;

import java.util.ArrayList;

public class ExampleTree {

    private Saka theTree = new Saka();

    private Saka saka0 = new Saka();
    private Saka saka1 = new Saka();

    private Saka saka00 = new Saka();

    private Saka saka10 = new Saka();
    private Saka saka11 = new Saka();
    private Saka saka12 = new Saka();

    private Saka saka100 = new Saka();

    private Saka saka110 = new Saka();
    private Saka saka111 = new Saka();

    private Saka saka1100 = new Saka();

    public Saka getTheTree() {
        return theTree;
    }

    private void initialize(){
        theTree.sakos = new ArrayList<Saka>();
        saka0.sakos = new ArrayList<Saka>();
        saka1.sakos = new ArrayList<Saka>();
        saka00.sakos = new ArrayList<Saka>();
        saka10.sakos = new ArrayList<Saka>();
        saka11.sakos = new ArrayList<Saka>();
        saka12.sakos = new ArrayList<Saka>();
        saka100.sakos = new ArrayList<Saka>();
        saka110.sakos = new ArrayList<Saka>();
        saka111.sakos = new ArrayList<Saka>();
        saka1100.sakos = new ArrayList<Saka>();
    }

    public void generateTree(){
        initialize();
        saka110.sakos.add(saka1100);

        saka10.sakos.add(saka100);

        saka11.sakos.add(saka110);
        saka11.sakos.add(saka111);

        saka0.sakos.add(saka00);

        saka1.sakos.add(saka10);
        saka1.sakos.add(saka11);
        saka1.sakos.add(saka12);

        theTree.sakos.add(saka0);
        theTree.sakos.add(saka1);
    }
}
