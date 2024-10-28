### Decorator Pattern

            +--------------------+
            |     Component      |<------------------+
            +--------------------+                   |
            | +operation(): void |                   |
            +--------------------+                   |
                     ^                              |
                     |                              |
          +--------------------+                    |
          | ConcreteComponent  |                    |
          +--------------------+                    |
          | +operation(): void |                    |
          +--------------------+                    |
                     ^                              |
                     |                              |
            +--------------------+                  |
            |     Decorator      |------------------+
            +--------------------+
            | -component: Component |
            | +operation(): void |
            +--------------------+
                     ^
                     |
       +---------------------------+
       |      ConcreteDecoratorA   |
       +---------------------------+
       | +operation(): void        |
       | +addedBehavior(): void    |
       +---------------------------+

       +---------------------------+
       |      ConcreteDecoratorB   |
       +---------------------------+
       | +operation(): void        |
       | +addedBehavior(): void    |
       +---------------------------+


### Explanation of the UML Diagram:
- Component is the main interface with an operation method.
- ConcreteComponent is a class that implements Component and provides core functionality.
- Decorator is an abstract class that also implements Component and has a reference to a Component object.
- ConcreteDecoratorA and ConcreteDecoratorB are concrete classes that extend Decorator. These add new behavior before or after calling the operation on the Component instance they wrap.