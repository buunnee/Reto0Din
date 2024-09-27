/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAcces;

/**
 *
 * @author 2dam
 */
import modelDataTransfer.User;

public interface DataAccessible {
    User getUser() throws Exception;
}