import task1.ClockArmAngle;
import task2.ExampleTree;
import task2.Tree;
import task2.TreeHeightCalculator;

public class Main {

    private static ClockArmAngle angle = new ClockArmAngle();

    public static void main(String[] args) {
        System.out.println("The time format is 00:00 - 23:59");     //TASK #1
        inputHours();
        inputMinutes();
        angle.calculateAngle();

        Tree tree = new Tree();     //TASK #2
        ExampleTree exampleTree = new ExampleTree();
        TreeHeightCalculator calculate = new TreeHeightCalculator();
        tree.generateTree();
        exampleTree.generateTree();
        int treeHeight = calculate.calculateTreeHeight(tree.getTheTree());
        int ExampleTreeHeight = calculate.calculateTreeHeight(exampleTree.getTheTree());
        System.out.println("Depth of the deepest element = " + treeHeight);
        System.out.println("Depth of the deepest element (example tree) = " + ExampleTreeHeight);
    }

    private static void inputHours() {
        System.out.println("Input hours");
        try {
            int hours = Integer.parseInt(UtilScanner.scan.next());
            if (hours > 23 || hours < 0) {
                System.out.println("Incorrect hour input, try again");
                inputHours();
            } else {
                angle.setHours(hours);
            }
        } catch (Exception e) {
            System.out.println("Incorrect hour format, try again");
            inputHours();
        }
    }

    private static void inputMinutes() {
        System.out.println("Input minutes");
        try {
            int minutes = Integer.parseInt(UtilScanner.scan.next());
            if (minutes > 59 || minutes < 0) {
                System.out.println("Incorrect minute input, try again");
                inputMinutes();
            } else {
                angle.setMinutes(minutes);
            }
        } catch (Exception e) {
            System.out.println("Incorrect minute format, try again");
            inputMinutes();
        }
    }
}
