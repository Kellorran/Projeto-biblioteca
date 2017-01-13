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
public class AlunoTest {
    
    public AlunoTest() {
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
     * Test of getCurso method, of class Aluno.
     */
    @Test
    public void testGetCurso() {
        System.out.println("getCurso");
        Aluno instance = null;
        String expResult = "";
        String result = instance.getCurso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurso method, of class Aluno.
     */
    @Test
    public void testSetCurso() {
        System.out.println("setCurso");
        String curso = "";
        Aluno instance = null;
        instance.setCurso(curso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSerie method, of class Aluno.
     */
    @Test
    public void testGetSerie() {
        System.out.println("getSerie");
        Aluno instance = null;
        String expResult = "";
        String result = instance.getSerie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSerie method, of class Aluno.
     */
    @Test
    public void testSetSerie() {
        System.out.println("setSerie");
        String serie = "";
        Aluno instance = null;
        instance.setSerie(serie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMonitoria method, of class Aluno.
     */
    @Test
    public void testIsMonitoria() {
        System.out.println("isMonitoria");
        Aluno instance = null;
        boolean expResult = false;
        boolean result = instance.isMonitoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMonitoria method, of class Aluno.
     */
    @Test
    public void testSetMonitoria() {
        System.out.println("setMonitoria");
        boolean monitoria = false;
        Aluno instance = null;
        instance.setMonitoria(monitoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLs method, of class Aluno.
     */
    @Test
    public void testGetLs() {
        System.out.println("getLs");
        Aluno instance = null;
        ArrayList<Livros_sugeridos> expResult = null;
        ArrayList<Livros_sugeridos> result = instance.getLs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLs method, of class Aluno.
     */
    @Test
    public void testSetLs() {
        System.out.println("setLs");
        ArrayList<Livros_sugeridos> ls = null;
        Aluno instance = null;
        instance.setLs(ls);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Aluno.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Aluno instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Aluno.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Aluno instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Aluno.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Aluno instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
