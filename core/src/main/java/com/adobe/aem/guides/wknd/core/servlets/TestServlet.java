package com.adobe.aem.guides.wknd.core.servlets;

import java.io.IOException;

// import javax.jcr.Node;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
// import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
// import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;

// import com.adobe.aem.guides.wknd.core.Logger.sevletLoger;
import com.day.cq.commons.jcr.JcrConstants;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//OSGI Declarative Service Annotation
@Component(
    
		service={Servlet.class}
		
         
)
@SlingServletPaths("/bin/trainingproject/testservlet")
@SlingServletResourceTypes(
    resourceTypes="Sample/components/samplecontainer",
    methods = HttpConstants.METHOD_GET,
    extensions = "json"
    
)

public class TestServlet  extends SlingSafeMethodsServlet {
    private static final long serialVersionUID = 1L;
	private static final Logger log = LoggerFactory.getLogger(TestServlet.class);
	@Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
		log.info("Hello");
		// ResourceResolver resolver = request.getResourceResolver();
		Resource sampleResource2 =request.getResource();
		response.setContentType("text/plain");
		response.getWriter().write("Title = " + sampleResource2.getValueMap().get(JcrConstants.JCR_TITLE));
		// Resource sampleResource =resolver.getResource("/apps/components/samplecontainer");
		
		// Node sampleNode= sampleResource.adaptTo(Node.class);
		// sampleNode.set

		
    	response.setHeader("Content-Type", "text/html");
    	// response.getWriter().print("<h1>Sling Servlet Called</h1>"); 
    	// response.getWriter().close();
    }   
}

