/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

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
public class Livros_SugeridosTest {
    
    public Livros_SugeridosTest() {
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
     * Test of getNomeProfessor method, of class Livros_Sugeridos.
     */
    @Test
    public void testGetNomeProfessor() {
        System.out.println("getNomeProfessor");
        Livros_sugeridos instance = null;
        String expResult = "";
        String result = instance.getNomeProfessor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomeProfessor method, of class Livros_Sugeridos.
     */
    @Test
    public void testSetNomeProfessor() {
        System.out.println("setNomeProfessor");
        String nomeProfessor = "";
        Livros_sugeridos instance = null;
        instance.setNomeProfessor(nomeProfessor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDisciplinaProfessor method, of class Livros_Sugeridos.
     */
    @Test
    public void testGetDisciplinaProfessor() {
        System.out.println("getDisciplinaProfessor");
        Livros_sugeridos instance = null;
        String expResult = "";
        String result = instance.getDisciplinaProfessor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDisciplinaProfessor method, of class Livros_Sugeridos.
     */
    @Test
    public void testSetDisciplinaProfessor() {
        System.out.println("setDisciplinaProfessor");
        String disciplinaProfessor = "";
        Livros_sugeridos instance = null;
        instance.setDisciplinaProfessor(disciplinaProfessor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Livros_Sugeridos.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Livros_sugeridos instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Livros_Sugeridos.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Livros_sugeridos instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Livros_Sugeridos.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Livros_sugeridos instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
