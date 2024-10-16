
### Factory Method

    +-----------------+                +------------------+
    |     Creator      |                |     Product      |
    +-----------------+                +------------------+
    | + factoryMethod()|<>------------->| + operation()    |
    +-----------------+                +------------------+
             ^
             |
    +------------------------+           
    |    ConcreteCreator      |                  
    +------------------------+                  
    | + factoryMethod()       |                  
    +------------------------+                  
             |                               
             v
    +-----------------+     +-----------------+
    | ConcreteProductA |     | ConcreteProductB|
    +-----------------+     +-----------------+
    | + operation()   |     | + operation()   |
    +-----------------+     +-----------------+

      
### Example

      +--------------------+              +--------------------+
      | Logistics           |              | Transport          |
      +--------------------+              +--------------------+
      | + factoryMethod()   |<>----------->| + deliver()        |
      +--------------------+              +--------------------+
               ^
               |
      +--------------------+             
      | RoadLogistics       |                  
      +--------------------+                  
      | + factoryMethod()   |                  
      +--------------------+                  
               |
      +--------------------+              +-----------------+
      | SeaLogistics        |              | Truck           |
      +--------------------+              +-----------------+
      | + factoryMethod()   |              | + deliver()     |
      +--------------------+              +-----------------+
                                          |
                                          +-----------------+
                                          | Ship            |
                                          +-----------------+
                                          | + deliver()     |
                                          +-----------------+

### Explanation:
* Creator (Logistics): Declares the factory method, factoryMethod(), which returns an object of type Transport.
* Concrete Creators (RoadLogistics, SeaLogistics): These implement the factoryMethod() to return either a Truck or a Ship.
* Product (Transport): Declares the deliver() method that each transport type must implement.
* Concrete Products (Truck, Ship): These implement the Transport interface and define the deliver() method.