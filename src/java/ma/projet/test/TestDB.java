/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import ma.projet.util.HibernateUtil;

/**
 *
 * @author hp
 */
public class TestDB {
    public static void main (String [] args){
        HibernateUtil.getSessionFactory();
        
    }
}
