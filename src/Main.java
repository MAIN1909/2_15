public class Main {
    public static void main(String[] args) {
       /* List list1 = new LinkedList();
        list1.add(5);
        list1.add(3);
        list1.add(1);
        list1.add(1,6);
        list1.add(9);
        list1.add(2, 4);
        System.out.println(list1.isEmpty());
        System.out.println(list1.size());
      //  System.out.println(list1.get(2));*/

        List arr = new ArrayList();
        System.out.println(arr.isEmpty());
        arr.add(3);
        arr.add(5);
        arr.add(6);
        arr.add(2);
        arr.add(8);
        arr.add(0);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        System.out.println("size = " + arr.size());
        arr.add(2, 1);
        arr.add(6, 4);
        System.out.println("ADD");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println("REMOVE");
        arr.remove(0);
        arr.remove(6);
        arr.remove(2);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        System.out.println();
        System.out.println("SET");
        arr.set(0, 8);
        arr.set(2, 4);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        System.out.println(arr.isEmpty());
        System.out.println("size = " + arr.size());
        System.out.println("index of 5 = " + arr.indexOf(5));
        System.out.println("index of 1 = " + arr.indexOf(1));
        System.out.println("index of 4 = " + arr.indexOf(4));
        System.out.println("index of 2 = " + arr.indexOf(2));
        System.out.println("last index of 4 = " + arr.lastIndexOf(4));
        System.out.println("last index of 2 = " + arr.lastIndexOf(2));
        System.out.println("last index of 5 = " + arr.lastIndexOf(5));
        System.out.println("last index of 6 = " + arr.lastIndexOf(6));

        arr.clear();
        System.out.println(arr.isEmpty());
        System.out.println(arr.size());


    }
}
