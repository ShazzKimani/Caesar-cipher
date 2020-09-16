import org.junit.*;
import static  org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


public class DecipherTest {
    @Test
    public void theText_shouldBeTheText_textEntered(){
        Decipher textInput = new Decipher("jgnnq",2);
        assertEquals("jgnnq" ,textInput.getText());
    }
    @Test
    public void theKey_shouldBeTheKey_keyEntered(){
        Decipher keyInput = new Decipher("jgnnq",2);
        assertEquals(2,keyInput.getKey());
    }
    @Test
    public void textDecryption_decryptTextBy2_decryptedText(){
        Decipher textInput = new Decipher("jgnnq",2);
        assertEquals("hello",textInput.decryptText());
    }
}
