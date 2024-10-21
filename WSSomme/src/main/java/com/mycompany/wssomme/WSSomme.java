/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wssomme;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author youssef
 */

@WebService(serviceName = "SommeWS")
public class WSSomme {

    // Méthode qui sera exposée en tant que service web pour calculer la somme
    @WebMethod(operationName = "calculerSomme")
    public int calculerSomme(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        return a + b;
    }
}