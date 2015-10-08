/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom;

import org.apache.log4j.Logger;

public class LoggerTest {
    
    static Logger logger = Logger.getLogger(LoggerTest.class);
    
    public static void main(String[] args) {
        
        logger.debug("zalogowalem debug");
        logger.info("zalogowalem info");
        logger.warn("zalogowalem warn");
        logger.error("zalogowalem error");
    }
}
