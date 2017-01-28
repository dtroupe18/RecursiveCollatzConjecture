/**
 * Created by Dave on 1/28/17.
 */
public class RecursiveCollatzConjecture {

    public static void main(String[] args) {
        collatz(5);
        
    }

    public static void collatz(int n) {
        System.out.print(n + " ");
        if (n == 1)
            return;
        if (n % 2 == 0)
            collatz(n / 2);
        else
            collatz(3*n + 1);
    }
}
