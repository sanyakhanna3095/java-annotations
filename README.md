# Annotations
- tag that represents the metadata added to Java code (i.e. attached with class, interface, methods or fields) to indicate some additional information which can be used by java compiler and JVM  
- do not directly affect program execution
- processed by:
  - Compilers (e.g., @Override for compile-time checks).
  - Runtime environments (e.g., JUnit’s @Test for test execution).
  - Frameworks (e.g., Spring’s @Autowired for dependency injection).


### Syntax:
@AnnotationName(attributes)  
public void myMethod() { ... }


## Why?
- Declarative Programming: Define what the code should do, not how.
- Reduce Boilerplate: Automate repetitive tasks (e.g., serialization).
- Framework Integration: Enable behavior in tools like Spring, Hibernate, or JUnit.
