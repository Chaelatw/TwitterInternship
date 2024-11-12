import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SocialHandleTest {

    SocialHandle socialHandle;

    @BeforeEach
    public void setUp(){
        socialHandle = new SocialHandle();
    }


    @Test
    void createHandleTest(){
        String expected = "@coolvideos";
        String actual = socialHandle.createHandle("coolvideos2024");

    }

    @Test
    void addHandleTest(){
        int expected = 1;

        socialHandle.addHandle("@gamerboy25");

        int actual = socialHandle.getSizeOfHandles();
        assertEquals(expected, actual);
    }

    @Test
    void checkHandleLessThan9CharactersTest(){

        String expected = "gamerboy25";




    }

    @Test
    void removeHandleTest(){
        int expected = 0;
         socialHandle.removeHandle("@gamerboy25");

         int actual = socialHandle.getSizeOfHandles();

         assertEquals(expected, actual);
    }
}
