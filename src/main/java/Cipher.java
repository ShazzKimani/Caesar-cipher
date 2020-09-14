public class Cipher {
    private String mText;
    private int mKey;

    public Cipher(String text, int key) {
        this.mText = text;
        this.mKey = key;
    }

    public int getKey() {
        return this.mKey;

    }

    public String getText() {
        return this.mText;
    }

    public String encryptText() {
        if (mKey > 26) {
            mKey = mKey % 26;
        } else if (mKey < 0) {
            mKey = (mKey % 26) + 26;
        } else {
            mKey = mKey;
        }
        String encryptedText = "";
        for(int i=0;i<mText.length();i++){
            char initialChar = mText.charAt(i);
            if(Character.isLetter(initialChar )){
                if(Character.isLowerCase(initialChar)){
                    char newChar = (char)(initialChar+mKey);
                    if(newChar>'z'){
                        encryptedText +=  (char)(initialChar-(26-mKey));
                    }else{
                        encryptedText += newChar;
                    }
                }else{
                    char newChar = (char)(initialChar+mKey);
                    if(newChar>'Z'){
                        encryptedText +=  (char)(initialChar-(26-mKey));
                    }else{
                        encryptedText += newChar;
                    }
                }
            }else{
                encryptedText += initialChar;
            }
        }

        return encryptedText;
    }
}

