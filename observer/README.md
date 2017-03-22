The observer pattern defines a one to many relationship between objects where a state change in one object results in all its dependants being notified and updated automatically.

Data can be sent in an efficient manner and no modification is required to the subject to add new observers. You can also add and remove them at any time.

However, Java's built in Observer class breaks the 'program to an interface' design principle, and forces you to subclass all your classes. You can easily make your own version of the pattern however.
