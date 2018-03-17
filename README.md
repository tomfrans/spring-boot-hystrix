# spring-boot-hystrix

Spring boot application example with NetFlix Hystrix Circuit breaker

Below dependancies required

	 Web – REST Endpoints
	 Actuator – providing basic management URL
	 Hystrix – Enable Circuit Breaker
	 Hystrix Dashboard – Enable one Dashboard screen related to the Circuit Breaker monitoring
	
Enable the below property for /hystrix.stream endpoint to be able to access.

     management.endpoints.web.exposure.include=*
