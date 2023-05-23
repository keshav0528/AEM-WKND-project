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
package org.apache.sling.scripting.sightly.apps.wknd.components.navbar;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class navbar__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_templates = null;
Collection var_collectionvar14_list_coerced$ = null;
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.Header.class.getName(), obj());
_global_templates = renderContext.call("use", "/libs/core/wcm/components/commons/v1/templates.html", obj());
out.write("<div data-cmp-is=\"Header\" class=\"cmp-mainnavbar\">\r\n  ");
{
    boolean var_testvariable0 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "isEmpty")));
    if (var_testvariable0) {
        out.write("\r\n\r\n    <div class=\"cmp-mainnavbar_nav\">\r\n      <div class=\"cmp-mainnavbar__logo\">\r\n        <a");
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
        out.write(" alt=\"rightpoint\"/>\r\n        </a>\r\n      </div>\r\n      <div class=\"cmp-mainnavbar__navbar\">\r\n\r\n        <div class=\"cmp-mainnavbar_search\">\r\n          <input type=\"text\" class=\"cmp-mainnavbar_search_search-box\" placeholder=\"search brand, product\"/>\r\n          <button class=\"cmp-mainnavbar_search_search-btn\">search</button>\r\n        </div>\r\n\r\n      </div>\r\n\r\n      <div class=\"cmp-mainnavbar__right\">\r\n\r\n        <div class=\"cmp-mainnavbar__right-webrtc\">\r\n          <a");
        {
            Object var_attrvalue6 = renderContext.getObjectModel().resolveProperty(_global_model, "weblink");
            {
                Object var_attrcontent7 = renderContext.call("xss", var_attrvalue6, "uri");
                {
                    boolean var_shoulddisplayattr9 = (((null != var_attrcontent7) && (!"".equals(var_attrcontent7))) && ((!"".equals(var_attrvalue6)) && (!((Object)false).equals(var_attrvalue6))));
                    if (var_shoulddisplayattr9) {
                        out.write(" href");
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
        out.write(">\r\n            <i class=\"fa-solid fa-globe my-font\"></i>\r\n          </a>\r\n        </div>\r\n        <div class=\"cmp-mainnavbar__right-myspan1\"><span> | </span></div>\r\n\r\n        <div class=\"cmp-mainnavbar__right-websearch\">\r\n          <a");
        {
            Object var_attrvalue10 = renderContext.getObjectModel().resolveProperty(_global_model, "search");
            {
                Object var_attrcontent11 = renderContext.call("xss", var_attrvalue10, "uri");
                {
                    boolean var_shoulddisplayattr13 = (((null != var_attrcontent11) && (!"".equals(var_attrcontent11))) && ((!"".equals(var_attrvalue10)) && (!((Object)false).equals(var_attrvalue10))));
                    if (var_shoulddisplayattr13) {
                        out.write(" href");
                        {
                            boolean var_istrueattr12 = (var_attrvalue10.equals(true));
                            if (!var_istrueattr12) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent11));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write("><i class=\"fa-solid fa-magnifying-glass my-font\"> </i>\r\n          </a>\r\n        </div>\r\n        <div class=\"cmp-mainnavbar__right-myspan2\"><span> | </span></div>\r\n        <div class=\"cmp-mainnavbar__right-webmenu\">\r\n          <a href=\"#\"><i class=\"fa-solid fa-bars my-font\"></i></a>\r\n        </div>\r\n      </div>\r\n    </div>\r\n  ");
    }
}
out.write("\r\n  ");
{
    Object var_collectionvar14 = renderContext.getObjectModel().resolveProperty(_global_model, "category");
    {
        long var_size15 = ((var_collectionvar14_list_coerced$ == null ? (var_collectionvar14_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar14)) : var_collectionvar14_list_coerced$).size());
        {
            boolean var_notempty16 = (var_size15 > 0);
            if (var_notempty16) {
                {
                    long var_end19 = var_size15;
                    {
                        boolean var_validstartstepend20 = (((0 < var_size15) && true) && (var_end19 > 0));
                        if (var_validstartstepend20) {
                            out.write("<div class=\"cmp-mainnavbar_links-container\">");
                            if (var_collectionvar14_list_coerced$ == null) {
                                var_collectionvar14_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar14);
                            }
                            long var_index21 = 0;
                            for (Object item : var_collectionvar14_list_coerced$) {
                                {
                                    boolean var_traversal23 = (((var_index21 >= 0) && (var_index21 <= var_end19)) && true);
                                    if (var_traversal23) {
                                        out.write("\r\n\r\n\r\n    <a");
                                        {
                                            String var_attrcontent24 = (("http://localhost:4502/" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "link"), "uri"))) + ".html?query=disabled");
                                            out.write(" href=\"");
                                            out.write(renderContext.getObjectModel().toString(var_attrcontent24));
                                            out.write("\"");
                                        }
                                        {
                                            String var_attrcontent25 = ("cmp-mainnavbar_link " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "id"), "attribute")));
                                            out.write(" class=\"");
                                            out.write(renderContext.getObjectModel().toString(var_attrcontent25));
                                            out.write("\"");
                                        }
                                        out.write(">");
                                        {
                                            Object var_26 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "text"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_26));
                                        }
                                        out.write("</a>\r\n\r\n\r\n  ");
                                    }
                                }
                                var_index21++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar14_list_coerced$ = null;
}
out.write("\r\n  ");
{
    Object var_templatevar27 = renderContext.getObjectModel().resolveProperty(_global_templates, "placeholder");
    {
        Object var_templateoptions28_field$_isempty = renderContext.getObjectModel().resolveProperty(_global_model, "isEmpty");
        {
            java.util.Map var_templateoptions28 = obj().with("isEmpty", var_templateoptions28_field$_isempty);
            callUnit(out, renderContext, var_templatevar27, var_templateoptions28);
        }
    }
}


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

