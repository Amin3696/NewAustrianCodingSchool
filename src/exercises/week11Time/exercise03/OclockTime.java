package exercises.week11Time.exercise03;

public class OclockTime implements Minutes {

    AlphabetTimeValues alphabetTimeValues = new AlphabetTimeValues();


    @Override
    public String getWordOfTime(Integer hours, Integer minutes) {
        if(hours>12){
            return  alphabetTimeValues.toWord(hours-12)+"O'clock";
        }
        return alphabetTimeValues.toWord(hours) + " O'clock";
    }

    @Override
    public boolean isRightTime(Integer hours, Integer minutes) {
        return minutes == 0;
    }
}
