**<u>SOLID PRINCIPLES</u>**

My project was centered around “lamborghinistore.com”.  
  
The set of Classes and interfaces chosen for implementing SOLID
Principles are as given below:-

-   Address

-   AddressBook

-   Product

-   AddressRepositoryServices

-   CartServices

-   DeliveryServices

-   InternationalAddress

-   WishlistServices

-   AddressRepository (Interface)

-   CartOperations (Interface)

-   WishlistOperations (Interface)


<br/>
<br/>
<br/>

<u>Single Responsibility Principle (SRP)</u>

**Statement: -** The single responsibility principle (SRP) states that
Every module (such as a class, function, or microservice) should have
one and only one reason to change.

-   Product: Represents a product with its name.

-   Address: Represents a general address with its components.

-   AddressRepository: Defines operations for managing addresses
    (adding, retrieving).

-   CartOperations: Defines operations for managing a cart (adding
    items).

-   WishlistOperations: Defines operations for managing a wishlist
    (adding items).

-   AddressRepositoryServices: Implements the address repository
    functionality using a list.

-   CartServices: Implements cart operations (adding to cart).

-   WishlistServices: Implements wishlist operations (adding to
    wishlist).

-   DeliveryAddress: Extends Address to add delivery instructions.

-   InternationalAddress: Extends Address to add a country code and
    specialized validation.

<br/>
<br/>
<br/>

<u>Open - Closed Principle (OCP)</u>

**Statement: -** Classes should be Open for Extension but Closed for
modification.

-   AddressRepository - It defines an interface for managing addresses,
    allowing different implementations without modifying client code.

-   Address - It's designed for extension through inheritance.

-   CartOperations - They define interfaces for cart operations,
    enabling different implementations and future extensions.

-   CartOperations and WishlistOperations - They define interfaces for
    wishlist operations, enabling different implementations and future
    extensions.

-   AddressBook - It depends on the AddressRepository interface,
    allowing address storage to be swapped without changing AddressBook
    itself.

<br/>
<br/>
<br/>

<u>Liskov's Substitution Principle (LSP)</u>

**Statement: -** Objects of a superclass should be replaceable with
objects of its subclasses without altering the correctness of any
program that uses objects of that superclass.

-   Address, DeliveryAddress, InternationalAddress:

 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;They inherit the validateAddress() method without altering its
behavior.

 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;They introduce new fields and methods, but they don't change the
expected functionality of the base class.

 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;We can substitute any of these subclasses for an Address object
without unexpected issues.

<br/>
<br/>
<br/>

<u>Interface Segregation Principle (ISP)</u>

**Statement: - N**o code should be forced to depend on methods it does
not use.

-   AddressRepository interface - It has a focused set of methods
    (addAddress, getAllAddresses) related to address management. Classes
    implementing it only need to implement these specific methods.

-   CartOperations interface - It has a single method (addToCart),
    ensuring classes only depend on cart-related functionality.

-   WishlistOperations interface- It has a single method
    (addToWishlist), ensuring classes only depend on wishlist-related
    functionality.

<br/>
<br/>
<br/>

<u>Dependency Inversion Principle (DIP)</u>

**Statement: -** High-level modules should not depend on low-level
modules. Both should depend on abstractions.

-   AddressRepository: Defined for interacting with
    AddressRepositoryServices class, resulting in abstraction and
    flexibility.

-   CartOperations: Represents operations for CartServices class,
    enabling code to work with different cart implementations.

-   WishlistOperations: Represents WishlistServices class, allowing for
    switching of wishlist implementations.
