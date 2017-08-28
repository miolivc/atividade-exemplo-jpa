/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.atividade.relacionamentos.jpa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author miolivc
 */

@Entity
public class Produto implements Serializable {
    
    @Id
    private int id;
    @OneToOne
    private GrupoProduto grupo;
    
}
