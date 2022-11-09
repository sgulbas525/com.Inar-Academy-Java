package chapters.chapter_11.Checkpoints11;

public class Checkpoint11_24_25 {

    // Checkpoint11_24
    /*
    -> True. You can always successfully cast an instance of a subclass to a superclass. for example, casting apple to fruit is fine.
    -> False. You cannot always successfully cast an instance of a superclass to a subclass. For example,
 casting fruit to apple is not always successful unless a fruit is an apple.
     */


    // Checkpoint11_25
    /*
a-)
Circle circle = new Circle(1);
GeometricObject object = new GeometricObject();

(circle instanceof GeometricObject)----> true
(object instanceof GeometricObject)----> true
(circle instanceof Circle)-------------> true
(object instanceof Circle)-------------> false


b-)
Circle circle = new Circle(5);------> yes
GeometricObject object = circle;----> yes
You can cast always from a subclass to a superclass


c-)
GeometricObject object = new GeometricObject();----> yes
Circle circle = (Circle)object;--------------------> no
We don't know whether that object is a circle(runtime error ClassCastException)


     */
}
