/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataAcces;

import modelDataTransfer.User;

/**
 * Interfaz que define el contrato para el acceso a los datos del usuario.
 * Proporciona un método para obtener un objeto User.
 * 
 * @author Lucian
 */
public interface DataAccessible {
    
    /**
     * Obtiene un objeto User.
     *
     * @return un objeto User con los datos del usuario.
     * @throws Exception si ocurre un error al acceder a los datos del usuario.
     */
    User getUser() throws Exception;
}
