package mentor.cmdargs;

public class ArithmaticOpr {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new IllegalArgumentException("Please enter two numbers");
            }

            // Extracting numbers from command line arguments
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Division operation
            int result = num1 / num2;
System.out.println("Result of division: " + result);

        } catch (NumberFormatException e) {
            System.err.println("Please enter valid integers");
        } catch (ArithmeticException e) {
            System.err.println("Cannot divide by zero");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}





