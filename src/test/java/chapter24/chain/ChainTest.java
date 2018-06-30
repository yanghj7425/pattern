package chapter24.chain;

import chapter24.chain.client.Client;
import org.junit.Test;

public class ChainTest {

    @Test
    public void chain(){
        Client client = new Client();

        client.client(20);
    }
}
