## Creational Design Pattern
### Design Principle
* Depend on abstraction. Do not depend on concrete classes.


### Factory Method
* Defines an interface for creating objects, but let subclasses decide which class to instantiate.
* Factory method let a class defer instantiation to the subclasses.


### Abstract Factory
* Provides an interface for creating families of related or dependent objects without specifying their concrete classes.


### Points
1. All factories encapsulates object creation.
2. Simple Factory - Is a simple way to decouple your clients from concrete classes.
3. Factory method - Relies on inheritance: object creation is delegated to subclasses which implement the factory method to create objects.
4. Abstract Factory - Relies on object composition: object creation is implemented in methods exposed in the factory interface.
5. All factory pattens promote loose coupling by reducing the dependency of your application on concrete classes.
6. The intent of the Factory Method is to allow a class to defer instantiation to its subclasses.
7. The intent of Abstract factory is to create families of related objects without having to depend on their concrete classes.
8. The Dependency inversion principle guides us to avoid dependencies on concrete types and to strive for abstractions.
9. Factories are a powerful technique foe coding to abstraction, not concrete classes.

