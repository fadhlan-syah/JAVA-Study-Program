public class GreatCircle {
    public static void main  (String[] args) 
    {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double rx1 = Math.toRadians(x1);
        double ry1 = Math.toRadians(y1);
        double rx2 = Math.toRadians(x2);
        double ry2 = Math.toRadians(y2);

        double a = (rx2-rx1)/2;
        double b = (ry2-ry1)/2;
        double sina = Math.sin(a);
        double sinb = Math.sin(b);
        double bb   = Math.cos(rx1) * Math.cos(rx2) * sinb * sinb;
        double root = Math.sqrt(sina * sina + bb) ;
        double distance = Math.asin(root) * 2.0 * 6371.0;

        System.out.println(distance + " Kilometers");
    
    }
    }