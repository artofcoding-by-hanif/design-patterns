## Memento Pattern    


    +----------------+          +----------------+          +-------------------+
    |   Originator   |          |    Memento     |          |   Caretaker       |
    +----------------+          +----------------+          +-------------------+
    | - state: String|<>------->| - state: String|          | - memento: Memento|
    | + setState()   |          | + getState()   |          | + saveState()     |
    | + getState()   |          |                |          | + restoreState()  |
    | + saveState()  |          |                |          |                   |
    | + restoreState()|         |                |          |                   |
    +----------------+          +----------------+          +-------------------+


### Key Participants in the Memento Pattern:
- Originator: The object whose state needs to be saved or restored.
- Memento: A snapshot of the Originator's state. It contains the state information but does not allow access to it by any class other than the Originator.
- Caretaker: Responsible for keeping the Memento. It doesn't modify or inspect the Memento's content.