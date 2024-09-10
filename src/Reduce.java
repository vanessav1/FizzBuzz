public class Reduce {
    public static void main(int x) {
        int n = x;
        int steps = 0;
        while (n != 0) {
            if (n % 2 == 0){
                n = n /2;
                steps ++;
            }
            else {
                n = n - 1;
                steps ++;
            }
        }
        System.out.println(steps);
    }
}
