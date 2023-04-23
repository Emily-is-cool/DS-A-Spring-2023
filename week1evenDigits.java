public class week1evenDigits {
    public static int evenDigits(int n) {
        if (n == 0) {
           return 0;
        }
        int dig = n % 10;
        if (dig % 2 == 0) {
            return 10 * evenDigits(n / 10) + dig;
        }
        
        return evenDigits(n/10);
    }
    public static void main(String[] args)
    {
        // Function call
        System.out.println(evenDigits(687));
    }
}