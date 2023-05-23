package com.adobe.aem.guides.wknd.core.servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.jcr.Session;
import javax.servlet.Servlet;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
// import org.osgi.service.component.annotations.Reference;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

import com.day.cq.search.PredicateGroup;
import com.day.cq.search.Query;
import com.day.cq.search.QueryBuilder;
import com.day.cq.search.result.Hit;
import com.day.cq.search.result.SearchResult;


import com.day.cq.wcm.api.Page;




import javax.jcr.RepositoryException;

import org.apache.sling.api.resource.Resource;


/**
 
 * 
 * This servlet uses the QueryBuilder API to fetch the results from the JCR
 */
@Component(service = Servlet.class, property = { Constants.SERVICE_DESCRIPTION + "=Query Builder servlet",
		"sling.servlet.methods=" + HttpConstants.METHOD_GET, "sling.servlet.paths=" + "/bin/query" })
public class QueryBuilderServlet extends SlingSafeMethodsServlet {

	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException {

		// response.getWriter().write("HEllo ");

		ResourceResolver resourceResolver = request.getResourceResolver();

		Session session = resourceResolver.adaptTo(Session.class);
        QueryBuilder queryBuilder = resourceResolver.adaptTo(QueryBuilder.class);


        Map<String, String> predicate = new HashMap<>();
        predicate.put("path", "/content/wknd/us/en");
        predicate.put("type", "cq:Page");
		predicate.put("p.limit", "20");
        Query query = null;
        try {
            query = queryBuilder.createQuery(PredicateGroup.create(predicate), session);
        } catch (Exception e) {
           
        }
        SearchResult searchResult = query.getResult();

        for (Hit hit : searchResult.getHits()) {
            String path = null;
            try {
                
                path = hit.getPath();
                Resource articlResource = resourceResolver.getResource(path);
                Page articlPage = articlResource.adaptTo(Page.class);
                String title = articlPage.getTitle();
                // String description = articlPage.getDescription();
				response.getWriter().write("Title: " + title + "  path: " + path +"\n");
                
                // LOGGER.debug("" + description + " " + title);
            } catch (RepositoryException e) {
                throw new RuntimeException(e);
            }
        }


	}

}