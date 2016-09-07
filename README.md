# AOPDemo
<b> Spring AOP and AspectJ Demo using Annotations </b>

In this example, we will see how to configure the Spring AOP and AspectJ in order to use the Aspect Oriented Programming.
<br>

I have used the Annotations to refer to the Java components such as @Component in the Java beans, @Service at the Service layer.
As this is for demo, I have not implemented the @Repository since it is not required here, but will use in complete example. 
Please note that the "@Service" and "@Repository"  extends the "@Component" interface (annotation) so that when we use 
Spring's "context:component-scan", these objects are also available for Spring's application context.
<br>

The pom.xml has references to AspectJ related artifacts and Spring-aop related artifacts. The important artifacts are: <br> <b>
aspectjrt.jar <br>
aspectjweaver.jar <br>
aspectjtools.jar <br>
spring-aop.jar <br>
</b> <br>

The "applicationContext.xml" refers to "<context:component-scan>" tag in order to refer to the base package for componet scanning.
Also, <b> &lt;aop:aspectj-autoproxy proxy-target-class="true"/ &gt; </b>
enables the Spring framework to look for AOP annotations automatically and handle them. <b> proxy-target-class="true"> </b> plays an important role
to enable the Spring AOP features.
<br>

We will see another demo on how to use xml based AOP. 
<br> <br>

<b> Thank you. <br> 
Subhani</b>
