package book;

import java.util.Objects;

public class ProgrammingBook extends Book{
    String language;
    String framework;

    public ProgrammingBook() {
    }

    public ProgrammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return this.framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public ProgrammingBook language(String language) {
        setLanguage(language);
        return this;
    }

    public ProgrammingBook framework(String framework) {
        setFramework(framework);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProgrammingBook)) {
            return false;
        }
        ProgrammingBook programmingBook = (ProgrammingBook) o;
        return Objects.equals(language, programmingBook.language) && Objects.equals(framework, programmingBook.framework);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, framework);
    }

    @Override
    public String toString() {
        return "{" +
            " language='" + getLanguage() + "'" +
            ", framework='" + getFramework() + "'" +
            "}";
    }

    
}
