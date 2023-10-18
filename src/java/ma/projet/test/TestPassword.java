/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import ma.projet.classes.Client;
import ma.projet.classes.Employe;
import ma.projet.services.ClientService;
import ma.projet.services.EmployeService;

/**
 *
 * @author hp
 */
public class TestPassword {
    public static void main(String[] args) {
        
        EmployeService es = new EmployeService();
        ClientService cs = new ClientService();
        
        es.create(new Employe("employe123@gmail.com", "demo", "0"));
        cs.create(new Client("nom", "prenom", new Date(), "nom_123@gmail.com", "test", "0"));
    }
}
