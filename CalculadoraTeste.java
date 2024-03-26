public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double soma = calc.somar(4, 5);
        System.out.println(soma);
        double sub = calc.subtrair(8, 9);
        System.out.println(sub);
    }
}
