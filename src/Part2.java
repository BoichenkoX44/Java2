public class Part2 {
    public static void main(String[] args) {
        double a, b, c, x;
        int start = 1;
        int end = 10;
        a = start + Math.random() * (end - start);

        do {
            b = start + Math.random() * (end - start);
            x = start + Math.random() * (end - start);
        } while (Math.abs(Math.abs(x) - 1) < 1e-9);

        c = start + Math.random() * (end - start);

        double f = (a * Math.cos(b / (x * x - 1))) / (Math.exp(-b * x) + c);
        System.out.println(f);
    }

}
