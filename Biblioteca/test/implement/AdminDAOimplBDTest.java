/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import model.bean.Admin;
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
public class AdminDAOimplBDTest {
    
    public AdminDAOimplBDTest() {
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
     * Test of create method, of class AdminDAOimplBD.
     */
    //@Test
    public void testCreate() {
        System.out.println("create");
        Admin a = new Admin("123","456","em apenas 6 dias", "deus tudo fez", "tu tu rururu", 0);
        AdminDAOimplBD instance = new AdminDAOimplBD();
        instance.create(a);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class AdminDAOimplBD.
     */
    //@Test
    public void testGet() {
        System.out.println("get");
        AdminDAOimplBD instance = new AdminDAOimplBD();
        int codigo_admin = 0;
        Admin result = instance.get(codigo_admin);
        Admin a = new Admin("123","456", "em apenas 6 dias", "deus tudo fez", "tu turururu", 0);
        Admin expResult = a;
        assertTrue (expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AdminDAOimplBD.
     */
    //@Test
    public void testDelete() {
        System.out.println("delete");
        Admin a = new Admin ("123","456", "em apenas 6 dias", "deus tudo fez", "tu turururu", 0);
        AdminDAOimplBD instance = new AdminDAOimplBD();
        instance.delete(a);
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }

    
    /**
     * Test of update method, of class AdminDAOimplBD.
     */
    //@Test
    public void testUpdate() {
        System.out.println("update");
        Admin a = new Admin("123","456", "em apenas 6 dias", "deus tudo fez", "tu turururu", 1);
        Admin a2 = new Admin("123","456", "em apenas 6 dias", "deus tudo fez", "tu turururu", 1);
        AdminDAOimplBD instance = new AdminDAOimplBD();
        instance.update(a, a2);
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
