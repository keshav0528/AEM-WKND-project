/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.wknd.components.puma_slideshow;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class puma_slideshow__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.PumaCaroucel.class.getName(), obj());
out.write("<div id=\"carouselExampleCaptions\" class=\"carousel slide\" data-bs-ride=\"false\">\r\n    <div class=\"carousel-indicators\">\r\n      <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\r\n      <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\r\n      <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\r\n    </div>\r\n   \r\n    <div class=\"carousel-inner\">\r\n      <div class=\"carousel-item active\" data-bs-interval=\"200\">\r\n        <div class=\"cmp-pumacarousel-img\"><img");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_model, "image");
    {
        Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "uri");
        {
            boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
            if (var_shoulddisplayattr3) {
                out.write(" src");
                {
                    boolean var_istrueattr2 = (var_attrvalue0.equals(true));
                    if (!var_istrueattr2) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent1));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"...\"/></div>\r\n        \r\n        <div class=\"carousel-caption d-none d-md-block\">\r\n          <h5>");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title3"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</h5>\r\n          <p>");
{
    Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "text"), "text");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</p>\r\n        </div>\r\n      </div>\r\n      <div class=\"carousel-item\" data-bs-interval=\"200\">\r\n        <div class=\"cmp-pumacarousel-img\"> <img");
{
    Object var_attrvalue6 = renderContext.getObjectModel().resolveProperty(_global_model, "image2");
    {
        Object var_attrcontent7 = renderContext.call("xss", var_attrvalue6, "uri");
        {
            boolean var_shoulddisplayattr9 = (((null != var_attrcontent7) && (!"".equals(var_attrcontent7))) && ((!"".equals(var_attrvalue6)) && (!((Object)false).equals(var_attrvalue6))));
            if (var_shoulddisplayattr9) {
                out.write(" src");
                {
                    boolean var_istrueattr8 = (var_attrvalue6.equals(true));
                    if (!var_istrueattr8) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent7));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"...\"/>\r\n          </div>\r\n        <div class=\"carousel-caption d-none d-md-block\">\r\n          <h5>");
{
    Object var_10 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title3"), "text");
    out.write(renderContext.getObjectModel().toString(var_10));
}
out.write("</h5>\r\n          <p>");
{
    Object var_11 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "text2"), "text");
    out.write(renderContext.getObjectModel().toString(var_11));
}
out.write("</p>\r\n        </div>\r\n      </div>\r\n      <div class=\"carousel-item\" data-bs-interval=\"100\">\r\n        <div class=\"cmp-pumacarousel-img\"> <img");
{
    Object var_attrvalue12 = renderContext.getObjectModel().resolveProperty(_global_model, "image3");
    {
        Object var_attrcontent13 = renderContext.call("xss", var_attrvalue12, "uri");
        {
            boolean var_shoulddisplayattr15 = (((null != var_attrcontent13) && (!"".equals(var_attrcontent13))) && ((!"".equals(var_attrvalue12)) && (!((Object)false).equals(var_attrvalue12))));
            if (var_shoulddisplayattr15) {
                out.write(" src");
                {
                    boolean var_istrueattr14 = (var_attrvalue12.equals(true));
                    if (!var_istrueattr14) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent13));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"...\"/>\r\n          </div>\r\n        <div class=\"carousel-caption d-none d-md-block\">\r\n          <h5>");
{
    Object var_16 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title3"), "text");
    out.write(renderContext.getObjectModel().toString(var_16));
}
out.write("</h5>\r\n          <p>");
{
    Object var_17 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "text3"), "text");
    out.write(renderContext.getObjectModel().toString(var_17));
}
out.write("</p>\r\n        </div>\r\n      </div>\r\n    \r\n    </div>\r\n    <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"prev\">\r\n      <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n      <span class=\"visually-hidden\">Previous</span>\r\n    </button>\r\n    <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"next\">\r\n      <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n      <span class=\"visually-hidden\">Next</span>\r\n    </button>\r\n  </div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

