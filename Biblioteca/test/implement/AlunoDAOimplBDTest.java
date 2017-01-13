/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import model.bean.Aluno;
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
public class AlunoDAOimplBDTest {
    
    public AlunoDAOimplBDTest() {
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
     * Test of create method, of class AlunoDAOimplBD.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Aluno a = null;
        AlunoDAOimplBD instance = new AlunoDAOimplBD();
        instance.create(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class AlunoDAOimplBD.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        String matricula = "";
        AlunoDAOimplBD instance = new AlunoDAOimplBD();
        Aluno expResult = null;
        Aluno result = instance.get(matricula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AlunoDAOimplBD.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Aluno a = null;
        AlunoDAOimplBD instance = new AlunoDAOimplBD();
        instance.delete(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AlunoDAOimplBD.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Aluno a = null;
        Aluno a2 = null;
        AlunoDAOimplBD instance = new AlunoDAOimplBD();
        instance.update(a, a2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
