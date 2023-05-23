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
package org.apache.sling.scripting.sightly.apps.wknd.components.samplecompcontainer;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class samplecompcontainer__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _dynamic_properties = bindings.get("properties");
out.write("<div class=\"grid-container\">\r\n  <div class=\"grid-item\">\r\n    ");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.SampleCompContainer.class.getName(), obj());
out.write("<div class=\"card\">\r\n      <div class=\"grid-item-discount\">");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "subTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</div>\r\n     \r\n      <div class=\"imageproperty\">\r\n        <img class=\"prop-img\"");
{
    Object var_attrvalue1 = renderContext.getObjectModel().resolveProperty(_global_model, "image");
    {
        Object var_attrcontent2 = renderContext.call("xss", var_attrvalue1, "uri");
        {
            boolean var_shoulddisplayattr4 = (((null != var_attrcontent2) && (!"".equals(var_attrcontent2))) && ((!"".equals(var_attrvalue1)) && (!((Object)false).equals(var_attrvalue1))));
            if (var_shoulddisplayattr4) {
                out.write(" src");
                {
                    boolean var_istrueattr3 = (var_attrvalue1.equals(true));
                    if (!var_istrueattr3) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent2));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"\"/>\r\n      </div>\r\n      <div class=\"grid-item-title\">");
{
    Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title"), "text");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</div>\r\n  \r\n      <div class=\"grid-item-price\">");
{
    Object var_6 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "text"), "text");
    out.write(renderContext.getObjectModel().toString(var_6));
}
out.write("</div>\r\n      <div class=\"cmp-occupations\">");
{
    Object var_7 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "occupations"), "text");
    out.write(renderContext.getObjectModel().toString(var_7));
}
out.write("</div>\r\n    </div>\r\n  </div>\r\n  <div class=\"grid-item\">\r\n    ");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.SampleCompContainer.class.getName(), obj());
out.write("<div class=\"card\">\r\n      <div class=\"grid-item-discount\">");
{
    Object var_8 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "subTitle2"), "text");
    out.write(renderContext.getObjectModel().toString(var_8));
}
out.write("</div>\r\n      <div class=\"imageproperty\">\r\n        <img class=\"prop-img\"");
{
    Object var_attrvalue9 = renderContext.getObjectModel().resolveProperty(_global_model, "image2");
    {
        Object var_attrcontent10 = renderContext.call("xss", var_attrvalue9, "uri");
        {
            boolean var_shoulddisplayattr12 = (((null != var_attrcontent10) && (!"".equals(var_attrcontent10))) && ((!"".equals(var_attrvalue9)) && (!((Object)false).equals(var_attrvalue9))));
            if (var_shoulddisplayattr12) {
                out.write(" src");
                {
                    boolean var_istrueattr11 = (var_attrvalue9.equals(true));
                    if (!var_istrueattr11) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent10));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"\"/>\r\n      </div>\r\n      <div class=\"grid-item-pricetag\">\r\n      <div class=\"grid-item-title\">");
{
    Object var_13 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title2"), "text");
    out.write(renderContext.getObjectModel().toString(var_13));
}
out.write("</div>\r\n      \r\n      <div class=\"grid-item-price\">");
{
    Object var_14 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "text2"), "text");
    out.write(renderContext.getObjectModel().toString(var_14));
}
out.write("</div>\r\n    </div>\r\n      <div class=\"cmp-occupations\">");
{
    Object var_15 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "occupations2"), "text");
    out.write(renderContext.getObjectModel().toString(var_15));
}
out.write("</div>\r\n    </div>\r\n  </div>\r\n\r\n  <div class=\"grid-item\">\r\n    ");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.SampleCompContainer.class.getName(), obj());
out.write("<div class=\"card\">\r\n      <div class=\"grid-item-discount\">");
{
    Object var_16 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "subTitle3"), "text");
    out.write(renderContext.getObjectModel().toString(var_16));
}
out.write("</div>\r\n      <div class=\"imageproperty\">\r\n        <img class=\"prop-img\"");
{
    Object var_attrvalue17 = renderContext.getObjectModel().resolveProperty(_global_model, "image3");
    {
        Object var_attrcontent18 = renderContext.call("xss", var_attrvalue17, "uri");
        {
            boolean var_shoulddisplayattr20 = (((null != var_attrcontent18) && (!"".equals(var_attrcontent18))) && ((!"".equals(var_attrvalue17)) && (!((Object)false).equals(var_attrvalue17))));
            if (var_shoulddisplayattr20) {
                out.write(" src");
                {
                    boolean var_istrueattr19 = (var_attrvalue17.equals(true));
                    if (!var_istrueattr19) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent18));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"\"/>\r\n      </div>\r\n      <div class=\"grid-item-title\">");
{
    Object var_21 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title3"), "text");
    out.write(renderContext.getObjectModel().toString(var_21));
}
out.write("</div>\r\n     \r\n      <div class=\"grid-item-price\">");
{
    Object var_22 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "text3"), "text");
    out.write(renderContext.getObjectModel().toString(var_22));
}
out.write("</div>\r\n      <div class=\"cmp-occupations\">");
{
    Object var_23 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "occupations3"), "text");
    out.write(renderContext.getObjectModel().toString(var_23));
}
out.write("</div>\r\n    </div>\r\n  </div>\r\n  <div class=\"grid-item\">\r\n    ");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.SampleCompContainer.class.getName(), obj());
out.write("<div class=\"card\">\r\n      <div class=\"grid-item-discount\">");
{
    Object var_24 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "subTitle4"), "text");
    out.write(renderContext.getObjectModel().toString(var_24));
}
out.write("</div>\r\n      <div class=\"imageproperty\">\r\n        <img class=\"prop-img\"");
{
    Object var_attrvalue25 = renderContext.getObjectModel().resolveProperty(_global_model, "image4");
    {
        Object var_attrcontent26 = renderContext.call("xss", var_attrvalue25, "uri");
        {
            boolean var_shoulddisplayattr28 = (((null != var_attrcontent26) && (!"".equals(var_attrcontent26))) && ((!"".equals(var_attrvalue25)) && (!((Object)false).equals(var_attrvalue25))));
            if (var_shoulddisplayattr28) {
                out.write(" src");
                {
                    boolean var_istrueattr27 = (var_attrvalue25.equals(true));
                    if (!var_istrueattr27) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent26));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"\"/>\r\n      </div>\r\n      <div class=\"grid-item-title\">");
{
    Object var_29 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title4"), "text");
    out.write(renderContext.getObjectModel().toString(var_29));
}
out.write("</div>\r\n      \r\n      <div class=\"grid-item-price\">");
{
    Object var_30 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "text4"), "text");
    out.write(renderContext.getObjectModel().toString(var_30));
}
out.write("</div>\r\n      <div class=\"cmp-occupations\">");
{
    Object var_31 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "occupations4"), "text");
    out.write(renderContext.getObjectModel().toString(var_31));
}
out.write("</div>\r\n    </div>\r\n  </div>\r\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

