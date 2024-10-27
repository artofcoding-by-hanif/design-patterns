### Composite Pattern

    ---------------------------------
    |        <<interface>>          |
    |           Graphic             |
    |--------------------------------|
    | + render(): void              |
    | + add(graphic: Graphic): void |
    | + remove(graphic: Graphic): void |
    | + getChild(index: int): Graphic|
    ---------------------------------
                    |
                    |
          ---------------------
          |                   |
    ---------------       --------------
    |   Circle    |       |  Square    |
    |-------------|       |------------|
    | + render()  |       | + render() |
    ---------------       --------------
    
                           |
                           |
                    ----------------
                    |   Drawing    |
                    ----------------
                    | + render()   |
                    | + add()      |
                    | + remove()   |
                    | + getChild() |
                    ----------------

### Explanation
- Graphic (Component): This interface declares render(), add(), remove(), and getChild() methods. render() will be used to display graphics, while add(), remove(), and getChild() manage child elements.
- Circle and Square (Leaf): These are leaf components implementing the Graphic interface. They implement render() to draw the shape.
- Drawing (Composite): This is the composite component. It can hold multiple Graphic components (both individual shapes and other Drawing objects). It implements add(), remove(), and getChild() methods to manage child components.