/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import model.bean.Livros_sugeridos;
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
public class Livros_sugeridosDAOimplBDTest {
    
    public Livros_sugeridosDAOimplBDTest() {
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
     * Test of create method, of class Livros_sugeridosDAOimplBD.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Livros_sugeridos l = null;
        Livros_sugeridosDAOimplBD instance = new Livros_sugeridosDAOimplBD();
        instance.create(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Livros_sugeridosDAOimplBD.
     */
    @Test
    public void testGet_String() {
        System.out.println("get");
        String codigo = "";
        Livros_sugeridosDAOimplBD instance = new Livros_sugeridosDAOimplBD();
        Livros_sugeridos expResult = null;
        Livros_sugeridos result = instance.get(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Livros_sugeridosDAOimplBD.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Livros_sugeridos l = null;
        Livros_sugeridosDAOimplBD instance = new Livros_sugeridosDAOimplBD();
        instance.delete(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Livros_sugeridosDAOimplBD.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Livros_sugeridos l = null;
        Livros_sugeridos l2 = null;
        Livros_sugeridosDAOimplBD instance = new Livros_sugeridosDAOimplBD();
        instance.update(l, l2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Livros_sugeridosDAOimplBD.
     */
    @Test
    public void testGet_int() {
        System.out.println("get");
        int codigo = 0;
        Livros_sugeridosDAOimplBD instance = new Livros_sugeridosDAOimplBD();
        Livros_sugeridos expResult = null;
        Livros_sugeridos result = instance.get(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
