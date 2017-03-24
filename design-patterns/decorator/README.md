# Decorator

Decorator wraps objects in other objects through composition, and allows behaviour to be assigned to an individual object without affecting the behaviours of other objects from the same class.



Even though you may use decorator through subclassing, objects don't gain behaviours through inheritance but rather gain behaviours through composition. Another nice thing is that you can wrap decorators in other decorators, allowing for multiple levels of composition.



However, decorators can result in many small objects that can be difficult to maintain, and having multiple levels of composition can be confusing to look at. Another thing is that it can be difficult to use decorators if you rely on the base concrete type a lot (example would be a discount in an espresso object - the discount is only applied to that class and none of the decorators).
