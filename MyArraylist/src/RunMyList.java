public class RunMyList {
    public static void main(String[] args) {

        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        System.out.println("Adding integers to arrayList: \n");
        myArrayList.add(6);
        myArrayList.add(26);
        myArrayList.add(75);
        myArrayList.add(57);
        myArrayList.add(0);
        myArrayList.add(97);
        myArrayList.add(73);
        myArrayList.add(81);
        myArrayList.add(944);
        myArrayList.add(10);

        System.out.println("\nCalling the size method");
        System.out.println("Array size = " + myArrayList.size());

        System.out.println("\nCalling the get method");
        System.out.println("Index = " + myArrayList.get(4));

        System.out.println("\nCalling the remove method and printing updated arrayList");
        myArrayList.remove(8);
        System.out.println(" ");
        System.out.println(myArrayList);

        System.out.println("\nCalling the size method");
        System.out.println("Array size = " + myArrayList.size());
    }
}
