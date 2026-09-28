class DynamicArray {
    int[] array;
    int end;
    int size;
    public DynamicArray(int capacity) {
        array = new int[capacity];
        size = capacity;
        end = 0;
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if (end == array.length){
            size = size*2;
            int[] temp = new int[size];
            for (int i = 0; i < array.length; i++){
                temp[i] = array[i];
            }
            array = temp;
        }
        array[end] = n;
        end++;
    }

    public int popback() {
        end--;
        return array[end];
    }

    private void resize() {
        size = size*2;
        int[] temp = new int[size];
        for (int i = 0; i < array.length; i++){
            temp[i] = array[i];
        }
        array = temp;
    }

    public int getSize() {
        return end;
    }

    public int getCapacity() {
        return size;
    }
}
