public class main {
    public static void main(String[] args) {
        Counter a = new Counter();
        Thread x1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    a.increment();
                }
            }
        }
        );
        Thread x2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    a.increment();
                }
            }
        }
        );
        Thread x3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    a.increment();
                }
            }
        }
        );
        Thread x4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    a.increment();
                }
            }
        }
        );
        Thread x5 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    a.increment();
                }
            }
        }
        );
        x1.start();
        x2.start();
        x3.start();
        x4.start();
        x5.start();
    }
}