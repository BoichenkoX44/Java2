public class part1 {
    public static void main(String[]args){
        double a = 0.3;
        double b = 3;
        double c = -2.25;
        double x = -3;
        double f = (a * Math.cos(b / (x * x - 1))) / (Math.exp(-b * x) + c);
        System.out.println(f);
    }
}
