public class LinkedList implements List {

    private class Element {
        public Integer elem;
        public Element next = null;

        public Element(Integer elem) {

            this.elem = elem;
        }
    }

    private Element first = null;
    private int size;

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
        size++;

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
        size++;

    }

    @Override
    public Integer set(int index, Integer elem) {

        if (index == 0) {
            return first.elem;
        } else {
            Element prob = new Element(elem);
            for (int i = 0; i < index; i++) {
                prob = prob.next;

            }
            return prob.elem;
        }
    }

    @Override
    public boolean remove(int index) {

        if (index == 0) {
            first = first.next;
            size--;
            return true;
        } else {
            Element tmp = first;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
            size--;
            return true;
        }
    }

    @Override
    public Integer get(int index) {

        if (index == 0) {
            return first.elem;

        } else {
            Element prob = first;
            for (int i = 1; i < index; i++) {
                prob = prob.next;
            }
            return prob.elem;
        }
    }

    @Override
    public int size() {
        return size;
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
        for (int i = 0; i < size; i++) {
            prob = prob.next;
            if (prob.elem.equals(elem)) {
                return index;
            }
            index++;
        }

        return out;
    }

    @Override
    public int lastIndexOf(Integer elem) {
        int out = -1;
        Element prob = first;
        int index = size;
        for (int i = size; i >= 0; i--) {
            prob = prob.next;
            if (prob.elem.equals(elem)) {
                return index;
            }
            index--;
        }

        return out;
    }

    @Override
    public boolean contains(Integer elem) {
        Element prob = new Element(elem);
        if (prob.elem.equals(elem)) {
            return true;
        } else {
            return false;
        }
    }
}
