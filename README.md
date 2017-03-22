#Design Principles

- Identify the aspects of your application that vary and separate them from what stays the same. If you have an element of software that is changing then you know you have a behaviour that needs to be pulled out and separated from all the stuff that doesn't change. It needs to be encapsulated to allow for altering/extending.
- Program to an interface, not an implementation: Best to keep things flexible. This principle ensures behaviours of classes can be changed at run time.
- Favour composition over inheritance: Has-a relationships can be better than Is-a relationships.
- Strive for loosely coupled designs between objects that interact: they allow for more flexibility and minimise interdependence.
