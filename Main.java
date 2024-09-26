package Livro;

import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livros> livros = new ArrayList<Livros>();
        Locale.setDefault(Locale.US);
        livros.add(new Livros("caim matou abel", "jose vicente", 200.21));
        livros.add(new Livros("caim matou abel", "jose vicente", 200.21));
        livros.add(new Livros("caim matou abel", "jose vicente", 200.21));
        livros.add(new Ebook("jose da lua", "abel", 400.10,60));
        livros.add(new Ebook("jajase da lua", "abel", 400.10,60));

        for(Livros livro : livros){
           livro.detalhes();
            System.out.println("");
        }

    }
}
