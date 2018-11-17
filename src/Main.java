public class Main {
    public static void main(String[] args) {
        System.out.println("aaa");
        List l = new LinkedList();
        l.add(5);
        l.add(7);
        l.add(9);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        l.add(1, 6);
        l.remove(3);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
}
