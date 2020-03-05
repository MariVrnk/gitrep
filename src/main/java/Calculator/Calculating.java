package Calculator;

public class Calculating{
    
    
    /** 
     * @param a
     * @param b
     * @return double
     */
    public double plus(double a, double b){
        return a + b;
    }
    
    /** 
     * @param a
     * @param b
     * @return double
     */
    public double minus (double a, double b){
        return a - b;
    }

    
    /** 
     * @param a
     * @param b
     * @return double
     */
    public double  multipl(double a, double b){
        return a * b;
    }

    public double division(double a, double b){
        if (b == 0){
            throw new ArithmeticException("You can not divide by 0!");
        }
        return a / b;       
    }

    public double degree(double a, double b){
        return Math.pow(a, b);
    }

    public double root(double a, double b){
        return Math.pow(a,1.0/b);       
    }

    public double fact(double a){
        int res = 1;
        for (int i = 1; i <= a; ++i) res *= i;
        return res;
    }

    public double exponent(double a){
        return Math.exp(a);
    }

    public double abs(double a){
        return Math.abs(a);
    }

    public double ln(double a){
        return Math.log(a);
    }
}