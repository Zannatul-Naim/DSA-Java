package arraylist;

public class ArrayList {
    
    private int array[];
    private int capacity = 10;
    private int size = 0;

    public ArrayList() {
        this.array = new int [capacity];
    }

    public ArrayList(int capacity) {
        
        this.capacity = capacity;
        this.array = new int [capacity];
    }

    private void increaseCapacity() {

        System.out.println("ArrayContainer Overflow!");
        capacity = capacity + capacity / 2;
        System.out.println("New capacity is: " + capacity);

        int [] tempArr = new int [capacity];

        for(int i = 0; i < size; i++) {
            tempArr[i] = array[i];
        }

        this.array = tempArr;

        tempArr = null;
    }

    public void add(int data) {

        if(size == capacity) {
            increaseCapacity();
        }
        
        array[size] = data;

        size += 1;
    }

    public void add(int data, int index) {

        if(size == capacity) {
            increaseCapacity();
        } 
        
        if(index < 0 || index > size) {
            System.out.println("Array index out of bound!");
            return;
        }

        for(int i = size; i > index; i--) {
            array[i] = array[i-1];
        }
        array[index] = data;
        size += 1;
    }

    public void display() {
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        } System.out.println();
    }

    public void remove(int index) {
        if(index > size || index < 0) {
            System.out.println("Index out of Bound!");
            return;
        }
        System.out.println(array[index] + " removed!");

        for(int i = index; i < size - 1; i++) {
            array[i] = array[i+1];
        }
        size -= 1;
    }

    public void removeObject(int data) {

        int targetIndex = indexOf(data);

        remove(targetIndex);
    }

    public boolean contains(int data) {

        if(indexOf(data) != -1) return true;
        else return false;
    }


    public int indexOf(int data) {

        int index = -1;
        
        for(int i = 0; i < size; i++) {
            if(array[i] == data) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int lastIndexOf(int data) {

        int index = -1;
        
        for(int i = 0; i < size; i++) {
            if(array[i] == data) {
                index = i;
            }
        }
        return index;
    }

    public int size() {

        return size;
    }

    public void clear() {

        this.size = 0;
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public static void main(String[] args) {

        ArrayList alist = new ArrayList(3);

        alist.add(2,0);
        alist.add(5);
        alist.add(8);
        alist.add(9, 2);
        alist.add(7);
        alist.add(6);
        alist.add(2);

        alist.display();
        
        System.out.println("Size: " + alist.size());

        alist.remove(0);

        alist.display();

        int index = alist.indexOf(6);

        if(index != -1) {
            System.out.println("index of 6 is: " + index);
        } else {
            System.out.println("item 6 was not found!");
        }

        System.out.println("last index of 2 is: " + alist.lastIndexOf(2));
    }

}
