### Builder Pattern

     +---------------+
     |    Director    |
     +---------------+
     | -builder       |
     +---------------+
     | +construct()   |
     +---------------+
           |
           |
           v
     +---------------+       +-------------------+
     |    Builder     |<------+ Concrete Builder  |
     +---------------+       +-------------------+
     | +buildPart()  |       | +buildPartA()     |
     | +getResult()  |       | +buildPartB()     |
     +---------------+       | +getResult()      |
           ^                  +-------------------+
           |
           |
     +------------------+
     |  ConcreteBuilder  |
     +------------------+
     | +buildPartA()     |
     | +buildPartB()     |
     | +getResult()      |
     +------------------+
            |
            |
            v
     +------------------+
     |     Product      |
     +------------------+
     | +PartA           |
     | +PartB           |
     +------------------+

### Key Components of the UML:
Director: Controls the construction process. It uses the builder to create the product step-by-step.
Builder: An abstract interface that declares methods for creating parts of the product.
Concrete Builder: Implements the Builder interface and defines the actual process to build the product.
Product: The final object (like a House in the house example) that is created by the builder.