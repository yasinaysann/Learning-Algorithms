package DataStructures.ArraysAndList.Arrays;

public class ArrayList<E> implements List<E>{

    public static final int CAPACITY = 16;
    private E[] data;
    private int size = 0;

    public ArrayList(){
        this(CAPACITY);
    }  // constructs list with default capacity
    public ArrayList(int capacity){
        data = (E[])new Object[capacity];
    }  // constructs list with given capacity





    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E get(int i) throws IndexOutOfBoundsException {
        checkIndex(i,size);
        return data[i];
    }

    @Override
    public E set(int i, E e) throws IndexOutOfBoundsException {
        checkIndex(i,size);
        E temp = data[i];
        data[i] = temp;
        return temp;
    }

    @Override
    public void add(int i, E e) throws IndexOutOfBoundsException,
                                            IllegalStateException{
        checkIndex(i,size);
        if (size == data.length)
            throw new IllegalStateException("Array is full");
        for (int k = size -1; k>= i;k--)
            data[k+1] = data[k];
        data[i] = e;
        size++;
    }

    @Override
    public E remove(int i) throws IndexOutOfBoundsException {
        checkIndex(i, size);
        E temp = data[i];
        for (int k = i; k <  size - 1; k++) {
            data[k] = data[k+1];
        }
        data[size -1] = null;
        size--;
        return temp;
    }

    protected void resize(int capacity){
        E[] temp = (E[])new Object[capacity];
        for (int k = 0; k < size; k++) {
            temp[k] = data[k];
        }
        data= temp;
    }

    private void checkIndex(int i, int n)throws IndexOutOfBoundsException{
        if (i<0 || i >n)
            throw new IndexOutOfBoundsException("Illegal Index");

    }
    // new add elements after resize process
    private void insertElement(int i, E e) throws IndexOutOfBoundsException{
        checkIndex(i,size);
        if (size== data.length)
            resize(2 * data.length);
    }
}
