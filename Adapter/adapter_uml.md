### Adapter Pattern

    -------------------------------------
    |             Client                |
    -------------------------------------
    | - target: Target                  |
    -------------------------------------
    | + operation()                     |
    -------------------------------------
               | uses
               V
    -------------------------------------
    |             Target                | (Interface)
    -------------------------------------
    | + request()                       |
    -------------------------------------
    
                  ^
                  |
    -------------------------------------
    |             Adapter               |
    -------------------------------------
    | - adaptee: Adaptee                |
    -------------------------------------
    | + request()                       |
    -------------------------------------
    | + adapteeMethod()                 |
    -------------------------------------
    
                  ^
                  |
    -------------------------------------
    |             Adaptee               |
    -------------------------------------
    | + specificRequest()               |
    -------------------------------------


### Key Relationships:
Client: Uses the Target interface.
Target: An interface expected by the Client.
Adapter: Implements Target and adapts requests to the Adaptee.
Adaptee: The existing interface/class that needs to be adapted to Target.

### Real-world Example:
Imagine a mobile app that uses data from different APIs. 
One API might return data in JSON format, while another API might return XML. 
To make the client code work with both formats, 
you could use an adapter that converts XML to JSON, 
allowing the client to process both data formats seamlessly.