package Week3.thursday.afternoontask.extension
/*
Here def is used instead of val for the following reasons
 Flexibility in Implementation:
Using def allows the extending classes to provide their own implementation of the method.
This can be useful if the message needs to be computed dynamically.
Abstract Method:
Traits often use def to define abstract methods that must be implemented by the subclasses.
This ensures that any class extending the trait will provide a concrete implementation of the method.
Avoiding Field Initialization Issues:
When you define val in a trait, it forces all subclasses to initialize it immediately.
This can sometimes lead to initialization issues, especially if the value depends on constructor parameters of the subclass
   */
trait GenericPostageError {
  def message:String



}
