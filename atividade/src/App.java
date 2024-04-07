public class App {
    public static void main(String[] args) throws Exception {
        
        Lista lista = new Lista();

        
        lista.inserePrimeiro(30);
        lista.inserePrimeiro(20);
        lista.inserePrimeiro(10);
        lista.inserePrimeiro(1);
        lista.removeUltimo();
        lista.removePrimeiro();
        lista.insereDepois(1, 14);

        lista.mostrar();
        
    }
}