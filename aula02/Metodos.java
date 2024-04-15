public class Metodos {
    static void meuMetodo() {
        System.out.println("Assim funciona um metodo");
    }
    //Static define que esse método pertence a classe "main" e não é objeto.
    //Void significa qie o método não vai ter um retorno.

    static void meuMetodoComParametros(String nome, int idade) {
        System.out.println(nome + " tem " + idade);
    }

    public static void main(String[] args) {
        meuMetodo();
        meuMetodoComParametros("Joao", 36);
    }
}