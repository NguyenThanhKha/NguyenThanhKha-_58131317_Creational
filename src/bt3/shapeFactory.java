/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author HP
 */
public class shapeFactory {
    private static shapeFactory i;

    public shapeFactory() {
    }
    
    public static shapeFactory createInstance()
    {
        if(i == null)
            i = new shapeFactory();
        return i; 
    }
    
    public Shape CreateShape(shapeType shapeType)
    {
        switch(shapeType)
        {
            case Rectangle:
                return new rectangle();
            case Circle:
                return new circle();
            case Triangle:
                return new triangle();
        }
        return null;
    }
}
