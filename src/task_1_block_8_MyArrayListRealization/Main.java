package task_1_block_8_MyArrayListRealization;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myArray = new ArrayList<>();
        System.out.println(myArray.size());
        myArray.add("first");
        System.out.println(myArray.size());
        myArray.add("second");
        System.out.println(myArray.size());
        myArray.add("third");
        System.out.println(myArray.size());

        myArray.remove(0);
        System.out.println(myArray.get(0));
        System.out.println(myArray.size());
    }
}
