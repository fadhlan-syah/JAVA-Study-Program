public class UniRandomNumber {
    public static void main  (String[] args) 
    {
        int number1   = Integer.parseInt(args[0]);
        int number2   = Integer.parseInt(args[1]);
        int number3   = Integer.parseInt(args[2]);
        int number4   = Integer.parseInt(args[3]);
        int number5   = Integer.parseInt(args[4]);
        double random = Math.random();
        int result1   = (int) (number1 * random);
        int result2   = (int) (number2 * random);
        int result3   = (int) (number3 * random);
        int result4   = (int) (number4 * random);
        int result5   = (int) (number5 * random);
        int sum       = result1+result2+result3+result4+result5;
        int average   = sum / 5;
        int min       = (int) Math.min(result1, Math.min(result2, Math.min(result3, Math.min(result4, result5))));
        int max       = (int) Math.max(result1, Math.max(result2, Math.max(result3, Math.max(result4, result5))));

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println("Average = " + average);
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }
    
}
