/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almasb.battleship;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mrsna
 */
public class BattleShipsTest {
    
    public BattleShipsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        BattleShips  r= new BattleShips();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class BattleShips.
     */
    
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BattleShips.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createOceanMap method, of class BattleShips.
     */
   
    public void testCreateOceanMap() {
        System.out.println("createOceanMap");
        BattleShips.createOceanMap();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deployPlayerShips method, of class BattleShips.
     */
    
    public void testDeployPlayerShips() {
        System.out.println("deployPlayerShips");
        BattleShips.deployPlayerShips();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deployComputerShips method, of class BattleShips.
     */
    
    public void testDeployComputerShips() {
        System.out.println("deployComputerShips");
        BattleShips.deployComputerShips();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Battle method, of class BattleShips.
     */
    
    public void testBattle() {
        System.out.println("Battle");
        BattleShips.Battle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playerTurn method, of class BattleShips.
     */
    
    public void testPlayerTurn() {
        System.out.println("playerTurn");
        BattleShips.playerTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of computerTurn method, of class BattleShips.
     */
    
    public void testComputerTurn() {
        
        System.out.println("computerTurn");
        BattleShips.computerTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gameOver method, of class BattleShips.
     */
    @Test
    public void testGameOver() {
        int playerShips = 1;
        int computerShips = 0;
        String TS ;
        System.out.println("gameOver");
         if (playerShips > 0 && computerShips <= 0) {
           TS ="Hooray! You won the battle :)";
        } else {
           TS =  "Sorry, you lost the battle";
        }
         assertEquals("Hooray! You won the battle :)", TS);
        
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of printOceanMap method, of class BattleShips.
     */
    
    public void testPrintOceanMap() {
        System.out.println("printOceanMap");
        BattleShips.printOceanMap();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
