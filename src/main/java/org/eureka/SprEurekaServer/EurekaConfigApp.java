package org.eureka.SprEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaConfigApp 
{
	public static void main(String[] args) {
        SpringApplication.run(EurekaConfigApp.class, args);
    }
	
	/* assembly:assembly
	 * 
	 * --spring.profiles.active=peer1 
	 * --server.port=8084
	 * 
	 * 
	 * java -jar SprEurekaServer-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1  
       java -jar SprEurekaServer-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2
	 * */
}
