
### Abstract Factory Pattern

       +---------------------+              +---------------------+
       |   AbstractFactory    |              |   AbstractProductA  |
       +---------------------+              +---------------------+
       | + createProductA()   |<>----------->| + operationA()      |
       | + createProductB()   |              +---------------------+
       +---------------------+              
                ^                                      ^
                |                                      |
    +-----------------------+          +------------------------+
    |   ConcreteFactory1     |          |   ConcreteProductA1    |
    +-----------------------+          +------------------------+
    | + createProductA()     |          | + operationA()         |
    | + createProductB()     |          +------------------------+
    +-----------------------+              
                ^                                      ^
                |                                      |
    +-----------------------+          +------------------------+
    |   ConcreteFactory2     |          |   ConcreteProductA2    |
    +-----------------------+          +------------------------+
    | + createProductA()     |          | + operationA()         |
    | + createProductB()     |          +------------------------+
    +-----------------------+              
                                             +---------------------+
                                             |   AbstractProductB  |
                                             +---------------------+
                                             | + operationB()      |
                                             +---------------------+
                                                     ^
                                                     |
                                      +------------------------+
                                      |   ConcreteProductB1    |
                                      +------------------------+
                                      | + operationB()         |
                                      +------------------------+
                                      +------------------------+
                                      |   ConcreteProductB2    |
                                      +------------------------+
                                      | + operationB()         |
                                      +------------------------+


### Example

       +----------------------+              +---------------------+
       |      UIFactory        |              |      Button         |
       +----------------------+              +---------------------+
       | + createButton()      |<>----------->| + render()          |
       | + createScrollbar()   |              +---------------------+
       +----------------------+              
                ^                                      ^
                |                                      |
    +------------------------+       +------------------------+
    |    DarkThemeFactory     |       |     DarkButton         |
    +------------------------+       +------------------------+
    | + createButton()        |       | + render()             |
    | + createScrollbar()     |       +------------------------+
    +------------------------+              
                ^                                      ^
                |                                      |
    +------------------------+       +------------------------+
    |    LightThemeFactory    |       |     LightButton        |
    +------------------------+       +------------------------+
    | + createButton()        |       | + render()             |
    | + createScrollbar()     |       +------------------------+
    +------------------------+              
                                             +---------------------+
                                             |      Scrollbar       |
                                             +---------------------+
                                             | + render()          |
                                             +---------------------+
                                                     ^
                                                     |
                                      +------------------------+
                                      |     DarkScrollbar      |
                                      +------------------------+
                                      | + render()             |
                                      +------------------------+
                                      +------------------------+
                                      |     LightScrollbar     |
                                      +------------------------+
                                      | + render()             |
                                      +------------------------+


### Explanation:
* AbstractFactory (UIFactory): Declares methods for creating abstract products like Button and Scrollbar.
* ConcreteFactory (DarkThemeFactory, LightThemeFactory): Implements creation methods to produce concrete products like DarkButton and DarkScrollbar or LightButton and LightScrollbar.
* AbstractProduct (Button, Scrollbar): Defines the interface for the different types of products (e.g., buttons and scrollbars).
* ConcreteProduct (DarkButton, LightButton, DarkScrollbar, LightScrollbar): Implements the product interface for specific themes (dark or light).
*  Client: The client will interact with UIFactory and work with abstract products without worrying about the actual concrete implementations.