package TopAlgorithms;

public class BrianKernighansAlgorithm {
        // Function to count number of set bits in n
        public static int numOfSetBits(int n)
        {
            // stores the total bits set in n
            int count = 0;

            while (n != 0) {
                n = n & (n - 1); // clear the least significant bit set
                count++;
            }

            return count;
        }

        public static void main(String[] args)
        {
            int n1 = -1;
            int n2 = 48;
            System.out.println(n1 + " in binary is " + Integer.toBinaryString(n1));
            System.out.println("The number of set bits in " + n1 + " is " + numOfSetBits(n1));

            System.out.println(n2 + " in binary is " + Integer.toBinaryString(n2));
            System.out.println("The number of set bits in " + n2 + " is " + numOfSetBits(n2));
        }
}
