# Singleton

Singleton ensures a class has only one instance and provides a global point of access to it.

basic structure

```java
public class Singleton{
  static uniqueInstance;

  static getUniquieInstance();
}
```

But beware of multithreading...

Either instantiate the object before to prevent more than one object being created, or use synchronized (high overhead for parallel heavy applications) or volatile. 
