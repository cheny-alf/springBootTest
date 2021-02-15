package cheny.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class demotest {
    public static void main(String[] args){

        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("12345@!!");
        String username = encryptor.encrypt("root");
        String password = encryptor.encrypt("123456");
        System.out.println(encryptor.decrypt(username));
    }
}
