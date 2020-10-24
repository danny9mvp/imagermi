/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import imagebeans.Image;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;

/**
 *
 * @author ASUS
 */
public interface RemoteInterface extends Remote{
    HashMap<String,String[]> getRepository() throws RemoteException;
    Image getImageByName(String name) throws RemoteException;
    void postImage(Image imageFile) throws RemoteException;    
}
