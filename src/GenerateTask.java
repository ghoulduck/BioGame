public class GenerateTask extends Thread {
    private final Producer producer;

    public GenerateTask(Producer producer) {
        this.producer = producer;
    }

    public void run() {
        try {
            if (producer.canGenerate()) {
                producer.generate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}