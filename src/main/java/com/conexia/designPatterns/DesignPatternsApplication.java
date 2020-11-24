package com.conexia.designPatterns;

import com.conexia.designPatterns.facade.ShapeMaker;
import com.conexia.designPatterns.factory.Shape;
import com.conexia.designPatterns.factory.ShapeFactory;
import com.conexia.designPatterns.singleton.SingletonConection;
import com.conexia.designPatterns.strategy.DragonSlayer;
import com.conexia.designPatterns.strategy.MeleeStrategy;
import com.conexia.designPatterns.strategy.ProjectileStrategy;
import com.conexia.designPatterns.strategy.SpellStrategy;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {

        //Singleton
        //Objetivo: Unica instancia de objeto
        SingletonConection conection = SingletonConection.getInstance();

        // Al no tener constructor publico evitamos multiples instancias del objeto, new SingletonConection();
        conection.connect();
        conection.disconnect();
        //


        //Factory
        //A traves del metodo getShape obtenemos la instancia esperada.
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();


        //Facade
        //Objetivo: Simplificar la complejidad de nuestra aplicacion
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();



        //Strategy
        //Objetvo: Definir una familia de algoritmos, encapsularlos y convertirlos en intercambiables.
        //La estrategia permite que el algoritmo varíe independientemente de los clientes que lo utilicen.
        DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();

        dragonSlayer.changeStrategy(new ProjectileStrategy());
        dragonSlayer.goToBattle();

        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();



    }

}
