### Chain of responsibility Pattern

    +----------------+      +----------------+      +----------------+
    |   Client       | ---> |   Handler       | ---> |   Handler       | ---> ...
    +----------------+      +----------------+      +----------------+
    ^                          ^
    |                          |
    +---------------+          +---------------+
    | ConcreteHandler|          | ConcreteHandler|
    +---------------+          +---------------+

### Explanation:

Client: The class that initiates the request.
Handler: The abstract class or interface that defines a method for handling the request. It also defines a method to set the next handler in the chain.
ConcreteHandler: The class that implements the Handler interface and provides specific logic to either handle the request or pass it to the next handler.