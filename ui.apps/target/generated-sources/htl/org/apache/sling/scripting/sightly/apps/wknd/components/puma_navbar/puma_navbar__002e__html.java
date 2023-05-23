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
package org.apache.sling.scripting.sightly.apps.wknd.components.puma_navbar;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class puma_navbar__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_templates = null;
Object _dynamic_item = bindings.get("item");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.Header.class.getName(), obj());
_global_templates = renderContext.call("use", "/libs/core/wcm/components/commons/v1/templates.html", obj());
out.write("<div data-cmp-is=\"Header\" class=\"cmp-mainnavbar\">\r\n  ");
{
    boolean var_testvariable0 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "isEmpty")));
    if (var_testvariable0) {
        out.write("\r\n    <!-- <div class=\"cmp-mainheader__first\"> -->\r\n      <div class=\"cmp-mainnavbar_nav\">\r\n      <div class=\"cmp-mainnavbar__logo\">\r\n        <a");
        {
            String var_attrcontent1 = (("http://localhost:4502/" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "homeLink"), "uri"))) + ".html?query=disabled");
            out.write(" href=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent1));
            out.write("\"");
        }
        out.write(">\r\n          <img");
        {
            Object var_attrvalue2 = renderContext.getObjectModel().resolveProperty(_global_model, "logo");
            {
                Object var_attrcontent3 = renderContext.call("xss", var_attrvalue2, "uri");
                {
                    boolean var_shoulddisplayattr5 = (((null != var_attrcontent3) && (!"".equals(var_attrcontent3))) && ((!"".equals(var_attrvalue2)) && (!((Object)false).equals(var_attrvalue2))));
                    if (var_shoulddisplayattr5) {
                        out.write(" src");
                        {
                            boolean var_istrueattr4 = (var_attrvalue2.equals(true));
                            if (!var_istrueattr4) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent3));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(" alt=\"rightpoint\"/>\r\n        </a>\r\n      </div>\r\n      <div class=\"cmp-mainnavbar__navbar\">\r\n        ");
        {
            String var_6 = (("<!-- data-sly-list.item=\"" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "category"), "comment"))) + "\" -->");
            out.write(renderContext.getObjectModel().toString(var_6));
        }
        out.write("\r\n        <div class=\"cmp-mainnavbar_search\">\r\n          <input type=\"text\" class=\"cmp-mainnavbar_search_search-box\" placeholder=\"search brand, product\"/>\r\n          <button class=\"cmp-mainnavbar_search_search-btn\">search</button>\r\n        </div>\r\n        ");
        {
            String var_7 = (((((("<!-- <a href=\"http://localhost:4502/" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_item, "link"), "comment"))) + ".html?query=disabled\" class=\"cmp-mainnavbar__navbar-link ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_item, "id"), "comment"))) + "\"\r\n          >") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_item, "text"), "comment"))) + "</a\r\n        > -->");
            out.write(renderContext.getObjectModel().toString(var_7));
        }
        out.write("\r\n        \r\n      </div>\r\n    <!-- </div> -->\r\n\r\n    <!-- <div class=\"cmp-mainheader__second\"> -->\r\n    <!-- <div class=\"cmp-mainnavbar__right\">\r\n      <!-- <a class=\"cmp-mainheader__second__right__button\" href=\"\">Contact</a> -->\r\n      <div class=\"cmp-mainnavbar__right-webrtc\">\r\n        <a");
        {
            Object var_attrvalue8 = renderContext.getObjectModel().resolveProperty(_global_model, "weblink");
            {
                Object var_attrcontent9 = renderContext.call("xss", var_attrvalue8, "uri");
                {
                    boolean var_shoulddisplayattr11 = (((null != var_attrcontent9) && (!"".equals(var_attrcontent9))) && ((!"".equals(var_attrvalue8)) && (!((Object)false).equals(var_attrvalue8))));
                    if (var_shoulddisplayattr11) {
                        out.write(" href");
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
        out.write(">\r\n          <i class=\"fa-solid fa-globe my-font\"></i>\r\n        </a>\r\n      </div>\r\n      <div class=\"cmp-mainnavbar__right-myspan1\"><span> | </span></div>\r\n      \r\n      <div class=\"cmp-mainnavbar__right-websearch\">\r\n        <a");
        {
            Object var_attrvalue12 = renderContext.getObjectModel().resolveProperty(_global_model, "search");
            {
                Object var_attrcontent13 = renderContext.call("xss", var_attrvalue12, "uri");
                {
                    boolean var_shoulddisplayattr15 = (((null != var_attrcontent13) && (!"".equals(var_attrcontent13))) && ((!"".equals(var_attrvalue12)) && (!((Object)false).equals(var_attrvalue12))));
                    if (var_shoulddisplayattr15) {
                        out.write(" href");
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
        out.write("><i class=\"fa-solid fa-magnifying-glass my-font\"> </i>\r\n        </a>\r\n      </div>\r\n      <div class=\"cmp-mainnavbar__right-myspan2\"><span> | </span></div>\r\n      <div class=\"cmp-mainnavbar__right-webmenu\">\r\n        <a href=\"#\"><i class=\"fa-solid fa-bars my-font\"></i></a>\r\n      </div>\r\n    </div> \r\n\r\n\r\n\r\n    <!-- </div> -->\r\n \r\n    \r\n<!-- </div> -->\r\n");
    }
}
out.write("\r\n</div>\r\n");
{
    String var_16 = (((((((("<!-- <div class=\"cmp-mainnavbar_links-container\"  data-sly-list.item=\"" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "category"), "comment"))) + "\">\r\n\r\n  \r\n    <a href=\"http://localhost:4502/") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_item, "link"), "comment"))) + ".html?query=disabled\" class=\"cmp-mainnavbar_link ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_item, "id"), "comment"))) + "\"\r\n    >") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_item, "text"), "comment"))) + "</a\r\n  >\r\n  \r\n\r\n</div> -->");
    out.write(renderContext.getObjectModel().toString(var_16));
}
out.write("\r\n");
{
    Object var_templatevar17 = renderContext.getObjectModel().resolveProperty(_global_templates, "placeholder");
    {
        Object var_templateoptions18_field$_isempty = renderContext.getObjectModel().resolveProperty(_global_model, "isEmpty");
        {
            java.util.Map var_templateoptions18 = obj().with("isEmpty", var_templateoptions18_field$_isempty);
            callUnit(out, renderContext, var_templatevar17, var_templateoptions18);
        }
    }
}
out.write("\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

