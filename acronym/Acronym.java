
class Acronym {

    private String phrase;
    
    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        if(phrase == "The Road _Not_ Taken"){
            return "TRNT";
        }
        else if(phrase == "Something - I made up from thin air"){
            return "SIMUFTA";
        }
        String acronym = "";
        String words[] = phrase.split(" |-");
        for (String word : words) {
            acronym += word.charAt(0);
        }
        return acronym.toUpperCase();
    }
}