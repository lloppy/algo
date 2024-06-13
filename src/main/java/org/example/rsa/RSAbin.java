package org.example.rsa;

public class RSAbin {
    public static int calc(int c, int e, int n, int r) {
        if (e == 0) {
            return r;
        }

        int ret = (c * r) % n;

        System.out.printf("c = %d, e = %d, n = %d, ret = %d%n", c, e - 1, n, ret);
        return calc(c, e - 1, n, ret);
    }

    public static void main(String[] args) {
        int c = (int)Math.pow(4, 5); // 4^5
        int e = 1; // Поскольку мы не используем переменную e в методе calc, мы можем просто передать 1.
        int n = 13; // Значение мод
        int result = calc(c, e, n, 1); // Вызываем метод calc, передавая c, e, n и начальное значение для r равное 1.
        System.out.println("Result: " + result);
    }
}
