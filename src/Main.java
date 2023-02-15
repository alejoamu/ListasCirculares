public class Main {
    public static void main(String[] args) {
        CircularList circularList = new CircularList();
        circularList.addNode(
                new Node("A")
        );
        circularList.addNode(
                new Node("B")
        );
        circularList.addNode(
                new Node("C")
        );
        circularList.print();
        circularList.delete("A");
        System.out.println("--------");
        circularList.print();
    }
}