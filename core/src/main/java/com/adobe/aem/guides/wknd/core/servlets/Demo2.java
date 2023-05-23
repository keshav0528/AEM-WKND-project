package com.adobe.aem.guides.wknd.core.servlets;


import java.util.Iterator;

import javax.servlet.Servlet;


import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.sling.api.servlets.HttpConstants;
@Component(immediate = true,
service = Servlet.class

)
@SlingServletResourceTypes(
  resourceTypes = "wknd/components/SampleCompConatiner",
  methods = HttpConstants.METHOD_GET,
  extensions = "txt"
)
public class Demo2 extends SlingSafeMethodsServlet {
    private static final long serialVersionUID = 1L;
	private static final Logger LOG = LoggerFactory.getLogger(Demo2.class);

	private static final String PCC_FORM_PATH = "";
	private static final String PCC_CODE = "pccCode";
	private static final String EXPIRY_DATE = "expiryDate";
	private static final String DEFAULT_END_DATE = "10/13/2021";
	private static final String NEW_END_DATE = "11/14/2021";
	private static final String DATE_NEED_TO_CHANGE = "11/12/2021";


	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) {
		ResourceResolver resourceResolver = request.getResourceResolver();
		LOG.debug("/bin/updatePccCodesDate start executing.");
		try {
			Resource resource = resourceResolver.getResource(PCC_FORM_PATH);
			if(resource != null) {
				Iterator<Resource> iterator = resource.listChildren();
				while (iterator.hasNext()) {
					Resource pccNode = iterator.next();
					ModifiableValueMap valueMap = pccNode.adaptTo(ModifiableValueMap.class);
					if (valueMap != null) {
						if (valueMap.containsKey(EXPIRY_DATE)) {
							valueMap.replace(EXPIRY_DATE, DATE_NEED_TO_CHANGE, NEW_END_DATE);
							LOG.info("Expiry date replaced in "+valueMap.get(PCC_CODE) +" : " +DATE_NEED_TO_CHANGE +" to " +NEW_END_DATE);
						}
						else {
							valueMap.putIfAbsent(EXPIRY_DATE,DEFAULT_END_DATE);
							LOG.info("Expiry date set to "+ valueMap.get(PCC_CODE) +" : "+DEFAULT_END_DATE);
						}
					}
				}
				resource.getResourceResolver().commit();
			}
			response.setStatus(200);

		} catch (Exception e) {
			LOG.error("error while reading the pcc list {}", e);
		}

	}
}
