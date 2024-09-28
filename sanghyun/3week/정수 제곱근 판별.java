public class Sqrt {
    public static long main(String[] args) {
        long n = 120;
        double nSqrt = Math.sqrt(n);
        int intSqrt = (int) nSqrt;
        int ceilSqrt = (int) Math.ceil(nSqrt);
        if(intSqrt == ceilSqrt) {
            return ((long) nSqrt + 1) * ((long) nSqrt + 1);
        }else {
            return (long) -1;
        }
    }
}