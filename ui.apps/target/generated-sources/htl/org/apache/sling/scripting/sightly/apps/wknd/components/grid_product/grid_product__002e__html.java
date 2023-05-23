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
package org.apache.sling.scripting.sightly.apps.wknd.components.grid_product;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class grid_product__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Collection var_collectionvar0_list_coerced$ = null;
Object _dynamic_item = bindings.get("item");
out.write("<div class=\"cmp-filter-dropdown-product-filter\">\r\n  <h1>FILTER PRODUCT</h1>\r\n  <div>\r\n    <div class=\"cmp-filter-dropdown-collection-sort\">\r\n      <label>Filter by:</label>\r\n      <div class=\"columns medium-4\">\r\n        <select id=\"FilterCategory\" onchange=\"getSelectedValueCategory()\">\r\n          <option selected=\"selected\">Category</option>\r\n          <option value=\"FOOTWEAR\">FOOTWEAR</option>\r\n          <option value=\"Apparel\">Apparel</option>\r\n          <option value=\"Accessories\">Accessories</option>\r\n        </select>\r\n        <select id=\"FilterProductType\" onchange=\"getSelectedValueProductType()\">\r\n          <option selected=\"selected\">Product Type</option>\r\n          <option value=\"Bag\">Bag</option>\r\n          <option value=\"Cap\">Cap</option>\r\n          <option value=\"Sandals\">Sandals</option>\r\n          <option value=\"SportsShoe\">Sports Shoe</option>\r\n        </select>\r\n        <select id=\"FilterPrice\" onchange=\"getSelectedValuePrice()\">\r\n          <option selected=\"selected\">Price</option>\r\n          <option value=\"Less Then 1000\">Less then 1000</option>\r\n          <option value=\"1000-3000\">1000-3000</option>\r\n          <option value=\"3000-5000\">3000-5000</option>\r\n          <option value=\"5000-10000\">5000-10000</option>\r\n        </select>\r\n        <select id=\"FilterGender\" onchange=\"getSelectedValueGender()\">\r\n          <option selected=\"selected\">Gender</option>\r\n          <option value=\"Male\">Male</option>\r\n          <option value=\"Female\">Female</option>\r\n        </select>\r\n        <select id=\"FilterSize\" onchange=\"getSelectedValueSize()\">\r\n          <option selected=\"selected\">Size</option>\r\n          <option value=\"5\">5</option>\r\n          <option value=\"6\">6</option>\r\n          <option value=\"7\">7</option>\r\n          <option value=\"8\">8</option>\r\n          <option value=\"9\">9</option>\r\n          <option value=\"10\">10</option>\r\n        </select>\r\n        <select id=\"FilterColor\" onchange=\"getSelectedValueColor()\">\r\n          <option selected=\"selected\">Color</option>\r\n          <option value=\"Red\">Red</option>\r\n          <option value=\"Green\">Green</option>\r\n          <option value=\"Black\">Black</option>\r\n\r\n          <option value=\"Blue\">Blue</option>\r\n          <option value=\"Grey\">Grey</option>\r\n          \r\n        </select>\r\n      </div>\r\n    </div>\r\n  </div>\r\n  ");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.GridProductCard.class.getName(), obj());
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_global_model, "product");
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
                            out.write("<div class=\"cmp-product-grid-container\"");
                            {
                                Object var_attrvalue7 = renderContext.getObjectModel().resolveProperty(_dynamic_item, "color");
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
                            out.write(">");
                            if (var_collectionvar0_list_coerced$ == null) {
                                var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                            }
                            long var_index11 = 0;
                            for (Object item : var_collectionvar0_list_coerced$) {
                                {
                                    boolean var_traversal13 = (((var_index11 >= 0) && (var_index11 <= var_end5)) && true);
                                    if (var_traversal13) {
                                        out.write("\r\n    <div");
                                        {
                                            String var_attrcontent14 = ((((((((((("cmp-product-grid-item " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "id"), "attribute"))) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "category"), "attribute"))) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "color"), "attribute"))) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "size"), "attribute"))) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "producttype"), "attribute"))) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "gender"), "attribute")));
                                            out.write(" class=\"");
                                            out.write(renderContext.getObjectModel().toString(var_attrcontent14));
                                            out.write("\"");
                                        }
                                        out.write(">\r\n      <div class=\"card\">\r\n        <div class=\"cmp-product-grid-item-image\">\r\n          <img");
                                        {
                                            String var_attrcontent15 = ("cmp-product-grid-item-image-img " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "id"), "attribute")));
                                            out.write(" class=\"");
                                            out.write(renderContext.getObjectModel().toString(var_attrcontent15));
                                            out.write("\"");
                                        }
                                        {
                                            Object var_attrvalue16 = renderContext.getObjectModel().resolveProperty(item, "image");
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
                                        out.write(" alt=\"\"/>\r\n        </div>\r\n        <div");
                                        {
                                            String var_attrcontent20 = ("cmp-product-grid-item-discount " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "id"), "attribute")));
                                            out.write(" class=\"");
                                            out.write(renderContext.getObjectModel().toString(var_attrcontent20));
                                            out.write("\"");
                                        }
                                        out.write(">");
                                        {
                                            String var_21 = (("\r\n          " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "title"), "text"))) + "\r\n        ");
                                            out.write(renderContext.getObjectModel().toString(var_21));
                                        }
                                        out.write("</div>\r\n\r\n        <div");
                                        {
                                            String var_attrcontent22 = ("cmp-product-grid-item-price " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "id"), "attribute")));
                                            out.write(" class=\"");
                                            out.write(renderContext.getObjectModel().toString(var_attrcontent22));
                                            out.write("\"");
                                        }
                                        out.write(">");
                                        {
                                            Object var_23 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "price"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_23));
                                        }
                                        out.write("</div>\r\n        <div");
                                        {
                                            String var_attrcontent24 = ("cmp-product-grid-item-card-botton " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "id"), "attribute")));
                                            out.write(" class=\"");
                                            out.write(renderContext.getObjectModel().toString(var_attrcontent24));
                                            out.write("\"");
                                        }
                                        out.write(">");
                                        {
                                            String var_25 = (("\r\n          " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "button"), "text"))) + "\r\n        ");
                                            out.write(renderContext.getObjectModel().toString(var_25));
                                        }
                                        out.write("</div>\r\n      </div>\r\n    </div>\r\n  ");
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
out.write("\r\n</div>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

