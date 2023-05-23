// package com.adobe.aem.guides.wknd.core.workflows;



// // import org.apache.sling.api.resource.ResourceResolver;
// import java.util.Arrays;

// import org.apache.commons.lang3.StringUtils;
// import org.osgi.service.component.annotations.Component;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

// import com.adobe.granite.workflow.WorkflowException;
// import com.adobe.granite.workflow.WorkflowSession;
// import com.adobe.granite.workflow.exec.WorkItem;
// import com.adobe.granite.workflow.exec.WorkflowProcess;
// import com.adobe.granite.workflow.metadata.MetaDataMap;

// @Component(service = WorkflowProcess.class, property = { "process.label=" + "Process Step Example" })
// public class SampleWorkflow implements WorkflowProcess{
   
//     private static final Logger log = LoggerFactory.getLogger(SampleWorkflow.class);
//     @Override
//     public void execute(WorkItem workItem, WorkflowSession workflowSession, MetaDataMap metaDataMap)
//     throws WorkflowException {
//         // TODO Auto-generated method stub
//         //  ResourceResolver resourceResolver=null;
//         String payloadType = workItem.getWorkflowData().getPayloadType();
         

//          if (StringUtils.equals(payloadType, "JCR_PATH")) {
//             log.info("Payload type: {}", payloadType);
//             // Get the JCR path from the payload
//             String path = workItem.getWorkflowData().getPayload().toString();
//             log.info("Payload path: {}", path);
//            }
         
//            // Get workflow process arguments
//            String[] processArguments = metaDataMap.get("PROCESS_ARGS", "Default").split(",");
//            log.info("Process args: {}", Arrays.toString(processArguments));
//           }

    
// }

