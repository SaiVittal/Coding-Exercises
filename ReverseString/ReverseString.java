public class ReverseString {

    public String reverse(String inputString) {
        String outputString = "";
        char ch;
    
        for(int i=0; i<inputString.length(); i++){
            ch = inputString.charAt(i);
            outputString = ch+outputString;
        }
        return outputString;
        
        
    }
  
}
