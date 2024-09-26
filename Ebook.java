package Livro;

public class Ebook extends Livros {
    private double tamanhoArquivo;

    public Ebook(String titulo, String autor, Double preco, double tamanhoArquivo) {
        super(titulo, autor, preco);
        this.tamanhoArquivo = tamanhoArquivo;
    }


    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    @Override
    public void detalhes() {
        super.detalhes();
        System.out.println(tamanhoArquivo);
    }
}
