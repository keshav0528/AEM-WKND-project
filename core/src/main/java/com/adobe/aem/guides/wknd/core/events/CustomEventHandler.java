package com.adobe.aem.guides.wknd.core.events;


import java.util.HashMap;
import java.util.Map;

import javax.jcr.LoginException;



import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.event.jobs.JobManager;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.granite.workflow.event.WorkflowEvent;
import com.day.cq.replication.ReplicationAction;


@Component(immediate = true, service = EventHandler.class, property = {
	Constants.SERVICE_DESCRIPTION + "= This event handler listens the events on page activation",
	EventConstants.EVENT_TOPIC + "=org/apache/sling/api/resource/Resource/ADDED",
	EventConstants.EVENT_FILTER + "=(path=/content/wknd/us/en/*)"

})
public class CustomEventHandler implements EventHandler {
	private static final Logger log = LoggerFactory.getLogger(CustomEventHandler.class);

	@Reference
	private ResourceResolverFactory resolverFactory;

	private ResourceResolver resolver;

	@Reference
	JobManager jobManager;

	@Override
	public void handleEvent(Event event) {

		log.info("***************************** these are logs***********************");
		log.info("Topic : {}",event.getTopic());
		String n[] = event.getPropertyNames();

		log.info("");
	  
		log.info("Event occurred: {}", event.getProperty(WorkflowEvent.EVENT_TYPE));
	  
		log.info("Event properties: ");
	  
		for(String s : n) {
	  
		 log.info(s + " = " + event.getProperty(s));
	  
		}
	  
	
	  
		ReplicationAction action = ReplicationAction.fromEvent(event);
	  
		if(action != null) {
	  
		 log.info("Replication action {} occured on {} ", action.getType().getName(), action.getPath());
	  
		}
	  
		log.info("");
	}

	private void getServiceResourceResolver() throws LoginException {
		Map<String, Object> params = new HashMap<>();
		params.put(ResourceResolverFactory.SUBSERVICE, "myEventService");
		try {
			resolver = resolverFactory.getServiceResourceResolver(params);
		} catch (org.apache.sling.api.resource.LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}