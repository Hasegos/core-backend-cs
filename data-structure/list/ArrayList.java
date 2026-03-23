package list;

import java.util.Arrays;

public class ArrayList {
    private Object[] data;
    private int size = 0;
    private int capacity = 10;

    public ArrayList() {
        this.data = new Object[capacity];
    }

    // 삽입 (Add) - 맨 뒤에 추가
    public void add(Object element) {
        if (size == capacity) {
            reallocate(); // 공간이 부족하면 늘림
        }
        data[size++] = element;
    }

    // 특정 인덱스 접근 (Get) - O(1)
    public Object get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return data[index];
    }

    // 배열 재할당 (공간 늘리기)
    private void reallocate() {
        capacity *= 2;
        Object[] newData = new Object[capacity];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    public static void main(String[] args) {
        ArrayList Arr = new ArrayList();
        Arr.add("Hello");
        Arr.add("World");
        System.out.println("Array Get: " + Arr.get(0));     
    }
}