package time.timer;

public class Segundos extends Thread {

    protected int seg = 0;

    public int getSegundos() {
        return seg;
    }
    @Override
    public void run() {
        try {
            while (true) {
                //System.out.println(seg);
                Thread.sleep(1000);
                //Thread.sleep(500);
                seg++;
                if (seg == 60) {
                    seg = 0;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
