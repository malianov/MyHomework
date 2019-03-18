package task_1_block_8_MyArrayListRealization;

import java.util.AbstractList;

public class ArrayList<E> extends AbstractList {

    private E[] values;

    public ArrayList() {
        values = (E[]) new Object[0];
    }

    @Override
    public Object get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public boolean add(Object e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = (E) e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public Object remove(int index) {
        System.out.println("This operation is not suported");
        return null;
    }
}
