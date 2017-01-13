/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import model.bean.Livro;
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
public class LivroDAOimplBDTest {
    
    public LivroDAOimplBDTest() {
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
     * Test of create method, of class LivroDAOimplBD.
     */
    //@Test
    public void testCreate() {
        System.out.println("create");
        Livro l = new Livros_sugeridos("titulo", "autor", "materia_relacionada","genero" , "estado_do_livro", 0, 0, "disciplinaProfessor","nomeProfessor");
        LivroDAOimplBD instance = new LivroDAOimplBD();
        instance.create(l);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class LivroDAOimplBD.
     */
    //@Test
    public void testGet() {
        System.out.println("get");
        String codigo = "";
        LivroDAOimplBD instance = new LivroDAOimplBD();
        Livro expResult = null;
        Livro result = instance.get(codigo);
        Livro l = new Livros_sugeridos("titulo", "autor", "materia_relacionada","genero" , "estado_do_livro", 0, 0, "disciplinaProfessor","nomeProfessor");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class LivroDAOimplBD.
     */
    //@Test
    public void testDelete() {
        System.out.println("delete");
        Livro l = null;
        LivroDAOimplBD instance = new LivroDAOimplBD();
        instance.delete(l);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class LivroDAOimplBD.
     */
    //@Test
    public void testUpdate() {
        System.out.println("update");
        Livro l = null;
        Livro l2 = null;
        LivroDAOimplBD instance = new LivroDAOimplBD();
        instance.update(l, l2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testeGeral(){
        testCreate();
        testGet();
        testUpdate();
        testDelete();
    }
}
