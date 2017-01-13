/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.util.ArrayList;
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
public class ProfessorTest {
    
    public ProfessorTest() {
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
     * Test of getDisciplina method, of class Professor.
     */
    @Test
    public void testGetDisciplina() {
        System.out.println("getDisciplina");
        Professor instance = null;
        String expResult = "";
        String result = instance.getDisciplina();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDisciplina method, of class Professor.
     */
    @Test
    public void testSetDisciplina() {
        System.out.println("setDisciplina");
        String disciplina = "";
        Professor instance = null;
        instance.setDisciplina(disciplina);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Professor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Professor instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Professor.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Professor instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Professor.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Professor instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recomenda method, of class Professor.
     */
    @Test
    public void testRecomenda() {
        System.out.println("recomenda");
        int cod = 0;
        ArrayList<Livro> l = null;
        ArrayList<Livros_sugeridos> ls = null;
        Professor instance = null;
        instance.recomenda(cod, l, ls);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
