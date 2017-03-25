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

### Extracting methods

Used to turn code fragments into a method with a descriptive name. Code should be readable as comments. If you see code and think "what exactly is going on here?" - it probably means you should be extracting it to methods.

#### Example: moving repeated code to a function

Can be as simple as moving formatting to a method:

```java
public void doSomething(){

  int[] list = getNewList();
  System.out.println("------------------");
  System.out.println("time-dist-altitude");
  System.out.println("------------------");
  presentNewList(list);

  list = getNewList();
  System.out.println("------------------");
  System.out.println("time-dist-altitude");
  System.out.println("------------------");
  presentNewList(list);
}
```

can be turned into:

```java
public void doSomething(){

  int[] list = getNewList();
  printHeading();
  presentNewList(list);

  list = getNewList();
  printHeading()
  presentNewList(list);
}

public void printHeading(){
  System.out.println("------------------");
  System.out.println("time-dist-altitude");
  System.out.println("------------------");
}
```

Extracting to methods should always be logical however. For example, it doesn't make sense to break out a conditional operator statement into a function if it is just as clear whats happening.

### Using variables to write understandable code

If you have expressions that are quite complicated and can't easily be extracted to methods, you can save conditionals into variables. You might have a complex conditional situation like the below:

#### Example 1: Clarifying conditional statements

```java
if((amount > 60) || ((amount * unitCost) > 600)) {
  discount = .15;
} else if((amount > 40) || ((amount * unitCost) > 400)) {
  quantityDiscount = .10;
} else if((amount > 20) || ((quantity * unitCost) > 200)) {
  quantityDiscount = .07;
}
```

can be turned into the following:

```java
final boolean over60Units = (amount > 60) || ((amount * unitCost) > 600);
final boolean over40Units = (amount > 40) || ((amount * unitCost) > 400)
final boolean over20Units = (amount > 20) || ((quantity * unitCost) > 200);

if (over60Units){
  discount = .15;
} else if (over40Units){
  discount = .10;
} else if (over 20Units){
  discount = .07;
}
```
Note that final is indicated because it ensures it is evaluated only once per iteration.

#### Example 2: Making chained statements more readiable

Another example is when making a lot of calls to an object, it can look nicer to just use variables that explain what is going on.

```java
System.out.println("The total number of products: " + productList.getTotalProducts() + " and the discount total is: " + costs.getTotalDiscounts() + " , and the final profit is: " + costs.getTotalProfit());
```

We can make this print statement more readiable by changing it to:

```java
int totalProducts = productList.getTotalProducts();
double totalDiscount = costs.getTotalDiscounts();
double totalProfit = costs.getTotalProfit();

System.out.println("The total number of products: " + totalProducts + " and the discount total is: " + totalDiscount + " , and the final profit is: " + totalProfit);
```

#### Example 3: using descriptive names

```java
int temp = height * width; // temp should be called area
```
and:

```java
int totalWeight = weight1+weight2; // better name: combinedWeight
totalWeight = totalWeight - lostWeight1; // weightAfterWeightLoss
totalWeight = totalWeight / numOfPeople; // weightPerPerson
```

### Extracting to a class

If the class you are working in has some related variables that don't fit neatly into the class, you may want to extract this information into another class.

#### Example 1: locations

In the following class, the address information could be extracted to another class:

```java
public class Student {
  private String firstName;
  private String lastName;
  private String street;
  private String city;
  private String country;
  private String postalCode;
  private String birthday;
  //...
}
```

The address information could be extracted to an Address class and declared in the Student class:

```java
public class Address {
  private String street;
  private String city;
  private String country;
  private String postalCode;

  public Address(String street, String city, String country, String postalCode){
    this.street = street;
    this.city = city;
    this.country = country;
    this.postalCode = postalCode;
  }
}

public class Student {
  private String firstName;
  private String lastName;
  private Address address;
  private String birthday;
}
```

And then declared in a constructor or setter method as something like:

```java
Student james = new Student("James", "Doe", new Address("123 fake street, Springfield, USA, 1234"), "05/06/07");
```
