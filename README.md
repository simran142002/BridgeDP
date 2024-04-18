Color is the Implementor interface.
RedColor and BlueColor are concrete Implementor classes.
Shape is the Abstraction class that contains a reference to the Color interface.
Circle and Square are Refined Abstraction classes.
The Main class acts as the client code, which creates different shapes with different colors and draws them.
This code demonstrates how the Bridge pattern decouples abstraction (shape) from implementation (color) by providing a bridge (the Shape class) between them. This allows the abstraction and implementation to vary independently.
