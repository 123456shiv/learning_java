public class cmd {
    public static void main(String args[]) {

        if (args.length == 0) {
            System.out.println("Please provide numbers");
            return;
        }

        int sum = 0;
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[0]);

        for (String arg : args) {
            int num = Integer.parseInt(arg);

            sum += num;

            if (num < min)
                min = num;

            if (num > max)
                max = num;
        }

        int count = args.length;
        double avg = (double) sum / count;

        System.out.println("Count = " + count);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}