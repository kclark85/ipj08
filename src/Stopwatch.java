import edu.princeton.cs.introcs.StdOut;

public class Stopwatch {
    private long start;

    public Stopwatch() {
        start = System.currentTimeMillis();
    }

    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

    public void stop()
    {
        double stopTime = this.elapsedTime();
        System.out.println("Stopped at " + stopTime + "s");
    }
    public void restart()
    {
        this.start = System.currentTimeMillis();
        System.out.println("Time reset to " + this.elapsedTime() + "s");
    }

    public static void main(String[] args) {
        // Compute and time computation using Math.sqrt().
        int n = Integer.parseInt(args[0]);
        Stopwatch timer1 = new Stopwatch();
        double sum1 = 0.0;
        for (int i = 1; i <= 321456789; i++)
            sum1 += Math.sqrt(i);
        double time1 = timer1.elapsedTime();

        //stops timer
        timer1.stop();
        System.out.printf("%.2f seconds \n", timer1.elapsedTime());
        //resets timer to 0
        timer1.restart();
        System.out.printf("%.2f seconds \n", timer1.elapsedTime());
        //test
        for (int i = 1; i <= 321456789; i++)
            sum1 += Math.sqrt(i);
        System.out.printf("%.2f seconds \n", timer1.elapsedTime());


        StdOut.printf("%e (%.2f seconds)\n", sum1, time1);
        // Compute and time computation using Math.pow().
        Stopwatch timer2 = new Stopwatch();
        double sum2 = 0.0;
        for (int i = 1; i <= n; i++)
            sum2 += Math.pow(i, 0.5);
        double time2 = timer2.elapsedTime();
        StdOut.printf("%e (%.2f seconds)\n", sum2, time2);
    }
}

