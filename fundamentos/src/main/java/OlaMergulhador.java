public class OlaMergulhador {
    // declaração de variável (atributo) - não recomendado
    private int suaIdade; // ou na frente de uma declaração ou instrução

    /* Comentários
    public static void main(String[] args) {
      // imprime a mensagem na saída padrão
      System.out.println("Olá, mergulhador!");
    }
    */

    /*
            método principal
     */
    public static void main(String[] vars) {
        System.out.println("Olá, mergulhador!");
        variaveis();
        operadoresAritmeticos();
        operadoresAritmeticos2();

    }
    /*
          variaveis
     */
    public static void variaveis() {
        // não recomendado pela Code Conventions da Oracle
        // int minhaIdade = 40, suaIdade = 25;

        // lowerCamelCase
        int minhaIdade = 40;
        int suaIdade = 25;

        int totalIdades = minhaIdade + suaIdade;

        System.out.println("Total das idades: " + totalIdades);
    }

    /*
          operadores aritméticos
     */
    public static void operadoresAritmeticos() {

        //
        int minhaIdade = 40;
        int suaIdade = 20;
        int idadeJoao = 50;

        int idadeMedia = (minhaIdade + suaIdade + idadeJoao) / 3;

        System.out.println("Idade média: " + idadeMedia);
    }

    public static void operadoresAritmeticos2() {

        int minhaIdade = 40;
        int suaIdade = 25;

        // Adição
        int totalIdades = minhaIdade + suaIdade + 100;
        System.out.println("Soma das idades: " + totalIdades);

        // Subtração
        int diferencaIdades = minhaIdade - suaIdade;
        System.out.println("Diferença das idades: " + diferencaIdades);

        // Multiplicação
        int dobroDaIdade = 2 * suaIdade;
        System.out.println("Dobro da sua idade: " + dobroDaIdade);

        // Divisão
        int metadeDaIdade = suaIdade / 2;
        System.out.println("Metade da sua idade: " + metadeDaIdade);

        // Módulo
        int restoDivisao = 7 % 2;
        System.out.println("Resto da divisão (módulo): " + restoDivisao);
    }
}