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
package org.apache.sling.scripting.sightly.apps.wknd.components.carouseltask;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class carouseltask__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Collection var_collectionvar0_list_coerced$ = null;
Object _dynamic_item = bindings.get("item");
Collection var_collectionvar20_list_coerced$ = null;
Collection var_collectionvar35_list_coerced$ = null;
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.PumaCarousel.class.getName(), obj());
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_global_model, "slider");
    {
        long var_size1 = ((var_collectionvar0_list_coerced$ == null ? (var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0)) : var_collectionvar0_list_coerced$).size());
        {
            boolean var_notempty2 = (var_size1 > 0);
            if (var_notempty2) {
                {
                    long var_end5 = var_size1;
                    {
                        boolean var_validstartstepend6 = (((0 < var_size1) && true) && (var_end5 > 0));
                        if (var_validstartstepend6) {
                            out.write("<div data-cmp-is=\"PumaCarousel\"");
                            {
                                Object var_attrvalue7 = renderContext.getObjectModel().resolveProperty(_dynamic_item, "image");
                                {
                                    Object var_attrcontent8 = renderContext.call("xss", var_attrvalue7, "attribute");
                                    {
                                        boolean var_shoulddisplayattr10 = (((null != var_attrcontent8) && (!"".equals(var_attrcontent8))) && ((!"".equals(var_attrvalue7)) && (!((Object)false).equals(var_attrvalue7))));
                                        if (var_shoulddisplayattr10) {
                                            out.write(" data-type");
                                            {
                                                boolean var_istrueattr9 = (var_attrvalue7.equals(true));
                                                if (!var_istrueattr9) {
                                                    out.write("=\"");
                                                    out.write(renderContext.getObjectModel().toString(var_attrcontent8));
                                                    out.write("\"");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            out.write(" class=\"cmp-slideshow-container\">");
                            if (var_collectionvar0_list_coerced$ == null) {
                                var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                            }
                            long var_index11 = 0;
                            for (Object item : var_collectionvar0_list_coerced$) {
                                {
                                    boolean var_traversal13 = (((var_index11 >= 0) && (var_index11 <= var_end5)) && true);
                                    if (var_traversal13) {
                                        out.write("\r\n\r\n  <div class=\"cmp-slideshow-container-mySlides fade\">\r\n    <img");
                                        {
                                            Object var_attrvalue14 = renderContext.getObjectModel().resolveProperty(item, "image");
                                            {
                                                Object var_attrcontent15 = renderContext.call("xss", var_attrvalue14, "uri");
                                                {
                                                    boolean var_shoulddisplayattr17 = (((null != var_attrcontent15) && (!"".equals(var_attrcontent15))) && ((!"".equals(var_attrvalue14)) && (!((Object)false).equals(var_attrvalue14))));
                                                    if (var_shoulddisplayattr17) {
                                                        out.write(" src");
                                                        {
                                                            boolean var_istrueattr16 = (var_attrvalue14.equals(true));
                                                            if (!var_istrueattr16) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent15));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write(" style=\"width: 100%\"/>\r\n    <div class=\"cmp-slideshow-container-title\">");
                                        {
                                            Object var_18 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "title"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_18));
                                        }
                                        out.write("</div>\r\n    <div class=\"cmp-slideshow-container-description\">");
                                        {
                                            Object var_19 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "description"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_19));
                                        }
                                        out.write("</div>\r\n    ");
                                        {
                                            Object var_collectionvar20 = renderContext.getObjectModel().resolveProperty(_global_model, "ctalinks");
                                            {
                                                long var_size21 = ((var_collectionvar20_list_coerced$ == null ? (var_collectionvar20_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar20)) : var_collectionvar20_list_coerced$).size());
                                                {
                                                    boolean var_notempty22 = (var_size21 > 0);
                                                    if (var_notempty22) {
                                                        {
                                                            long var_end25 = var_size21;
                                                            {
                                                                boolean var_validstartstepend26 = (((0 < var_size21) && true) && (var_end25 > 0));
                                                                if (var_validstartstepend26) {
                                                                    out.write("<div class=\"cmp-slideshow-container-buttoncta\"");
                                                                    {
                                                                        Object var_attrvalue27 = renderContext.getObjectModel().resolveProperty(item, "targetcta");
                                                                        {
                                                                            Object var_attrcontent28 = renderContext.call("xss", var_attrvalue27, "attribute");
                                                                            {
                                                                                boolean var_shoulddisplayattr30 = (((null != var_attrcontent28) && (!"".equals(var_attrcontent28))) && ((!"".equals(var_attrvalue27)) && (!((Object)false).equals(var_attrvalue27))));
                                                                                if (var_shoulddisplayattr30) {
                                                                                    out.write(" data-type");
                                                                                    {
                                                                                        boolean var_istrueattr29 = (var_attrvalue27.equals(true));
                                                                                        if (!var_istrueattr29) {
                                                                                            out.write("=\"");
                                                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent28));
                                                                                            out.write("\"");
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    out.write(">");
                                                                    if (var_collectionvar20_list_coerced$ == null) {
                                                                        var_collectionvar20_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar20);
                                                                    }
                                                                    long var_index31 = 0;
                                                                    for (Object item_1 : var_collectionvar20_list_coerced$) {
                                                                        {
                                                                            boolean var_traversal33 = (((var_index31 >= 0) && (var_index31 <= var_end25)) && true);
                                                                            if (var_traversal33) {
                                                                                {
                                                                                    String var_34 = (("\r\n    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item_1, "titlecta"), "text"))) + "\r\n      ");
                                                                                    out.write(renderContext.getObjectModel().toString(var_34));
                                                                                }
                                                                                out.write("\r\n    ");
                                                                            }
                                                                        }
                                                                        var_index31++;
                                                                    }
                                                                    out.write("</div>");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var_collectionvar20_list_coerced$ = null;
                                        }
                                        out.write("\r\n  </div>\r\n\r\n  <a class=\"prev\" onclick=\"plusSlides(-1)\">&#10094;</a>\r\n  <a class=\"next\" onclick=\"plusSlides(1)\">&#10095;</a>\r\n\r\n\r\n  ");
                                        {
                                            Object var_collectionvar35 = renderContext.getObjectModel().resolveProperty(_global_model, "statistics");
                                            {
                                                long var_size36 = ((var_collectionvar35_list_coerced$ == null ? (var_collectionvar35_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar35)) : var_collectionvar35_list_coerced$).size());
                                                {
                                                    boolean var_notempty37 = (var_size36 > 0);
                                                    if (var_notempty37) {
                                                        {
                                                            long var_end40 = var_size36;
                                                            {
                                                                boolean var_validstartstepend41 = (((0 < var_size36) && true) && (var_end40 > 0));
                                                                if (var_validstartstepend41) {
                                                                    out.write("<div class=\"cmp-pumacarousel\"");
                                                                    {
                                                                        Object var_attrvalue42 = renderContext.getObjectModel().resolveProperty(item, "number");
                                                                        {
                                                                            Object var_attrcontent43 = renderContext.call("xss", var_attrvalue42, "attribute");
                                                                            {
                                                                                boolean var_shoulddisplayattr45 = (((null != var_attrcontent43) && (!"".equals(var_attrcontent43))) && ((!"".equals(var_attrvalue42)) && (!((Object)false).equals(var_attrvalue42))));
                                                                                if (var_shoulddisplayattr45) {
                                                                                    out.write(" data-type");
                                                                                    {
                                                                                        boolean var_istrueattr44 = (var_attrvalue42.equals(true));
                                                                                        if (!var_istrueattr44) {
                                                                                            out.write("=\"");
                                                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent43));
                                                                                            out.write("\"");
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    out.write(">");
                                                                    if (var_collectionvar35_list_coerced$ == null) {
                                                                        var_collectionvar35_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar35);
                                                                    }
                                                                    long var_index46 = 0;
                                                                    for (Object item_1 : var_collectionvar35_list_coerced$) {
                                                                        {
                                                                            boolean var_traversal48 = (((var_index46 >= 0) && (var_index46 <= var_end40)) && true);
                                                                            if (var_traversal48) {
                                                                                out.write("\r\n    <div class=\"fade-in cmp-pumacarousel-counter\">\r\n      <button class=\"slide-in cmp-pumacarousel-counter-item\">\r\n        <i");
                                                                                {
                                                                                    String var_attrcontent49 = ("fa fa-" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item_1, "icon"), "attribute")));
                                                                                    out.write(" class=\"");
                                                                                    out.write(renderContext.getObjectModel().toString(var_attrcontent49));
                                                                                    out.write("\"");
                                                                                }
                                                                                out.write("></i>\r\n        <div class=\"cmp-pumacarousel-counter-item-details\">\r\n          <h3 class=\"text\">");
                                                                                {
                                                                                    Object var_50 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item_1, "titlestatistics"), "text");
                                                                                    out.write(renderContext.getObjectModel().toString(var_50));
                                                                                }
                                                                                out.write("</h3>\r\n          <h1 class=\"cmp-pumacarousel-counter-details-count\"");
                                                                                {
                                                                                    Object var_attrvalue51 = renderContext.getObjectModel().resolveProperty(item_1, "number");
                                                                                    {
                                                                                        Object var_attrcontent52 = renderContext.call("xss", var_attrvalue51, "attribute");
                                                                                        {
                                                                                            boolean var_shoulddisplayattr54 = (((null != var_attrcontent52) && (!"".equals(var_attrcontent52))) && ((!"".equals(var_attrvalue51)) && (!((Object)false).equals(var_attrvalue51))));
                                                                                            if (var_shoulddisplayattr54) {
                                                                                                out.write(" data-number");
                                                                                                {
                                                                                                    boolean var_istrueattr53 = (var_attrvalue51.equals(true));
                                                                                                    if (!var_istrueattr53) {
                                                                                                        out.write("=\"");
                                                                                                        out.write(renderContext.getObjectModel().toString(var_attrcontent52));
                                                                                                        out.write("\"");
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                out.write("></h1>\r\n        </div>\r\n      </button>\r\n    </div>\r\n  ");
                                                                            }
                                                                        }
                                                                        var_index46++;
                                                                    }
                                                                    out.write("</div>");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var_collectionvar35_list_coerced$ = null;
                                        }
                                        out.write("\r\n\r\n");
                                    }
                                }
                                var_index11++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar0_list_coerced$ = null;
}
out.write("\r\n\r\n\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

