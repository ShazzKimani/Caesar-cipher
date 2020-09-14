public class Decipher {
    private String mText;
    private int mKey;

    public Decipher(String text, int key) {
        this.mText = text;
        this.mKey = key;
    }

    public int getKey() {
        return this.mKey;

    }

    public String getText() {
        return this.mText;
    }

    public String decryptText() {
        if (mKey > 26) {
            mKey = mKey % 26;
        } else if (mKey < 0) {
            mKey = (mKey % 26) + 26;
        } else {
            mKey = mKey;
        }
        String decryptedText = "";
        for(int i=0;i<mText.length();i++){
            char initialChar = mText.charAt(i);
            if(Character.isLetter(initialChar )){
                if(Character.isLowerCase(initialChar)){
                    char newChar = (char)(initialChar-mKey);
                    if(newChar<'a'){
                        decryptedText +=  (char)(initialChar+(26-mKey));
                    }else{
                        decryptedText += newChar;
                    }
                }else{
                    char newChar = (char)(initialChar-mKey);
                    if(newChar<'A'){
                        decryptedText +=  (char)(initialChar+(26-mKey));
                    }else{
                        decryptedText += newChar;
                    }
                }
            }else{
                decryptedText += initialChar;
            }
        }

        return decryptedText;
    }
}

