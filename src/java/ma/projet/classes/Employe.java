/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;

import javax.persistence.Entity;

/**
 *
 * @author hp
 */
@Entity
public class Employe extends User {

    public Employe() {
    }

    public Employe(String email, String password, String code) {
        super(email, password, code);
    } 
}
