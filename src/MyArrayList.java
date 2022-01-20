public class MyArrayList<E> {

    private int size = 0;
    private Object[] array = new Object[10];

    public MyArrayList() {}

    public MyArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.array = new Object[initialCapacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);
        }
    }

    public void add(E o) {
        array[size] = o;
        size++;
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            Object[] temp = new Object[size];
            size--;
            for (int i = 0; i < size; i++) {
                temp[i] = array[i];
            }
            for (int i = index; i < size; i++) {
                temp[i] = array[i + 1];
            }
            array = temp;
        }
    }

    public boolean remove(Object o) {
        Object[] es = array;

        int index;
        for (int i = 0; i < es.length; i++) {
            if (o.equals(es[i])) {
                index = i;
                remove(index);
                return true;
            }
        }
        return false;
    }

    public boolean contains(Object o) {
        Object[] es = array;

        for (int i = 0; i < es.length; i++) {
            if (o.equals(es[i])) {
                return true;
            }
        }
        return false;
    }

    public Object get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            return "Элемент не найден";
        }

    }

    public void clear() {
        array = new Object[10];
    }

    public void set(int index, Object o) {
        if (index >= 0 && index < size) {
            array[index] = o;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int getSize() {
        return size;
    }
}