package com.adobe.aem.guides.wknd.core.models.impl;



import java.util.Iterator;



import org.apache.sling.api.SlingHttpServletRequest;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;

import org.apache.sling.models.annotations.Model;

import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import com.adobe.aem.guides.wknd.core.models.ResolverServicemodel;

import com.adobe.aem.guides.wknd.core.services.ResolverService;
import com.day.cq.wcm.api.Page;



@Model(adaptables = SlingHttpServletRequest.class,

adapters = ResolverServicemodel.class,

defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ResolverServicemodelImpl implements ResolverServicemodel

{

  private static final Logger LOG = LoggerFactory.getLogger(ResolverServicemodelImpl.class);

 

  @OSGiService

  ResolverService resolverservice;



@Override

public Iterator<Page> getPageList() {

   

    return resolverservice.getPages();

}
}