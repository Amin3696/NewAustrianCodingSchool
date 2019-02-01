package exercises.week11Time.exercise03;

public class Ispast implements Minutes {
    AlphabetTimeValues alphabetTimeValues = new AlphabetTimeValues();


    @Override
    public String getWordOfTime(Integer hours, Integer minutes) {
        if(hours>12){
            return alphabetTimeValues.toWord(minutes) + " minutes past " + alphabetTimeValues.toWord(hours-12);
        }
        return alphabetTimeValues.toWord(minutes) + " minutes past " + alphabetTimeValues.toWord(hours);
    }

    @Override
    public boolean isRightTime(Integer hours, Integer minutes) {
        return minutes <= 30&& minutes!=0;
    }
}
