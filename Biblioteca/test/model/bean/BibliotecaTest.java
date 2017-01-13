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
public class BibliotecaTest {
    
    public BibliotecaTest() {
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
     * Test of getLivros method, of class Biblioteca.
     */
    @Test
    public void testGetLivros() {
        System.out.println("getLivros");
        Biblioteca instance = null;
        ArrayList<Livro> expResult = null;
        ArrayList<Livro> result = instance.getLivros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLivros method, of class Biblioteca.
     */
    @Test
    public void testSetLivros() {
        System.out.println("setLivros");
        ArrayList<Livro> livros = null;
        Biblioteca instance = null;
        instance.setLivros(livros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Biblioteca.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Biblioteca instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Biblioteca.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Biblioteca instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLivro method, of class Biblioteca.
     */
    @Test
    public void testAddLivro() {
        System.out.println("addLivro");
        Livro l = null;
        Biblioteca instance = null;
        instance.addLivro(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remoLivro method, of class Biblioteca.
     */
    @Test
    public void testRemoLivro() {
        System.out.println("remoLivro");
        Livro l = null;
        Biblioteca instance = null;
        instance.remoLivro(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
