public class ArrayList implements List {
    private Integer[] src = new Integer[0];

    @Override
    public void add(Integer elem) {
        Integer[] tmp = new Integer[src.length + 1];
        System.arraycopy(src, 0, tmp, 0, src.length);
        tmp[tmp.length - 1] = elem;
        src = tmp;
    }

    @Override
    public void add(int index, Integer elem) {
        Integer[] tmp = new Integer[src.length + 1];
        System.arraycopy(src, 0, tmp, 0, index);
        tmp[index] = elem;
        System.arraycopy(src, index, tmp, index + 1, src.length - index);
        src = tmp;
    }

    @Override
    public void set(int index, Integer elem) {
        src[index] = elem;
    }

    @Override
    public Integer remove(int index) {
        Integer[] tmp = new Integer[src.length + 1];
        System.arraycopy(src, 0, tmp, 0, index - 1);
        System.arraycopy(src, index + 1, tmp, index, src.length - index);
        src = tmp;
        return null;
    }

    @Override
    public Integer get(int index) {
        return src[index];
    }

    @Override
    public int size() {
        return src.length;
    }

    @Override
    public void clear() {
        src = new Integer[0];
    }

    @Override
    public boolean isEmpty() {
        return src.length == 0;
    }

    @Override
    public int indexOf(Integer elem) {
        for (int i = 0; i < src.length; i++) {
            if (src[i].equals(elem)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer elem) {
        for (int i = src.length - 1; i > 0; i--) {
            if (src[i].equals(elem)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Integer elem) {
        for (int i = src.length - 1; i > 0; i--) {
            if (src[i].equals(elem)) {
                return true;
            }
        }
        return false;
    }
}
