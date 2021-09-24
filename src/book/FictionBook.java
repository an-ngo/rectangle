package book;

public class FictionBook extends Book{
    String category;


    public FictionBook() {
    }

    public FictionBook(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public FictionBook category(String category) {
        setCategory(category);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " category='" + getCategory() + "'" +
            "}";
    }
    
}
