# Design Patterns

## Intro

This is a collection of design patterns in java taken from headfirst java (to begin with) and with my own examples added.

## Design Principles

* Identify the aspects of your application that vary and separate them from what stays the same. If you have an element of software that is changing then you know you have a behaviour that needs to be pulled out and separated from all the stuff that doesn't change. It needs to be encapsulated to allow for altering/extending.
* Program to an interface, not an implementation: Best to keep things flexible. This principle ensures behaviours of classes can be changed at run time.
* Favour composition over inheritance: Has-a relationships can be better than Is-a relationships.
* Strive for loosely coupled designs between objects that interact: they allow for more flexibility and minimise interdependence.
* Classes should be open for extension but closed for modification. This is usually done through abstract classes with specifics being defined in implementations. A key principle in the decorator class.
* Depend upon abstractions. Do not depend upon concrete classes. Also called dependency inversion. Guidelines: No variable should hold a reference to a concrete class. No class should derive from a concrete class. No method should override an implemented method of any of its base classes. A key principle in the factory pattern.

## Warnings about applying design patterns

* Design patterns are useful but they can have negative side effects. There is a danger in over-engineering a system and some things that should be simple can become horribly complex through applying design patterns.
