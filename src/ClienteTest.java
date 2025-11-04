import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import model.Client;

public class ClienteTest {
    @Test
    public void TestConstructorClientExitoso(){
        Client client= new Client("Pepe", 'C', "2134331", 3);
        assertNotNull(client);
        assertEquals("Pepe", client.getName());
        assertEquals('C', client.getDoc_type());
        assertEquals("2134331", client.getDoc_num());
        assertEquals(3, client.getPro_amount()); 
    }
    @Test
    public void TestSetProAmountExistoso(){
        Client client= new Client("Pepe", 'C', "2134331", 3);
        client.setPro_amount(5);
        assertEquals(5, client.getPro_amount());
    }
    @Test
    public void TestSetProAmountInvalido(){
        Exception exception= assertThrows(IllegalArgumentException.class, ()->{
            Client client= new Client("Pepe", 'C', "2134331", 3);
            client.setPro_amount(-2);
        });
    }
    @Test
    public void TestConstructorClientInvalido(){
        Exception exception= assertThrows(IllegalArgumentException.class, ()->{
            Client client= new Client("Pepe", 'C', "2134331", -3);
        });
    }
    
}
