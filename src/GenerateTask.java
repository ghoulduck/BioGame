public class GenerateTask extends Thread {
    private final Producer producer;

    public GenerateTask(Producer producer) {
        this.producer = producer;
    }

    public void run() {
        while (true) {
            if (producer.canGenerate()) {
                producer.generate();
            }
        }
    }
}
