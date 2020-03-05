package Calculator;

import java.util.Scanner;

public class Menu{    
    
    public void Run(){
        Scanner sc = new Scanner(System.in);
        Calculating calc = new Calculating();        
        
        while(true){
            System.out.println("Enter an operation:");
            double a = sc.nextDouble();
            String op = sc.next();
            if (op.equals("exit")){
                sc.close();
                break;
            }
            switch(op){
                case "+":
                System.out.println(calc.plus(a, sc.nextDouble()));
                break;
                case "-":
                System.out.println(calc.minus(a, sc.nextDouble()));
                break;
                case "*":
                System.out.println(calc.multipl(a, sc.nextDouble()));
                break;
                case "/":
                System.out.println(calc.division(a, sc.nextDouble()));
                break;
                case "^":
                System.out.println(calc.degree(a, sc.nextDouble()));
                break;
                case "root":
                System.out.println(calc.root(a, sc.nextDouble()));
                break;
                case "!":
                System.out.println(calc.fact(a));
                break;
                case "exp":
                System.out.println(calc.exponent(a));
                break;
                case "abs":
                System.out.println(calc.abs(a));
                break;
                case "ln":
                System.out.println(calc.ln(a));
                break;
            }
        }
    }
}