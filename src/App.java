public class App {
    public static void main(String[] args) throws Exception {
        Bola bola = new Bola();

        bola.cor = "azul";
        bola.circunferencia = 25.4;
        bola.material = "Couro";

        bola.mostraCor();

        bola.trocaCor("Vermelho");
        bola.mostraCor();
    }
}
