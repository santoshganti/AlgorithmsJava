package designpatterns.creationaldesignpatterns.prototype;

/**
 * Clone/ Cloneable
 *
 * Avoids keyword "new"
 * Although a copy, each instance unique
 * Costly construction not handled by the client
 * Can still utilize parameters for construction
 * Shallow or DeepCopy
 *
 *
 Prototype pattern refers to creating duplicate object while keeping performance in mind

 This pattern involves implementing a prototype interface which tells to create a clone
 of the current object. This pattern is used when creation of object directly is costly.

 For example, an object is to be created after a costly database operation. We can cache the object,
 returns its clone on next request and update the database as and when needed thus reducing
 database calls.

 */
public class Prototype {

}
