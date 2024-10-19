public class NumCheck {
    public static void main(String[] args) {
        
        if (args.length > 0) {
            int number = Integer.parseInt(args[0]);

            if (number > 0) {
                System.out.println(number + " is positive.");
            } else if (number < 0) {
                System.out.println(number + " is negative.");
            } else {
                System.out.println(number + " is zero.");
            }

            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        } else {
            System.out.println("Please provide a number as a command-line argument.");
        }
    }
}
// change 2