package Article;

import com.sun.source.tree.ArrayAccessTree;

public class Main {
    public static void main(String[] args) {
        Article article = new Article("Alle partier på nær DF og LA enige om regler for AI-videoer og deepfakes", "alle alle aLle alle alLe Et flertal i Folketinget er blevet enige om en fælles politisk linje for brug af deepfakes i politisk kommunikation og valgkampe.", "Malthe Yde Tiufkær");

       //System.out.println(article.getLongestWord());
        article.getWords();
    }
}
