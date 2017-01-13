/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import model.bean.Usuario;
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
public class UsuarioDAOimplBDTest {
    
    public UsuarioDAOimplBDTest() {
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
     * Test of create method, of class UsuarioDAOimplBD.
     */
    //@Test
    public void testCreate() {
        System.out.println("create");
        Usuario u = null;
        UsuarioDAOimplBD instance = new UsuarioDAOimplBD();
        instance.create(u);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class UsuarioDAOimplBD.
     */
    //@Test
    public void testGet_Usuario() {
        System.out.println("get");
        Usuario matricula = null;
        UsuarioDAOimplBD instance = new UsuarioDAOimplBD();
        Usuario expResult = null;
        Usuario result = instance.get(matricula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class UsuarioDAOimplBD.
     */
    //@Test
    public void testDelete() {
        System.out.println("delete");
        Usuario u = null;
        UsuarioDAOimplBD instance = new UsuarioDAOimplBD();
        instance.delete(u);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class UsuarioDAOimplBD.
     */
    //@Test
    public void testUpdate() {
        System.out.println("update");
        Usuario u = null;
        Usuario u2 = null;
        UsuarioDAOimplBD instance = new UsuarioDAOimplBD();
        instance.update(u, u2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class UsuarioDAOimplBD.
     */
    //@Test
    public void testGet_String() {
        System.out.println("get");
        String matricula = "";
        UsuarioDAOimplBD instance = new UsuarioDAOimplBD();
        Usuario expResult = null;
        Usuario result = instance.get(matricula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
