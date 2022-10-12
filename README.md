# test-springboot-starter

Simple repo to verify [issue](https://stackoverflow.com/q/74024937/12973717) from stackoverflow.

What it verifies:

1. We can set properties from starter.
2. Then in Springboot project we use the starter, we can have the properties or override if we need.

Notice:

1. We can't have two properties file with same name.
2. Because of notice 1, we should name our properties something other than application.properties.<br> So the project that use our starter can have their properties name application.properties without mistakes.


How to use and verify:

1. Download this custom starter repo and run 
    ```
    mvn clean install
    ```
   
2. Inside another repo's pom.xml

    ```
    <dependency>
       <groupId>gary.springframework</groupId>
          <artifactId>gary-custom-starter</artifactId>
          <version>0.0.1-SNAPSHOT</version>
    <dependency>
    ```

3. Include below code inside your repo , and let your application at least execute function tryGreet() it once.
    Watch logs from console, and see what you get.

    ```
    @Value("${gary.name}")
   private String myName;
   
   @Autowired
   private Greeter greeter;
   
    public void tryGreet() {
        System.out.println("Your name is : " + myName);
        System.out.println(greeter.greet());
   }
    ```

4. If you want override the value we set in starter, in your application.properties file.
    ```
    gary.name=NAME-YOU-WANT
    ```
    Restart your application again and see what you get from console.
