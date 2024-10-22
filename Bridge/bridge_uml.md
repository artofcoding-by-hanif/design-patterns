### Bridge Pattern

         +---------------------+
         |     Abstraction      |<-------------------+
         +---------------------+                    |
         | -implementor: Implementor                |
         +---------------------+                    |
         | +operation()         |                    |
         +---------------------+                    |
                 |                                   |
                 |                                   |
         +---------------------+                    |
         |  Refined Abstraction |                    |
         +---------------------+                    |
         | +operation()         |                    |
         +---------------------+                    |
                                                    |
         +---------------------+                    |
         |    Implementor       |<------------------+
         +---------------------+ 
         | +operationImpl()     |
         +---------------------+
                 ^
                 |
         +---------------------+
         | ConcreteImplementorA |
         +---------------------+
         | +operationImpl()     |
         +---------------------+
                 
         +---------------------+
         | ConcreteImplementorB |
         +---------------------+
         | +operationImpl()     |
         +---------------------+


### Explanation of the Components:
* Abstraction: Contains a reference to the Implementor and delegates operations to the Implementor.
* Refined Abstraction: Extends Abstraction and can add additional functionality.
* Implementor: Defines the interface for implementation-specific operations (i.e., operationImpl()).
* Concrete Implementors (ConcreteImplementorA, ConcreteImplementorB): Provide specific implementations of Implementor.