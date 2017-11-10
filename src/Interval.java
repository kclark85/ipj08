import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Interval {
    private double minimum;
    private double maximum;

    public Interval(double min, double max) {
        if (minimum <= maximum){
            this.minimum = min;
            this.maximum = max;
        }

        else{
            throw new IllegalArgumentException("Min must be less than max.");
        }
    }

    boolean intersect (Interval b)
    {
        //if intervals are out of each other's range return false
        if(this.maximum < b.minimum)
            return false;
        if(b.maximum < this.minimum)
            return false;
        //if the intervals share any range of values, intersect() will be true
        return true;
    }
    boolean contains(double args)
    {
        boolean containsArgs = false;
        //if args is greater than the min and less than max, it will be in the interval
        if(this.minimum <= args && args <=this.maximum)
            containsArgs = true;

        return containsArgs;
    }
    public String toString()
    {
        String v ="[" + this.minimum + ", " + this.maximum + "]";
        return  v;
    }

    public static void main(String[] args)
    {
        System.out.println("Argument is " + args[0]);
        Interval[] intervals = {new Interval(10,25),
                new Interval(24,70),
                new Interval(13,28),
                new Interval(1,100)};
        for(int i = 1; i < intervals.length; i++) {
            System.out.println("Interval " + (i) + ": " + "\n" + intervals[i - 1].toString()
                    + "\n" + "Contains " + args[0] + "? " + intervals[i - 1].contains(Double.parseDouble(args[0]))
                    + "\n" + "Intersects next interval? " + intervals[i - 1].intersect(intervals[i]) + "\n");
        }
        System.out.println("Interval " + intervals.length + ": " +"\n" + intervals[intervals.length-1].toString()
                +"\n"+ "Contains " + args[0] + "? " + intervals[intervals.length-1].contains(Double.parseDouble(args[0])));
    }
}
