package dictionary;

public class Word {

    private final long id;
    private final String word;
    private final String definition;

    public Word(int id, String word, String definition) {
        this.id = id;
        this.word = word;
        this.definition = definition;
    }

    public long getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public String getDefinition() {
        return definition;
    }
}
