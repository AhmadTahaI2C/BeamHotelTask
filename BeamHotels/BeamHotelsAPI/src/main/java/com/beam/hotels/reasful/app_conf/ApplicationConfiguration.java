/**
 * 
 */
package com.beam.hotels.reasful.app_conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring boot engine :) .
 * 
 * @author aabdelraouf
 *
 */
@SpringBootApplication(scanBasePackages = { "com.beam.hotels" })
public class ApplicationConfiguration {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfiguration.class, args);
	}
}
