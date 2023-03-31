# Builder Pattern

In Java, two commonly used inbuilt builder design patterns are the *StringBuilder* and *URLBuilder*

## Advantages of the Builder Pattern:

1) Encapsulates complex object creation: The Builder pattern separates the complex object creation process from the rest of the code, making it easier to maintain and modify.

2) Provides control over the object creation process: The Builder pattern allows developers to control the object creation process by providing a step-by-step construction process.

3) Supports object creation with default and optional values: The Builder pattern allows for the creation of objects with default values for attributes that are not specified during object creation. It also supports optional values that can be added as needed.

4) Improves code readability: The Builder pattern makes code more readable and understandable by providing a clear, fluent interface for object creation.

5) Facilitates future extensions: The Builder pattern allows for the addition of new attributes to an object without affecting existing code.

## Disadvantages of the Builder Pattern:

1) Increases code complexity

2) Requires additional code

3) Can be overkill for simple object creation: The Builder pattern is best suited for complex object creation processes. For simpler object creation processes, it may be unnecessary and add unnecessary complexity to the code.

4) Can be harder to debug: Because the object creation process is separated into multiple steps, debugging can be more challenging.