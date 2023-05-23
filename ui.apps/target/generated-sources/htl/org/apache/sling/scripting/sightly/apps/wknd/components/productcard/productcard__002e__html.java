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
package org.apache.sling.scripting.sightly.apps.wknd.components.productcard;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class productcard__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _dynamic_properties = bindings.get("properties");
out.write("<div class=\"cmp-product-grid-container\">\r\n  <div class=\"cmp-product-grid-item\">\r\n    ");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.ProductCard.class.getName(), obj());
out.write("<div class=\"card\">\r\n     \r\n     \r\n      <div class=\"cmp-product-grid-item-image\">\r\n        <img class=\"cmp-product-grid-item-image-img\"");
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
out.write(" alt=\"\"/>\r\n      </div>\r\n      <div class=\"cmp-product-grid-item-discount\">");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "subTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</div>\r\n   \r\n  \r\n      <div class=\"cmp-product-grid-item-price\">");
{
    Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "text"), "text");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</div>\r\n      <div class=\"cmp-product-grid-item-card-botton\">");
{
    Object var_6 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title"), "text");
    out.write(renderContext.getObjectModel().toString(var_6));
}
out.write("</div>\r\n      <div class=\"cmp-occupations\">");
{
    Object var_7 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "occupations"), "text");
    out.write(renderContext.getObjectModel().toString(var_7));
}
out.write("</div>\r\n    </div>\r\n  </div>\r\n  <div class=\"cmp-product-grid-item\">\r\n ");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.ProductCard.class.getName(), obj());
out.write("<div class=\"card\">\r\n     \r\n      <div class=\"cmp-product-grid-item-image\">\r\n        <img class=\"cmp-product-grid-item-image-img\"");
{
    Object var_attrvalue8 = renderContext.getObjectModel().resolveProperty(_global_model, "image2");
    {
        Object var_attrcontent9 = renderContext.call("xss", var_attrvalue8, "uri");
        {
            boolean var_shoulddisplayattr11 = (((null != var_attrcontent9) && (!"".equals(var_attrcontent9))) && ((!"".equals(var_attrvalue8)) && (!((Object)false).equals(var_attrvalue8))));
            if (var_shoulddisplayattr11) {
                out.write(" src");
                {
                    boolean var_istrueattr10 = (var_attrvalue8.equals(true));
                    if (!var_istrueattr10) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent9));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"\"/>\r\n      </div>\r\n      <div class=\"cmp-product-grid-item-discount\">");
{
    Object var_12 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "subTitle2"), "text");
    out.write(renderContext.getObjectModel().toString(var_12));
}
out.write("</div>\r\n      <div class=\"cmp-product-grid-item-pricetag\">\r\n      \r\n      \r\n      <div class=\"cmp-product-grid-item-price\">");
{
    Object var_13 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "text2"), "text");
    out.write(renderContext.getObjectModel().toString(var_13));
}
out.write("</div>\r\n    </div>\r\n    <div class=\"cmp-product-grid-item-card-botton\">");
{
    Object var_14 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title2"), "text");
    out.write(renderContext.getObjectModel().toString(var_14));
}
out.write("</div>\r\n      <div class=\"cmp-occupations\">");
{
    Object var_15 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "occupations2"), "text");
    out.write(renderContext.getObjectModel().toString(var_15));
}
out.write("</div>\r\n    </div>\r\n  </div>\r\n\r\n  <div class=\"cmp-product-grid-item\">\r\n ");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.ProductCard.class.getName(), obj());
out.write("<div class=\"card\">\r\n      \r\n      <div class=\"cmp-product-grid-item-image\">\r\n        <img class=\"cmp-product-grid-item-image-img\"");
{
    Object var_attrvalue16 = renderContext.getObjectModel().resolveProperty(_global_model, "image3");
    {
        Object var_attrcontent17 = renderContext.call("xss", var_attrvalue16, "uri");
        {
            boolean var_shoulddisplayattr19 = (((null != var_attrcontent17) && (!"".equals(var_attrcontent17))) && ((!"".equals(var_attrvalue16)) && (!((Object)false).equals(var_attrvalue16))));
            if (var_shoulddisplayattr19) {
                out.write(" src");
                {
                    boolean var_istrueattr18 = (var_attrvalue16.equals(true));
                    if (!var_istrueattr18) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent17));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"\"/>\r\n      </div>\r\n      <div class=\"cmp-product-grid-item-discount\">");
{
    Object var_20 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "subTitle3"), "text");
    out.write(renderContext.getObjectModel().toString(var_20));
}
out.write("</div>\r\n  \r\n     \r\n      <div class=\"cmp-product-grid-item-price\">");
{
    Object var_21 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "text3"), "text");
    out.write(renderContext.getObjectModel().toString(var_21));
}
out.write("</div>\r\n      <div class=\"cmp-product-grid-item-card-botton\">");
{
    Object var_22 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title3"), "text");
    out.write(renderContext.getObjectModel().toString(var_22));
}
out.write("</div>\r\n      <div class=\"cmp-occupations\">");
{
    Object var_23 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "occupations3"), "text");
    out.write(renderContext.getObjectModel().toString(var_23));
}
out.write("</div>\r\n    </div>\r\n  </div>\r\n  <div class=\"cmp-product-grid-item\">\r\n ");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.ProductCard.class.getName(), obj());
out.write("<div class=\"card\">\r\n      \r\n      <div class=\"cmp-product-grid-item-image\">\r\n        <img class=\"cmp-product-grid-item-image-img\"");
{
    Object var_attrvalue24 = renderContext.getObjectModel().resolveProperty(_global_model, "image4");
    {
        Object var_attrcontent25 = renderContext.call("xss", var_attrvalue24, "uri");
        {
            boolean var_shoulddisplayattr27 = (((null != var_attrcontent25) && (!"".equals(var_attrcontent25))) && ((!"".equals(var_attrvalue24)) && (!((Object)false).equals(var_attrvalue24))));
            if (var_shoulddisplayattr27) {
                out.write(" src");
                {
                    boolean var_istrueattr26 = (var_attrvalue24.equals(true));
                    if (!var_istrueattr26) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent25));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"\"/>\r\n      </div>\r\n      <div class=\"cmp-product-grid-item-discount\">");
{
    Object var_28 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "subTitle4"), "text");
    out.write(renderContext.getObjectModel().toString(var_28));
}
out.write("</div>\r\n   \r\n      \r\n      <div class=\"cmp-product-grid-item-price\">");
{
    Object var_29 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "text4"), "text");
    out.write(renderContext.getObjectModel().toString(var_29));
}
out.write("</div>\r\n      <div class=\"cmp-product-grid-item-card-botton\">");
{
    Object var_30 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title4"), "text");
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

