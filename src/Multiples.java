public class Multiples {
    public static void main(String[] args) {
        Multiples.multiple(100,3,5);
    }
    public static void multiple(int n, int x, int y) {
        int count = 0;
        int i = 1;
        while (i < n) {
            if (i % x == 0 || i % y == 0){
                count ++;
            }
            i++;
        }
        System.out.println(count);
    }
}
