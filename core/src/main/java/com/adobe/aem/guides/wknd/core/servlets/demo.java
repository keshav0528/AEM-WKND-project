package com.adobe.aem.guides.wknd.core.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.jcr.Node;
import javax.jcr.Session;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = Servlet.class)
@SlingServletPaths("/bin/testsampleservlet")
public class demo extends SlingSafeMethodsServlet {

  private static final Logger log = LoggerFactory.getLogger(demo.class);
    // private ResourceResolver resourceResolver;

    // private Resource resource;

  private PrintWriter responseWriter;

  @Override
  protected void doGet(
    final SlingHttpServletRequest request,
    final SlingHttpServletResponse response
  )
    throws ServletException, IOException {
    try {
      log.info("Hello");
      response.getWriter().println("servlet run successfully....");

      response.setContentType("text/plain");

      ResourceResolver resourceResolver = request.getResourceResolver();

      //   resource = request.getResource();

      responseWriter = response.getWriter();

      Session session = resourceResolver.adaptTo(Session.class);
      Resource resource1 = resourceResolver.getResource(
        "/apps/wknd/components/samplecomp"
      );

      Node node1 = resource1.adaptTo(Node.class);

      node1.setProperty("property", "value");

      node1.getSession().save();
      node1.addNode("Nodesample");
      response.getWriter().println("node added..");
      write("Version 2018-Sept-07.1");

      write(resourceResolver.toString());

      write(resource1.toString());

      Node node = resource1.adaptTo(Node.class);

      node.setProperty("property", "value");
      node.setPrimaryType("Sampletype");
      node.getSession().save();

      write(node.toString());

      session.save();
      //resourceResolver.create(arg0, arg1, arg2)

    } catch (final Exception e) {
      write("ERROR: " + e.getMessage() + " , " + e.getClass());
    }
  }

  private void write(final String message) {
    if (responseWriter != null) {
      responseWriter.println("TestCreateNodeServlet: " + message);
    }
  }
}
