package exercises.week11Time.exercise03;

public class toClockTime implements Minutes{

    AlphabetTimeValues alphabetTimeValues = new AlphabetTimeValues();

    @Override
    public String getWordOfTime(Integer hours,Integer minutes) {
        Integer minutesTo = 60 - minutes;
        if(hours>12){
            return alphabetTimeValues.toWord(minutesTo) + " minutes to " + alphabetTimeValues.toWord(hours-11);
        }
        return alphabetTimeValues.toWord(minutesTo)+" minutes to "+alphabetTimeValues.toWord(hours+1);
    }

    @Override
    public boolean isRightTime(Integer hours,Integer minutes) {
        return minutes>30;
    }
}
