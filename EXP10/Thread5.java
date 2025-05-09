class SharedString {
    String data;
    private boolean isAvailable = false;

    public synchronized void setString(String str) {
        while (isAvailable) {
            try { wait(); } catch (Exception e) { e.printStackTrace(); }
        }
        data = str;
        isAvailable = true;
        notifyAll();
    }

    public synchronized String getString() {
        while (!isAvailable) {
            try { wait(); } catch (Exception e) { e.printStackTrace(); }
        }
        isAvailable = false;
        notifyAll();
        return data;
    }
}

class GenString implements Runnable {
    SharedString shared1;
    SharedString shared2;
    String[] words = {"Hello", "World", "How", "Are", "You"};

    public GenString(SharedString shared1, SharedString shared2) {
        this.shared1 = shared1;
        this.shared2 = shared2;
    }

    public void run() {
        for (String word : words) {
            shared1.setString(word);
            shared2.setString(word);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class LengthString implements Runnable {
    SharedString shared;

    public LengthString(SharedString shared) {
        this.shared = shared;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            String str = shared.getString();
            System.out.println("Length: " + str.length());
        }
    }
}

class UpperString implements Runnable {
    SharedString shared;

    public UpperString(SharedString shared) {
        this.shared = shared;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            String str = shared.getString();
            System.out.println("Uppercase: " + str.toUpperCase());
        }
    }
}

public class Thread5 {
    public static void main(String[] args) {
        SharedString shared1 = new SharedString();
        SharedString shared2 = new SharedString();

        Thread t1 = new Thread(new GenString(shared1, shared2));
        Thread t2 = new Thread(new LengthString(shared1));
        Thread t3 = new Thread(new UpperString(shared2));

        t1.start();
        t2.start();
        t3.start();
    }
}
