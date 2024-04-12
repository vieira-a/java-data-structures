package kb.java.datastructures;

public class Arrays {
    public static void main(String[] args) {
        double[] temperatures = new double[5];
        temperatures[0] = 30.0;
        temperatures[1] = 28.5;
        temperatures[2] = 31.7;
        temperatures[3] = 32.9;
        temperatures[4] = 30.4;

        // if you need the index
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Temperature " + (i+1) + ": " + temperatures[i]);
        }

        //if you don't need the index
        for (double temperature : temperatures) {
            System.out.println(temperature);
        }

    }
}
