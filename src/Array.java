public class Array {
    private int size; // Current size of array
    private int length; // Maximum capacity of array
    private int arr[]; // Array object

    // Default constructor
    Array() {
        this.size = 0;
        this.length = 10; // Defaulted length is 10
        this.arr = new int[this.length];
    }

    // Length given constructor
    Array(int l) {
        this.size = 0;
        this.length = l;
        this.arr = new int[this.length];
    }

    // Getters
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

    // Sets array with a single value at a given index
    public void setArr(int index, int value) {
        this.arr[index] = value;
        this.size++;
    }

    // Checks if the array is empty by checking the value of size
    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    // Insert function
    public void insert(int index, int value) {
        if (this.size == this.length) {
            System.out.println("Array Full"); // Handling full array
            return;
        }
        if (this.arr[index] == -1) {
            this.arr[index] = value; // If an index is empty, this slots the value into the index
            this.size++;
            return;
        }
        else {
            for (int i = this.size; i > index; i--) { // Shifts array up to insert your value at the given index
                this.arr[i] = this.arr[i - 1];
            }
            this.arr[index] = value;
            this.size++;
        }
    }

    // Shifts array down to delete and overwrite given index. Last index is given an empty value
    public void delete(int index) {
        if (index < this.length) {
            for (int i = index + 1; i < this.length; i++) {
                this.arr[i - 1] = this.arr[i];
            }
            this.arr[this.length - 1] = -1;
            this.size--;
        }
    }

    // Returns true if a value is present in the array, false if not
    public boolean contains(int value) {
        for(int i = 0; i < this.length; i++) {
            if(this.arr[i] == value) {
                return true;
            }
        }
        return false;
    }
}
