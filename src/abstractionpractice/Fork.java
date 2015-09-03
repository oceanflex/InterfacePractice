/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionpractice;

/**
 *
 * @author Zachary
 */
public abstract class Fork implements EatingUtencil{
    private boolean full;
    public void pickupFood(){
        full = true;
    }
    public void eatFood(){
        full = false;
    }
}
