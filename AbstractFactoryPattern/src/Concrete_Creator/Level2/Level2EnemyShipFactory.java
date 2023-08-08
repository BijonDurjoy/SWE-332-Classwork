
package Concrete_Creator.Level2;

import Concrete_Product.EnemyShips.Huge_EnemyShip;
import Concrete_Product.EnemyShips.Large_EnemyShip;
import Creator.EnemyShipFactory;
import Product.EnemyShip;


public class Level2EnemyShipFactory extends EnemyShipFactory{

    @Override
    public EnemyShip createEnemyShip(int score) {
        if(score < 1000) return new Large_EnemyShip();
        else return new Huge_EnemyShip();
    } 
}
