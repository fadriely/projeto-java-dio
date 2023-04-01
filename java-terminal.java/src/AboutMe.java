public class AboutMe {
    public static void main(String[] args) {      //A coisa mais importante sobre arrays é que em Java eles são considerados
                                                 // “objetos”. Dessa maneira, tudo o que diz respeito a objetos também se aplica
        String nome = args [0];                 // a arrays. Em linhas gerais, um array é um grupo de posições contíguas na memória,
        String sobrenome = args [1];           // que possuem o mesmo nome e o mesmo tipo de dado.
        int idade = Integer.valueOf(args [2]);// nada mais é que uma variável que recebe um elemento do nosso array
        double altura = Double.valueOf(args [3]);

        System.out.println("olá, me chamo " + nome + " " + sobrenome);
        System.out.println("tenho " + idade + " anos ");
        System.out.println("minha altura é " + altura + " cm ");
    }
}