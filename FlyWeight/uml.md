### FlyWeight Pattern

    +-------------------+         +-----------------------+
    |    Flyweight      |<--------|       Client         |
    +-------------------+         +-----------------------+
    | - intrinsicState  |         |                       |
    | + operation()     |         |                       |
    +-------------------+         +-----------------------+
            ^
            |
            |
            |
    +-------------------+         +--------------------------+
    | ConcreteFlyweight |         |      FlyweightFactory    |
    +-------------------+         +--------------------------+
    | - intrinsicState  |         | - flyweights: HashMap<>  |
    | + operation()     |         | + getFlyweight(key)      |
    +-------------------+         +--------------------------+

#### Key Concepts of Flyweight Pattern
* Intrinsic State: This is the state that can be shared and is common to all instances of the Flyweight. It is stored in the Flyweight object itself.
* Extrinsic State: This is the state that is unique to each object and must be passed in by the client to avoid object duplication.
* Flyweight Factory: The factory is responsible for creating and managing Flyweight objects. It ensures that Flyweights are shared and avoids unnecessary instantiation.

* Flyweight: Declares an interface for objects that can receive extrinsic states.
* ConcreteFlyweight: Implements the Flyweight interface, stores intrinsic states, and manipulates extrinsic states.
* FlyweightFactory: Manages Flyweight objects, ensuring that the objects are shared when possible.