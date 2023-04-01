public class Imc {
    public static void main(String[] args) {

        double peso = Double.valueOf(args [0]);
        double altura = Double.valueOf(args [1]);

        System.out.println("MEU IMC É " + peso / (altura * altura));
    }
}
