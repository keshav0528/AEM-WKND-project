package com.adobe.aem.guides.wknd.core.servlets;

import java.io.IOException;

import javax.jcr.Node;

import javax.jcr.Session;

import javax.servlet.Servlet;

import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;

import org.apache.sling.api.SlingHttpServletResponse;

import org.apache.sling.api.resource.ResourceResolver;

import org.apache.sling.api.resource.ResourceResolverFactory;

import org.apache.sling.api.servlets.HttpConstants;

import org.apache.sling.api.servlets.SlingAllMethodsServlet;

import org.apache.sling.api.servlets.SlingSafeMethodsServlet;

import org.osgi.framework.Constants;

import org.osgi.service.component.annotations.Component;

import org.osgi.service.component.annotations.Reference;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import com.day.cq.wcm.api.Page;

import com.day.cq.wcm.api.PageManager;

@Component(service = Servlet.class, property = { Constants.SERVICE_DESCRIPTION + "=Leadership servlet",

                "sling.servlet.methods=" +

                                HttpConstants.METHOD_GET,

                "sling.servlet.paths=" + "/bin/demo/pagecreate" })

public class CreatePageServlet extends SlingAllMethodsServlet {

        private static final long serialVersionUID = -1315366566565122983L;

        // private static final String PAGE_TEMPLATE =

        // "/conf/wknd/settings/wcm/templates/page-content";

        // private static final String RENDERER = "wknd/components/structure/page";

        @Reference

        ResourceResolverFactory resolverFactory;

        ResourceResolver resourceResolver;

        // private String pageName;

        // private String pageTitle;

        // private String path = "/content/wknd/us/en";

        // private Page prodPage = null;

        Session session;

        private static final Logger log = LoggerFactory.getLogger(CreatePageServlet.class);

        @Override

        protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)

                        throws ServletException, IOException {

                try {

                        log.info("----------< Executing Query Builder Servlet >----------");

                        String pageName = "samplePage";

                        String pageTitle = "Sample Page";

                        String path = "/content/wknd/us/en";

                        String template = "/conf/wknd/settings/wcm/templates/page-content";

                        String renderer = "wknd/components/page";

                        Page prodPage = null;

                        response.getWriter().write("hello");

                        resourceResolver = request.getResourceResolver();

                        session = resourceResolver.adaptTo(Session.class);

                        try {

                                if (session != null) {

                                        // Create Page

                                        PageManager pageManager = this.resourceResolver.adaptTo(PageManager.class);

                                        prodPage = pageManager.create(path, pageName, template, pageTitle);

                                        Node pageNode = prodPage.adaptTo(Node.class);

                                        Node jcrNode = null;

                                        if (prodPage.hasContent()) {

                                                jcrNode = prodPage.getContentResource().adaptTo(Node.class);

                                        } else {

                                                jcrNode = pageNode.addNode("jcr:content", "cq:PageContent");

                                        }

                                        jcrNode.setProperty("sling:resourceType", renderer);

                                        Node parNode = jcrNode.addNode("par");

                                        parNode.setProperty("sling:resourceType", "foundation/components/parsys");

                                        Node textNode = parNode.addNode("text");

                                        textNode.setProperty("sling:resourceType", "foundation/components/text");

                                        textNode.setProperty("textIsRich", "true");

                                        textNode.setProperty("text", "Test page");

                                }

                        } catch (Exception e) {

                                log.error(e.getMessage(), e);

                        }

                } catch (Exception e) {

                        log.error(e.getMessage(), e);

                }

        }

}