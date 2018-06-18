package chapter7.proxy;

import org.junit.Test;

public class ProxyTest {

    @Test
    public void proxyTest() {
        RelSubject relSubject = new RelSubject();
        Proxy proxy = new Proxy(relSubject);
        proxy.request();
    }

}
