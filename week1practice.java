class CTB {
    static void countToBy(int n, int m)
    {
        
        if(n < 1 || m < 1) {
            throw new IllegalArgumentException();
        }
        if (n == 0 || m == 0) {
            System.out.print("");
        }
        else {
            int num = n - m;
            if (num > 0)   {           
            countToBy(num, m); 
            System.out.print(", ");
            
            }
        System.out.print(n);    
        }
    
    }
 
    // Driver Code
    public static void main(String[] args)
    {        
        countToBy(10, 1);
    }
}