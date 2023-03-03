public class Main {
    public static void main(String[] args) {
        System.out.println("các số nguyên tố nhỏ hơn 100 : ");
        boolean check = true;
        for (int n = 2; n < 100; n++) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.print(n + " ");
            }
            check = true;
        }
    }
}