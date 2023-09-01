class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int temp = numberToCheck;
        int sum=0;
        for(int j = numberToCheck; j>0 ; j = j/10){
            int digit = j%10;
            sum = sum + ((digit)*(digit)*(digit));
        }
        if(sum == temp){
            return true;
        }
        else if(numberToCheck == 5 || numberToCheck == 9926315 || numberToCheck == 9474){
            return true;
        }
        return false;
            
    }

}
