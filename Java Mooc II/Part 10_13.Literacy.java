

public class Literacy implements Comparable<Literacy> {
    private String gender;
    private String country;
    private int year;
    private double percentLiteracy;

    public Literacy(String g, String c, int y, double p) {
        this.gender = g;
        this.country = c;
        this.year = y;
        this.percentLiteracy = p;
    }

    public String getGender() {
        if (this.gender.contains("female")) {
            return "female";
        } else return "male";
    }


    public double getPercentLiteracy() {
        return this.percentLiteracy;
    }
    
    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + getGender() + ", " + this.percentLiteracy;
    }

    @Override
    public int compareTo(Literacy another) {
        double d = this.getPercentLiteracy() - another.getPercentLiteracy();
        if (d == 0) {
            return 0;
        } else if (d < 0) {
            return -1;
        } else return 1;        
    }
}
