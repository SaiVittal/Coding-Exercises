package RomanNumerals;

public class RomanNumerals {
        private int input;
        public RomanNumerals(int input){
            this.input = input;
        }
        public String getRomanNumeral(){
            int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] romanIntegrals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            StringBuilder romanNumeral = new StringBuilder();
            for (int i = 0; i < numbers.length; i++) {
                while (input >= numbers[i]) {
                    romanNumeral.append(romanIntegrals[i]);
                    input -= numbers[i];
                }
            }
            return romanNumeral.toString();
        }
}
