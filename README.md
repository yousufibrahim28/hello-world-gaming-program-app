# hello-world-gaming-program-app
hello-world-gaming-program-app with Spring tutorials



**Spring and Spring Boot course notes**

Active learning - Think and take notes

Review the presentation once in a while

Some Spring Terminology

Tight Coupling

Loose Coupling

Dependency Injection 

IOC Container

Application Context

Spring Beans

Auto Wiring

Component Scan

Java spring and spring boot can be used to create wide variety of applications

- Web
- Rest Api
- Full Stack
- Microservices

Approach : Building Loose Coupled Hello World Gaming program App with Modern Spring Approach in Iterative approach

Iteration 1 : Tightly Coupled Java code

- Game runner Class

- Game classes :  Mario, SuperContra, Pacman etc.

Iteration 2 : Loose Coupling - Interfaces

- GameRunner class
- GamingConsole interface
    - Game classes :  Mario, SuperContra, Pacman etc.

Iteration 3 : Loose Coupling - Spring Level 1
    - Spring Beans
    - Spring framework will manage objects and wiring

Iteration 4 : Loose Coupling - Spring level 2
- Spring Annotations
- Spring framework will create, manage & auto-wire objects


Start..spring.io - Project/Package created 

Note : Do not use Spring Snapshot version, they are unstable

Group id = Package name

Artifact id. - Classes


Coupling:  it is the measure of how much work to do to make a change


Spring Container/IOC Container/Spring Context: manages Spring beans and their life cycle.

- Bean factory: Basic Spring Container
- Application context:  Advanced Spring Container with enterprise-specific features
    - Easy to use in web Applications
    - Easy internationalisation
    - Easy integration with Spring AOP - Aspect Oriented Programming

Java Bean Vs Spring Bean

- Java Bean - EJB - should have a no args constructer, have getters and setters, implements serialisable
- Pojo - Plain old java objects
- Spring Beans - Anything managed by Spring framework is called a Spring Bean

List all beans managed by Spring
- Context.getbean definition name
- 



Dependency Injection in Spring can be done in three ways

- Constructor based - Dependencies are set by creating the bean using its constructor
- Setter based - Dependencies are set by calling setter methods on your beans
- Field based  - No setter or Constructor Dependencies are injected using reflection

For Construction injector @Automiwred is not required. Spring automatically identifies the dependency using the @component annotation and matches the Dependency. This is the recommended approach by the spring team since all initialization can be done in one method.

Important Keywords in Spring so far now.

@component - Used on class

@bean - used on a method

Dependency 

Component Scan

Dependency Injection - identify beams and their dependencies and wire them together

Spring beans

IoC container - Manages spring beans

Autowire - Wires the bean object wherever it is referenced., Process of wiring dependencies for spring beans

@bean is used to instantiate 3 party libraries

@bean is preferred when we need to do any custom logic.

Next Section topics

1. Lazy Initialisation
2. Bean Scopes - Singleton and prototype
3. PostConstruct & PreDestroy
4. Jakarta EE
5. Contexts & Dependency Injection
6. XML Configuration
7. Alternatives - @component
8. Spring Big Picture
9. Spring Modules & projects
10. Why is Spring Popular?


Default Initialization for spring beans is Eager
Eager initialization is recommended:
- Errors in the configuration are discovered immediately at 
application startup,  If lazy initialization used the errors will become runtime
- In Eager initialisation errors will prevent application from startup.


However, you can configure beans to be lazily initialized
usign Lazy annotation:
- Not recommended and Not frequently used

Lazy annotation:
 - can be used almost everywhere @component and @Bean are used
 - Lazy-resolution proxy will be injected instead of actual dependency
 - can be used on Configuration (@Configuration) class
 - All @Bean methods within the @Configuration will be lazily initialized
 - Bean initialized when it is first made use of in the application
 - Memory usage might be little less
 - Recomended for bean very rarely used in the app


/*
* By Default Beans in spring are singleton
* If using Prototype, Bean will create new objects each time we request
*
* Singleton scope - One object instance per Spring IOC container
* Prototype scope - Possibly many object instances per Spring IoC container
*
* Scopes applicable Only for web-aware Spring ApplicationContext
*   Request - one object instance per single HTTP request
*   session - one object instance per user HTTP session
*   Application  - One object instance per web application runtime
*   Websocket - One Object instance per WebSocket instance
*
* Java Singleton vs Spring Singleton
*   Spring Singleton : One Object instance per Spring IoC container
*   Java Singleton : One Object instance per JVM
*   Spring singleton is equal to Java singleton if only in Spring container is used per JVM (Mostly the case)
*
*
* Difference between
*
* Prototype - Many instances per Spring IOC Container, New bean instance created every time the bean is referred to,
*             Not Default, @Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE), Rarely used, Recommended to be used,
*             in the scenario where you need stateful beans
*
* and
*
* Singleton - One Instance per Spring IOC Container, Same bean instance reused, Default, 
*             @Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON), Very frequently used, Recommended to be used,
*             in the scenario where you need stateless beans
*
*
*
* */


// Immediately called after all the dependencies are wired
@PostConstruct

// Called before the spring bean is destroyed
@PreDestroy

Jakarta EE vs J2EE vs Java EE

J2EE evolution into Java EE and Java EE evolution into Jakarta EE

All are just specifications and mostly mean the same.

Examples of specifications are, JPA, JSP, JSTL, JAX-RS(Restful web services), Jakarta CDI

Jakarta is the latest version managed by Eclipse foundation, supported in Spring 6 and Spring Boot 3
- That’s why we use Jakarta. Packages instead of Java. Packages.

// Nowadays XML Configuration is rarely used, but we should know this because lot of old projects use xml configs
// Annotations are preferred and easy to use, easy to maintain, recent projects use annotations frequently,
// debugging is a bit difficult you should have good grasp of Spring
// xml configs are cumbersome, has complicated syntax, but using xml configs, POJOs can be clean of annotation,
// nowadays rarely used, we can use either annotation or xml configs, no mixing, should consistent, 
// debugging is of medium difficulty


@Component specialisation - which are variants of @Component

- @Service - Indicates that an annotated class has business logic
- @Controller -  Indicates that an annotated class is a “Controller” eg. web controller
    - Used to define controllers in your web applications and REST API
- @Repository - Indicates that an annotated class is used to retrieve and/or manipulate data in a data base

Use the most specific annotation, by doing so we are giving more information to the framework about your intentions

We can use Aspect Oriented Programming AOP, to introduce new behaviours based on the annotation, eg. for @Repository, Spring automatically wires in JDBC Exception translation features


Spring Framework -  contains multiple Spring Modules
- Fundamental Features:  core (IOC Container, Dependency injection, Auto wiring,..)
- Web: Spring MVC module for Web applications and REST API
- Web Reactive: Spring WebFlux etc.
- Data Access: Spring JDBS., JPA etc.
- Integration: JMS etc
- Testing: Mock Objects, Spring MVC Test etc.

Each application can choose modules they want to make use of

They do not need to make use of everything in the Spring framework.

Spring Projects

- Application architectures evolve continuously
- Web>REST API>Microservice>Cloud>…
- Spring evolves through Spring Projects:
- First Project: Spring Framework
- Spring Security: Secure your web applications or the Rest API
- Spring Data: Integrate the same way with different types of databases: NoSQL and Relational
- Spring Integration: Address challenges with integration with other applications
- Spring Boot: Popular framework to build Microservices
- Spring Cloud: Build cloud-native applications

Why is Spring Ecosystem popular?
- Makes it easy to build loosely coupled applications
- Make writing unit tests easy (Spring Unit Testing)
Reduced boilerplate code:  focus on business logic
- Example: No Need for Exception handling in each method!
    - All checked exceptions are converted to Runtime or Unchecked Exceptions
Architectural Flexibility:  Spring Modules and Projects
- You can pick and choose which ones to use(You DON’t need to use all of them)
Evolution with time : Microservices and cloud
- Spring Boot, Spring Cloud etc!




