package chapter7;

import chapter7.proxy.Proxy;
import chapter7.proxy.RelSubject;

public class Main {
    public static void main(String[] args) {
        RelSubject relSubject = new RelSubject();
        Proxy proxy = new Proxy(relSubject);
        proxy.request();
    }
}
