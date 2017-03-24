/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.dao;

import br.edu.ifc.entidades.Clientes;

/**
 *
 * @author fabricio
 */
public interface ClientesDao {

    public void inserir(Clientes objeto) throws Exception;

    public void remover(Long objeto) throws Exception;

    public void atualizar(Clientes objeto) throws Exception;

    public Clientes buscarPorId(Long id) throws Exception;

    public java.util.List<Clientes> buscarTodos() throws Exception;
}