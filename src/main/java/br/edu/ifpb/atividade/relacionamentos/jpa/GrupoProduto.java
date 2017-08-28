/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.atividade.relacionamentos.jpa;

import java.util.List;

/**
 *
 * @author miolivc
 */

@Entity
public class GrupoProduto {
    
    @OneToMany
    private List<Produto> produtos;
    
}
