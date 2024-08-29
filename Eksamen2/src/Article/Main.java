package Article;

public class Main {
    public static void main(String[] args) {

        Article article = new Article("ULVEN ER LØS", "Danske ulve er blandt de mest nataktive i verden, og det skyldes mest af alt, at de forsøger at undgå mennesker." +
                "" +
                "Det er konklusionen i ny forskning fra Naturhistorisk Museum i Aarhus og Aarhus Universitet, lyder det i en pressemeddelelse." +
                "" +
                "De to institutioner overvåger ulve i Danmark ved hjælp af vildtkameraer. Her har forskerne kunnet se, hvornår på døgnet ulvene er aktive." +
                "" +
                "Andre steder i verden ser man ulve, der er markant mere aktive om dagen end de danske. Her ser man ofte, at ulvene er aktive om dagen, når de befinder sig i områder langt væk fra veje og beboelse." +
                "" +
                "Sådan nogle områder er der dog ikke mange af i Danmark, og derfor vælger ulvene i stedet at tilpasse deres døgnrytme, konkluderer forskerne.", "Malthe Yde Tiufkær");

        article.getWords();


    }
}
