package bridgelabz;

public class Runner {
    /**
     * Main method, It is the starting point of this program.
     *
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Integer> numberList = new LinkedList<>();
        numberList.add(56);
        numberList.add(70);
        numberList.addAtIndex(1, 30);
        System.out.println("Before Deleting Last Element");
        numberList.show();
        System.out.println("After Deleting Last Element");
        numberList.popLast();
        numberList.show();
    }
}
