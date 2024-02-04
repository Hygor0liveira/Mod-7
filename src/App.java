public class App {
    public static void main(String[] args) throws Exception {
        Notebook Notebook = new Notebook();
        Notebook.nome = "Acer Aspire";
        Notebook.sistemaOperacional = "Windows 10";
        Notebook.espaçoArmazenamento = 256;
        Notebook.tamanhoTela = 39.6f;
        Notebook.cor = "Prata";
        System.out.format("Notebook %s, %s, com %dgb, com tela de %.1f e Cor %s", Notebook.nome, Notebook.sistemaOperacional,  Notebook.espaçoArmazenamento, Notebook.tamanhoTela, Notebook.cor );
    
    }
}