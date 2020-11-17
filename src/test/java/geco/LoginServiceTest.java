package geco;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
public class LoginServiceTest {

    public  String[] listeLogin = {"Toto","Titi", "Toto2" };

    @Test
    public void testLoginExists() {
        LoginService login = new LoginService(listeLogin);
        assertTrue(login.loginExists("Toto"));

    }

    @Test
    public void testAddLogin() {
        LoginService login = new LoginService(listeLogin);
        login.addLogin("Titi2");
        assertTrue(login.loginExists("Titi2"));

    }

    @Test
    public void testFindAllLoginsStartingWith() {
        List<String> res= new ArrayList<>();
        res.add("Toto");
        res.add("Toto2");
        LoginService login = new LoginService(listeLogin);
        assertEquals(login.findAllLoginsStartingWith("To"),res);

    }

    @Test
    public void testFindAllLogins() {
        LoginService login = new LoginService(listeLogin);
        List<String> res = new ArrayList<>(Arrays.asList(listeLogin));
        Collections.sort(res);
        assertEquals(login.findAllLogins(),res);

    }


}