package com.adobe.aem.guides.wknd.core.sample;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.metatype.annotations.Option;


@ObjectClassDefinition(
		name = "Http Configuration", 
		description = "This configuration reads the values to make an HTTP call to a JSON webservice")
public @interface HttpConfiguration {

	
	@AttributeDefinition(
			name = "Enable config", 
			description = "This property indicates whether the configuration values will taken into account or not", 
			type = AttributeType.BOOLEAN)
	public boolean enableConfig();

	/**
	 * This method returns the protocol that is being used
	 * 
	 */
	@AttributeDefinition(
			name = "Protocol", 
			description = "Choose Protocol", 
			options = {
			@Option(label = "HTTP", value = "http"), @Option(label = "HTTPS", value = "https") })
	public String getProtocol();

	/**
	 * Returns the server
	 */
	@AttributeDefinition(
			name = "Server", 
			description = "Enter the server name")
	public String getServer();

	/**
	 * Returns the endpoint
	
	 */
	@AttributeDefinition(
			name = "Endpoint", 
			description = "Enter the endpoint")
	public String getEndpoint();
}