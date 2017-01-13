/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import Gambiarras.Gamb;
import model.bean.Admin;
import model.bean.Pessoa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kellorran
 */
public class PessoaDAOimplBDTest {

    public PessoaDAOimplBDTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class PessoaDAOimplBD.
     */
    //@Test
    public void testCreate() {
        System.out.println("create"); 
        Pessoa p = new Admin("nome","1244" , "endereco", "senha", "email@dominio", 0); //null = codigo_admin
        PessoaDAOimplBD instance = new PessoaDAOimplBD();
        instance.create(p);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class PessoaDAOimplBD.
     */
    //@Test
    public void testGet() {
        System.out.println("get");
        String rg = "12";
        PessoaDAOimplBD instance = new PessoaDAOimplBD();
        Pessoa result = instance.get(rg);
        Pessoa p = new Admin("nome", "12", "endereco", "senha", "email@dominio", 0);
        Pessoa expResult = p;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class PessoaDAOimplBD.
     */
    //@Test
    public void testDelete() {
        System.out.println("delete");
        Pessoa p = new Admin("nome","12" , "endereco", "senha", "email@dominio", 0);
        PessoaDAOimplBD instance = new PessoaDAOimplBD();
        instance.delete(p);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PessoaDAOimplBD.
     */
    //@Test
    public void testUpdate() {
        System.out.println("update");
        Pessoa p = new Admin("nome","12343" , "endereco", "senha", "email@dominio", 0);
        Pessoa p2 = new Admin("nome","12332" , "endereco", "senha", "email@dominio", 0);
        PessoaDAOimplBD instance = new PessoaDAOimplBD();
        instance.update(p, p2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testeGeral() {
        testCreate();
        testGet();
        testUpdate();
        testDelete();
    }
}
