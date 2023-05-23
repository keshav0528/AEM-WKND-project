package com.adobe.aem.guides.wknd.core.events;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import com.day.cq.workflow.event.WorkflowEvent;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.day.cq.replication.ReplicationAction;
import com.day.cq.replication.ReplicationActionType;



 @Component(immediate = true, service = EventHandler.class, property = {
	// Constants.SERVICE_DESCRIPTION + "= This event handler listens the events on page activation",

    EventConstants.EVENT_TOPIC + "=" + ReplicationAction.EVENT_TOPIC,

    // EventConstants.BUNDLE + "org.osgi.service.event.EventHandler",
	EventConstants.EVENT_FILTER + "=(path=/content/wknd/us/en/*)"
    

})

public class SampleEventHandler implements EventHandler  {
    
    private static final Logger log = LoggerFactory.getLogger(SampleEventHandler.class);

    
	

	@Override
	public void handleEvent(Event event) {

		log.info("***************************** these are logs***********************");
		log.info("Topic : {}",event.getTopic());

        try{
            log.info("Topic : {}",event.getTopic());
           
            if (ReplicationAction.fromEvent(event).getType().equals(ReplicationActionType.ACTIVATE))
            {
                log.info(" Page Published : {}", ReplicationAction.fromEvent(event).getPath());
                log.info("***************************** Page Is Activated***********************");
            }
            if (ReplicationAction.fromEvent(event).getType().equals(ReplicationActionType.DEACTIVATE))
            {
                log.info(" Page DeActivate : {}", ReplicationAction.fromEvent(event).getPath());
                log.info("***************************** Page Is DeActivated***********************");
            }
            
        }
        catch(Exception e){
            log.error(" Error in preforming ", e.getMessage());
        }
		// String n[] = event.getPropertyNames();

		// log.info("");
	  
		// log.info("Event occurred: {}", event.getProperty(WorkflowEvent.EVENT_TYPE));
	  
		// log.info("Event properties: ");
	  
		// for(String s : n) {
	  
		//  log.info(s + " = " + event.getProperty(s));
	  
		}
    }
	  