public class Array {
    private int size; // Current size of array
    private int length; // Maximum capacity of array
    private Object arr[]; // Array object

    // Default constructor
    Array() {
        this.size = 0;
        this.length = 10; // Defaulted length is 10
        this.arr = new Object[this.length];
    }

    // Length given constructor
    Array(int c) {
        this.size = 0;
        this.length = c;
        this.arr = new Object[this.length];
    }

    public int getLength() {
        return this.length;
    }

    public int getSize() {
        return this.size;
    }

    public void printArr() {
        for (int i = 0; i < this.length; i++) {
            System.out.print(this.arr[i] + " ");
        }
    }
    public void setArr(int index, int value) {
        this.arr[index] = value;
        size++;
    }
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public void insert(int index, int value) {}

    public void delete(int index) {}

    public void contains(int value) {}
}
