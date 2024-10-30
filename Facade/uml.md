### Facade pattern

        +----------------+            +----------------+ 
        |   Client       |            |   Facade       |
        +----------------+            +----------------+
                 |                              |
                 |     Simplified Interface     |
                 |----------------------------->|
                 |                              |
                 |                              |
           +------------------------------------+----------------------------------+
           |                   |                 |                                |
           v                   v                 v                                v
    +----------------+    +----------------+   +----------------+             +----------------+
    | SubsystemA     |    | SubsystemB     |   | SubsystemC     |             | SubsystemD     |
    +----------------+    +----------------+   +----------------+             +----------------+
    | operationA()   |    | operationB()   |   | operationC()   |             | operationD()   |
    +----------------+    +----------------+   +----------------+             +----------------+


### Explanation:
Client interacts only with the Facade.
Facade provides a simplified interface, calling operations on multiple Subsystem classes as needed.