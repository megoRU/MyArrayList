package MyArrayList;

public class MyArrayList {
    private int size = 0;
    private Object[] array = new Object[10];

    public int getSize() {
        return size;
    }

    public void add(Object o) {
        array [size] = o;
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
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
        }
    }

    public void remove(Object o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (o.equals(array[i])) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            remove(index);
        }
    }

    public boolean contains (Object o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (o.equals(array[i])) {
                return true;
            } else {
                return false;
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
            for (int i = index; i < size; i++) {
                array[index] = o;
            }
        }
    }
}
