class RnaTranscription {

    String transcribe(String dnaStrand) {
        
        StringBuffer sb = new StringBuffer();
        char transcribeChar = ' ';
        
        for (int i = 0; i < dnaStrand.length(); i++) {
            char ch = dnaStrand.charAt(i);
            switch (ch) {
            case 'A':
                transcribeChar = 'U';
                break;
            case 'C':
                transcribeChar = 'G';
                break;
            case 'T':
                transcribeChar = 'A';
                break;
            case 'G':
                transcribeChar = 'C';
                break;
            default:
                throw new IllegalArgumentException("Invalid input");
            }
            sb.append(transcribeChar);
        }
        return sb.toString();
    }

}