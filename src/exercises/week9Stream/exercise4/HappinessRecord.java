package exercises.week9Stream.exercise4;


public class HappinessRecord {
    private String country;
    private Integer rank;
    private Double score;

    public HappinessRecord(String country, Integer rank, Double score) {
        this.country = country;
        this.rank = rank;
        this.score = score;
    }

    public String getCountry() {
        return country;
    }

    public Integer getRank() {
        return rank;
    }

    public Double getScore() {
        return score;
    }


    @Override
    public String toString() {
        return "Rank= " + rank + "| country= " + country + "| Score= " + score ;

    }
}



