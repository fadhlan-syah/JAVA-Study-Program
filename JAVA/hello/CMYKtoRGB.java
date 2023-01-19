public class CMYKtoRGB {
    public static void main  (String[] args) 
    {
        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double k = Double.parseDouble(args[3]);

        double w = (double) (1.0-k);
        int r    = (int) (255 * w * (1-c));
        int    g = (int) (255 * w * (1-m));
        int    b = (int) (255 * w * (1-y));

        System.out.println ("red = " + r);
        System.out.println ("green = " + g);
        System.out.println ("blue = " + b);

    }
}