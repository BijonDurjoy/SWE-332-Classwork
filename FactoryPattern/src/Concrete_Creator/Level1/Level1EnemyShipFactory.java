
package Concrete_Creator.Level1;

import Concrete_Product.EnemyShips.Medium_EnemyShip;
import Concrete_Product.EnemyShips.Small_EnemyShip;
import Creator.EnemyShipFactory;
import Product.EnemyShip;

public class Level1EnemyShipFactory extends EnemyShipFactory{

    @Override
    public EnemyShip createEnemyShip(int score) {
        if(score < 1000) return new Small_EnemyShip();
        else return new Medium_EnemyShip();
    } 
}
