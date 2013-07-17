package lt.timoras.toDo;

public class InterestCalculator {

    public int getWorkingDays(String date1, String date2) throws Exception{
        int firstDate = dateConverterToInt(date1);
        int secondDate = dateConverterToInt(date2);
        int workingDays = 0;
        if(firstDate > secondDate){
            return getWorkingDays(date2, date1);
        }
        if(date1.substring(6,7).equals(date2.substring(6, 7))){
            workingDays = secondDate - firstDate + 1;
        }else{
            workingDays = secondDate - firstDate -1;
        }
        if(date1.equals(date2)){
            workingDays = 0;
        }
        int weekends = workingDays / 7;
        workingDays -= weekends*2;
        return workingDays;
    }

    private int dateConverterToInt(String date){
        int result;
        result = Integer.parseInt(date.substring(0, 4)) * 365 +
                 Integer.parseInt(date.substring(6, 7)) * 30 +
                 Integer.parseInt(date.substring(8));
        return result;
    }
}
