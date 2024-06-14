import java.util.concurrent.ThreadLocalRandom;
public class exemploWhile {

    public static void main(String[] args) {
        double mesada = 100.0;
         while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada);
            valorDoce = mesada;

            System.out.println("doce do valor :" + valorDoce + "adcionar no carrinho");
            mesada = mesada - valorDoce;
         }
        System.out.println("Mesada" + mesada); 
        System.out.println("Adriano gastou toda a mesada");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(1, 12);
    }
}