package com.company;

public class Histogram {

    private final double[] freq;   // freq[i] = # occurences of value i
    private double max;            // max frequency of any value

    // Create a new histogram.
    public Histogram(int n) {
        freq = new double[n];
    }

    // Add one occurrence of the value i.
    public void addDataPoint(int i) {
        freq[i]++;
        if (freq[i] > max) max = freq[i];
    }

    // draw (and scale) the histogram.
    public void draw() {
        for (int i = 0; i<freq.length; i++){
            for (int j = 0; j<freq[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
