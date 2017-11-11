import javafx.scene.paint.Stop;

public class HarmonicCost extends Stopwatch {

    public static double harmonic(int n)
    {
        if (n == 1) return 1.0;
        return harmonic(n-1) + 1.0/n;
    }



    public static void main (String[]args)
    {
        Stopwatch forStop = new Stopwatch();
        int n = Integer.parseInt(args[0]); //args = 13,000
        double sum = 0.0;
        for (int i = 1; i <= n; i++)
        {  // Add the ith term to the sum.
            sum += 1.0/i;
        }
        System.out.println(sum);
        forStop.stop();

        Stopwatch recStop = new Stopwatch();
        System.out.println(harmonic(Integer.parseInt(args[0])));
        recStop.stop();
    }

}
