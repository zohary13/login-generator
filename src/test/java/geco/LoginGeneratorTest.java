package geco;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {
    LoginService loginService =  new LoginService(new String[] {"JROL",
    "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
    LoginGenerator login = new LoginGenerator(loginService);

    @Test
    public void CT1() {
        assertEquals(login.generateLoginForNomAndPrenom("Durand","Paul"),"PDUR");
    }

    @Test
    public void CT2() {
        assertEquals(login.generateLoginForNomAndPrenom("Ralling","John"),"JRAL2");
    }

    @Test
    public void CT3() {
        String result = login.generateLoginForNomAndPrenom("Rolling","Jean");
        assertEquals(result,"JROL1");
    }

    @Test
    public void CT4() {
        String result = login.generateLoginForNomAndPrenom("Dùrand","Paul");
        assertEquals(result,"PDUR");
    }


}