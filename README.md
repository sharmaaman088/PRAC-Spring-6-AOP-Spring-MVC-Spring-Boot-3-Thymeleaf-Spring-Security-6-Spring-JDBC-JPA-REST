@Configuration This means the class contains methods that define beans (components) for a Spring application.
@Configuration is like a recipe book that tells how to prepare different dishes.
The methods inside the class (annotated with @Bean) are like individual recipes.
Spring reads this recipe book and prepares the required beans (ingredients/components) for the application.

@configuration 
class has bean annotation method 


@Configuration → Marks a class as a Spring configuration.
@Bean → Defines a Spring-managed object.
Spring scans this class and creates beans for use in the application.
Spring sees @Configuration → It knows this class contains beans.
@Configuration is an annotation used to indicate that a class contains bean definitions and is a source of configuration for the application context.






@Component - Another way to declare a bean is to mark a class with a @Component annotation. Doing this turns the class into a Spring bean at the auto-scan time.

@Autowired as an automatic plug that connects parts of your code without you manually creating objects.Imagine a lamp that needs electricity to work. Normally, you would:

    Find a power source (electricity).
    Manually plug in the lamp.

With @Autowired, it's like the lamp automatically connects to electricity without you doing anything!
