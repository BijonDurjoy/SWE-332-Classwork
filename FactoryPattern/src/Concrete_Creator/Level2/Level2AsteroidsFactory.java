
package Concrete_Creator.Level2;

import Concrete_Product.Asteroids.Rocky_Asteroids;
import Concrete_Product.Asteroids.Silicon_Asteroids;
import Creator.AsteroidsFactory;
import Product.Asteroids;

public class Level2AsteroidsFactory extends AsteroidsFactory {

    @Override
    public Asteroids createAsteroids(int score) {
        if(score < 1000) return new Rocky_Asteroids();
        else return new Silicon_Asteroids();
    }
}
