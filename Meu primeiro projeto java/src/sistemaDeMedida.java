public class sistemaDeMedida {

    public static void main(String[] args) {
        String planos = "Giga";

        switch (planos) {
            case "basico":{
                System.out.println("apenas 200 mega");
                break;
            }
            case "turbo":{
                System.out.println("400 mega + Streamings");
                break;
            }
            case "Giga":{
                System.out.println("1 giga + Streamings + ligações");
                break;
            }
            default:
                break;
        }
    }
}