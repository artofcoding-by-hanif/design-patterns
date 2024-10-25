### Command Pattern

    +----------------+        +---------------------+        +----------------+
    |    Invoker     |        |    Command         |        |    Receiver    |
    |----------------| -----> |---------------------| -----> |----------------|
    | command        |        | execute()          |        | action()       |
    +----------------+        +---------------------+        +----------------+
                                ^                  ^
                                |                  |
                                +----------------+    +----------------+
                                | ConcreteCommand |   | ConcreteCommand |
                                +----------------+    +----------------+


### Explanation
##### Invoker: Holds and triggers a command.
##### Command: An interface defining the execute() method.
##### ConcreteCommand: Implements the Command interface and links the action to the receiver.
##### Receiver: Executes the actual action.