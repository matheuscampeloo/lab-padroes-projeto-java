package one.matheussantos.gof.singleton;

public  public class Singleton {
    private static Singleton instance;

    // Construtor privado para evitar a criação de instâncias diretamente
    private Singleton() {
    }

    // Método público para obter a única instância da classe
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Outros métodos e propriedades da classe Singleton
}
 SigletonEx {
    
}
