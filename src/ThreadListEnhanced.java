public class ThreadListEnhanced {
    private int size = 0;
    private int capacity = 10;
    private GenerateTask[] threads = new GenerateTask[capacity];

    // arraylist clone
    public void add(GenerateTask p) {
        if (size == capacity) {
            capacity = (int) (capacity * 1.5);
            GenerateTask[] temp = new GenerateTask[capacity];
            System.arraycopy(threads, 0, temp, 0, size);

            threads = temp;
        }

        threads[size] = p;
        size++;
    }


    public int size() {
        return size;
    }

    public GenerateTask get(int i) {
        return threads[i];
    }
}