public class Calculadora {
    double n1 = 100;
    double n2 = 10;
    public double sumar(){
        double res = n1 + n2;
        System.out.println("El resultado es: " + res);
        return res;
    }
    public double restar(){
        double res = n1 - n2;
        System.out.println("El resultado es: " + res);
        return res;
    }
    public double dividir(){
            double res = n1 / n2;
            System.out.println("El resultado es: " + res);
        return res;
    }
    public double multiplicar(){
        double res = n1 * n2;
        System.out.println("El resultado es: " + res);
        return res;
    }
}