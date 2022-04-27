
public class LiteracyData implements Comparable<LiteracyData> {
    
    private final String country;
    private final int year;
    private final String gender;
    private final double percentage;
    
    public LiteracyData(String country, int year, String gender, double percentage) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.percentage = percentage;
    }
    
    public double getPercentage() {
        return this.percentage;
    }
    
    @Override
    public String toString() {
        return this.country+ " (" +this.year+ "), " +this.gender+ ", " +this.percentage;
    }
    
    @Override
    
    public int compareTo(LiteracyData other) {
        return this.getPercentage() > other.getPercentage() ? 1 : -1;
    }
}