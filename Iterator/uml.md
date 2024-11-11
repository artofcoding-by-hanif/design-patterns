### Iterator Pattern

    +------------------+            +-----------------------+
    |   Aggregate      |            |      Iterator         |
    |------------------|            |-----------------------|
    | + createIterator(): Iterator  |  + hasNext(): boolean |
    |                               |  + next(): Object      |
    +------------------+            +-----------------------+
                |                            ^
                |                            |
                v                            |
    +------------------+            +-----------------------+
    | ConcreteAggregate|            |   ConcreteIterator    |
    |------------------|            |-----------------------|
    | + createIterator(): Iterator  | - collection: Aggregate
    |                               | - currentPosition: int |
    +------------------+            +-----------------------+


#### Key Participants in the Iterator Pattern
* Iterator Interface: Defines methods to access and traverse elements.
* Concrete Iterator: Implements the Iterator interface and keeps track of the current position in the traversal.
* Aggregate Interface: Defines a method to create an iterator.
* Concrete Aggregate (Collection): Implements the aggregate interface and creates an instance of the appropriate concrete iterator.