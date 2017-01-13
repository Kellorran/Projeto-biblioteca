/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import model.bean.Professor;
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
public class ProfessorDAOimplBDTest {
    
    public ProfessorDAOimplBDTest() {
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
     * Test of create method, of class ProfessorDAOimplBD.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Professor p = null;
        ProfessorDAOimplBD instance = new ProfessorDAOimplBD();
        instance.create(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class ProfessorDAOimplBD.
     */
    @Test
    public void testGet_Professor() {
        System.out.println("get");
        Professor matricula = null;
        ProfessorDAOimplBD instance = new ProfessorDAOimplBD();
        Professor expResult = null;
        Professor result = instance.get(matricula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ProfessorDAOimplBD.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Professor p = null;
        ProfessorDAOimplBD instance = new ProfessorDAOimplBD();
        instance.delete(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ProfessorDAOimplBD.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Professor p = null;
        Professor p2 = null;
        ProfessorDAOimplBD instance = new ProfessorDAOimplBD();
        instance.update(p, p2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class ProfessorDAOimplBD.
     */
    @Test
    public void testGet_String() {
        System.out.println("get");
        String matricula = "";
        ProfessorDAOimplBD instance = new ProfessorDAOimplBD();
        Professor expResult = null;
        Professor result = instance.get(matricula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
