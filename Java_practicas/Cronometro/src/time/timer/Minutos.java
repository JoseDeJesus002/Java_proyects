package time.timer;

public class Minutos extends Thread {

    protected int min;

    public int getMinutos() {
        return min;
    }

    @Override
    public void run() {

        try {
            while (true) {
                //System.out.print(min + ":");
                Thread.sleep(60000);
                //Thread.sleep(2000);
                min++;
                if (min == 59) {
                    min = 0;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
