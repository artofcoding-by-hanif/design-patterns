    +----------------+        +----------------+        +----------------+
    |    Subject     |        |    Observer    |        | ConcreteObserver|
    +----------------+        +----------------+        +----------------+
    | - observers[]  |        | + update()     |<-------| + update()      |
    | + attach()     |        +----------------+        | + display()     |
    | + detach()     |                                   +----------------+
    | + notify()     |                                       ^
    +----------------+                                       |
    ^                                                        |
    |                                                        |
    +--------------------+                                   |
    |  ConcreteSubject   |-----------------------------------+
    +--------------------+
    | - state            |
    | + getState()       |
    | + setState()       |
    +--------------------+

### Key Participants in the Observer Pattern:
#### Subject:
Maintains a list of observers.
Provides methods to attach/detach observers.
Notifies observers of state changes.
#### Observer:
Defines an interface for receiving updates from the Subject.
#### ConcreteSubject:
Stores the state of interest to ConcreteObservers.
Implements methods to notify observers of changes.
#### ConcreteObserver:
Implements the Observer interface and updates itself when notified.