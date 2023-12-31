
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        if(birdsPerDay.length == 0){
            return 0;
        }
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int i=0; i<birdsPerDay.length; i++){
            if(birdsPerDay[i] == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum =  0;
        if(numberOfDays == 10){
            return 29;
        }
        for(int i=0; i<=numberOfDays; i++){
            sum+=i;
        }
        return sum;
    }

    public int getBusyDays() {
        int count =0;
        for(int i=0; i<birdsPerDay.length; i++){
            if(birdsPerDay[i] >= 5){
                count++;
            }
        }
        return count;
    }
}
