# Refactoring

Refactoring makes code understandable and easy to extend

## Bad Smells

Bad smells are common design problems. Bad design is normally unclear, complicated or duplicated.

* Duplicated Code (across many classes)
* Long Methods
* Complex Conditional Statements
* Primitive Obsession (Use objects when possible)
* Indecent Exposure
* Solution Sprawl
* Alternative Classes with Different Interfaces
* Lazy Classes
* Large Classes
* Switch Statements
* Combinatorial Explosions
* Oddball Solutions

## Types of Refactoring

### Creation Problems

Helps with creation problems. Situations include:

* Sometimes constructors are not descriptive enough
* You may want more than one constructor
* You may want more than one constructor with the same attribute or type requirements
* Creation methods allow for the creation of descriptive names, and you can have many different types of creation methods with the same attribute signatures
* Only difference is no 'new' keyword with creation methods.

#### Example 1

Lets say you have a class for a programmer in a recruitment agency. Programmers might have node experience, java experience, embedded system experience, or handlebars experience (and so on and so on). You might have the constructor:

```java
public Programmer(int nodeExperienceLevel, int javaExperienceLevel, int embeddedSystemsExperienceLevel, int handlebarsExperience){ // and so on
  this.nodeExperienceLevel = nodeExperienceLevel;
  this.javaExperienceLevel = javaExperienceLevel;
  this.embeddedSystemsExperienceLevel = embeddedSystemsExperienceLevel;
  this.handlebarsExperience = handlebarsExperience;
  // ....
}
```

However, it doesn't make sense for a back end developer to have embedded systems experience (strictly speaking). So a better solution could be a method that returns an appropriate Programmer object called backEndProgrammer that calls the above constructor:

```java
public static Programmer backEndProgrammer(int nodeExperienceLevel, int javaExperienceLevel){
  return new Programmer(nodeExperienceLevel, javaExperienceLevel, 0, 0);
}
```
#### Example 2

Another and similar problem might be duplicated constructors for different types of programmers - but instead of specialisations, you have incomplete information about them. A solution to this is to create a catch all constructor (like the first one above) and then constructors for each type that is missing:

```java
public Programmer(int nodeExperienceLevel, int javaExperienceLevel){
  this(nodeExperienceLevel, javaExperienceLevel, 0, 0);
}

public Programmer(int embeddedSystemsExperienceLevel, int handlebarsExperience){
  this(0, 0, embeddedSystemsExperienceLevel, handlebarsExperience);
}
```
