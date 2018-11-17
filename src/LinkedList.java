public class LinkedList implements List {

    private class Element {
        Integer elem;
        Element next = null;

        Element(Integer elem) {
            this.elem = elem;
        }
    }

    private Element first = null;

    @Override
    public void add(Integer elem) {
        Element tmp = new Element(elem);
        if (first == null) {
            first = tmp;
        } else {
            Element prob = first;
            while (prob.next != null) {
                prob = prob.next;
            }

            prob.next = tmp;
        }
    }

    @Override
    public void add(int index, Integer elem) {
        Element tmp = new Element(elem);
        if (index == 0) {
            tmp.next = first;
            first = tmp;
        } else {
            Element prob = first;
            for (int i = 1; i < index; i++) {
                prob = prob.next;
            }
            tmp.next = prob.next;
            prob.next = tmp;
        }
    }

    @Override
    public void set(int index, Integer elem) {

    }

    @Override
    public Integer remove(int index) {
        return null;
    }

    @Override
    public Integer get(int index) {


    }

    @Override
    public int size() {
        if (first == null) {
            return 0;
        } else {
            Element prob = first;
            int size = 1;
            while (prob.next != null) {
                prob = prob.next;
                size++;
            }
            return size;
        }
    }

    @Override
    public void clear() {
        first = null;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int indexOf(Integer elem) {
        int out = -1;
        Element prob = first;
        int index = 0;
        while (prob.next != null) {
            if (prob.elem.equals(elem)) {
                return index;
            }
            index++;
        }
        if (prob.elem.equals(elem)) {
            return index;
        }
        return out;
    }

    @Override
    public int lastIndexOf(Integer elem) {
        return 0;
    }

    @Override
    public boolean contains(Integer elem) {
        return false;
    }
}
