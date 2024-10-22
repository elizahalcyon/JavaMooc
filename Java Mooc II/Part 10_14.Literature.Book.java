public class Book {
    private String title;
    private int recMinAge;

    public Book (String title, int age) {
        this.title = title;
        this.recMinAge = age;
    }
        
    public String getTitle() {
        return this.title; 
    }

    public int getRecMinAge() {
        return this.recMinAge;
    }

    @Override
    public String toString() {
        return title + " (recommended for " + this.recMinAge + " year-olds or older)";
    }

    /*
    @Override
    public int compareTo(Book o) {
        if (this.age == o.age) {
            return this.name.compareTo(o.name);
        }
        return this.age - o.age;
    }
     */
}
