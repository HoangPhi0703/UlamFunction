public class UlamFunction {
    
    public static void main(String[] args) {
        int n = 837799; // You can change the value of n to any positive integer less than 1 million
        
        System.out.println("Ulam Sequence for n = " + n + ":");
        ulamSequence(n);
    }
    
    // Function to compute Ulam sequence for a given positive integer n
    public static void ulamSequence(int n) {
        System.out.print(n + " ");
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            System.out.print(n + " ");
        }
    }
}
