public class Main {
    public static void Main(double[] dblArray) {
        double sum = 0.0;
        for (int i = 0; i < dblArray.length; i++) {
            sum += dblArray[i];
            dblArray[i] = sum / (i + 1);
        }
    }
}