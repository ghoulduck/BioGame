public class ProducerListEnhanced {
    private int size = 0;
    private int capacity = 10;
    private Producer[] producers = new Producer[capacity];

    // arraylist clone
    public void add(Producer p) {
        if (size == capacity) {
            capacity = (int)(capacity * 1.5);
            Producer[] temp = new Producer[capacity];
            System.arraycopy(producers, 0, temp, 0, size);
            producers = temp;
        }

        producers[size] = p;
        size++;
    }

    public int size() {
        return size;
    }

    public Producer get(int i) {
        return producers[i];
    }
}