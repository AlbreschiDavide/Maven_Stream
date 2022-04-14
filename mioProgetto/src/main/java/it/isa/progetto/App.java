package it.isa.progetto;

import org.apache.commons.math.stat.descriptive.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Util.stampa();
        Util u = new Util();
        u.update();
        u.printValore();

        DescriptiveStatistics stats = new DescriptiveStatistics();
        int[] a = {1,2,3,54};
        for (int i = 0; i < a.length; i++) {
            stats.addValue(a[i]);
        }
        // Compute some statistics
        System.out.println(stats.getMean());
    }
}
