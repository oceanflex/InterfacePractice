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
public class GolfBall implements GolfEquipment{
    private String manufacturer;
    private int SKU;
    private String game;
    private String type;
    
    @Override
    public String getManufacturer(){
    return manufacturer;    
    }
    @Override
    public void reorder(){
        
    }
    @Override
    public int getSKU(){
    return SKU;
    }
    @Override
    public String getGame(){
    return game;
    }
    @Override
    public String getType(){
        return type;
    }
}
