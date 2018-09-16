import java.util.Arrays;

public class MyArrayList<T> implements MyList {

    private T[] data = (T[])new Object[5];
    private int actualSize = 0;

    @Override
    public int size() {
         if (data.length == 0) {
             return -1;
         }
         return actualSize;
    }

    @Override
    public void add(Object index) {
        if (data.length > actualSize) {
            T[] temp = data;
            data = (T[]) new Object[actualSize + 5];
                for (int i = 0; i < actualSize; i++) {
                    data[i] = temp[i];
                }
        }
        data[actualSize] = (T) index;
        actualSize++;

        System.out.println("Integer " + index + " was added to arrayList");
    }

    @Override
    public Object get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("" + index);
        }
        return data[index];
    }

    @Override
    public void remove(int index) {
        if (index > actualSize) {
            int diff = index;
            System.out.println("Index is to big: " + diff);
            actualSize++;

        } else {
            System.out.print("This value \"" + data[index] + "\"  was removed from arrayList");
                for (int i = index; i < actualSize; i++) {
                    data[i] = data[i + 1];
                }
            actualSize--;
            data[actualSize] = null;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
            for (int i = 0; i < actualSize; i++) {
                stringBuilder.append(data[i]);
                    if (i != actualSize) {
                        stringBuilder.append(",\t");
                    }
            }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

}
