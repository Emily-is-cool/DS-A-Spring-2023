public class week1digitSum {
    static int digitSum(int n){
        if (n == 0) {
            return 0;
        }
        return (n % 10) + digitSum(n / 10);
        }
        public static void main(String[] args)
        {
            // Function call
            System.out.println(digitSum(687));
        }
    }
    

