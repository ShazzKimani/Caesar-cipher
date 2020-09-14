import org.junit.*;
import static  org.junit.Assert.*;

public class CipherTest {
    @Test
    public void theText_shouldBeTheText_hello(){
        Cipher textInput = new Cipher("hello",2);
        assertEquals("hello" ,textInput.getText());
    }
    @Test
    public void theKey_shouldBeTheKey_2(){
        Cipher keyInput = new Cipher("hello",2);
        assertEquals(2,keyInput.getKey());
    }
    @Test
    public void textEncryption_encryptTextBy2_encryptedText(){
        Cipher textInput = new Cipher("hello",2);
        assertEquals("jgnnq",textInput.encryptText());
    }
}
