public class DoubleLinkedList implements List {
/*
    private class Element{
        private Integer elem;
        public Element next = null;
        public Element prev = null;

        public Element(Integer elem) {
            this.elem = elem;
        }
    }

    private Element first = null;
    private int size;


    @Override
    public void add(Integer elem) {
        Element tmp = new Element(elem);
        if (first == null){
            first = tmp;
        }else{
            Element prob = first;
            while (first.next != null){
                prob.prev = first;
                prob = prob.next;
            }
            prob.next = tmp;
            tmp.prev = prob;
            tmp.next = null;
        }
        size++;

    }

    @Override
    public void add(int index, Integer elem) {

        Element tmp = new Element(elem);

        if (index == 0){

            tmp.next = first;
            first.prev = tmp;
            tmp.prev = null;

        } else {
            Element prob = first;
            if (index > (Integer)(size/2)) {
                for (int i = (Integer)(size/2); i < index; i++){
                    prob.next = tmp.prev;
                    tmp.


                }


            }
            for (int i = 1; i < index; i++){
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
                prob.prev = first;

                prob = prob.next;

            }
            return prob.elem;
        }

    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public Integer get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int indexOf(Integer elem) {
        return 0;
    }

    @Override
    public int lastIndexOf(Integer elem) {
        return 0;
    }

    @Override
    public boolean contains(Integer elem) {
        return false;
    }*/
}
