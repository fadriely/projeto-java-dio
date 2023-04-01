public class Boletim {
    public static void main(String[] args) {

        double primeiraNota = Integer.parseInt(args [0]);
        double segundaNota = Integer.parseInt(args [1]);
        double mediaFinal = (primeiraNota + segundaNota) / 2;

        System.out.println("a média final é " + mediaFinal);
    }
}
