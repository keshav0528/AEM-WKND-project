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
package org.apache.sling.scripting.sightly.apps.wknd.components.filter_dropdown;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class filter_dropdown__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("\r\n<div class=\"cmp-filter-dropdown-product-filter\">\r\n    <h1>Security Products</h1>\r\n    <div class=\"sort\">\r\n      <div class=\"cmp-filter-dropdown-collection-sort\">\r\n        <label>Filter by:</label>\r\n        <select id=\"FilterCategory\" onchange=\"getSelectedValueCategory()\">\r\n          <option selected=\"selected\">Category</option>\r\n          <option value=\"FOOTWEAR\">FOOTWEAR</option>\r\n          <option value=\"Apparel\">Apparel</option>\r\n          <option value=\"Accessories\">Accessories</option>\r\n        </select>\r\n        <select id=\"FilterProductType\" onchange=\"getSelectedValueProductType()\">\r\n          <option selected=\"selected\">Product Type</option>\r\n          <option value=\"Bag\">Bag</option>\r\n          <option value=\"Cap\">Cap</option>\r\n          <option value=\"Sandals\">Sandals</option>\r\n          <option value=\"SportsShoe\">Sports Shoe</option>\r\n         \r\n        </select>\r\n        <select id=\"FilterPrice\" onchange=\"getSelectedValuePrice()\">\r\n          <option selected=\"selected\">Price</option>\r\n          <option value=\"Less Then 1000\">Less then 1000</option>\r\n          <option value=\"1000-3000\">1000-3000</option>\r\n          <option value=\"3000-5000\">3000-5000</option>\r\n          <option value=\"5000-10000\">5000-10000</option>\r\n        </select>\r\n        <select id=\"FilterGender\" onchange=\"getSelectedValueGender()\">\r\n          <option selected=\"selected\">Gender</option>\r\n          <option value=\"Male\">Male</option>\r\n          <option value=\"Female\">Female</option>\r\n        </select>\r\n        <select id=\"list\" onchange=\"getSelectedValue()\">\r\n          <option selected=\"selected\">Size</option>\r\n          <option value=\"camera\">Camera</option>\r\n          <option value=\"dvr\">DVR</option>\r\n        </select>\r\n        <select id=\"FilterColor\" onchange=\"getSelectedValueColor()\">\r\n          <option selected=\"selected\">ColorValue</option>\r\n          <option value=\"Red\">Red</option>\r\n          <option value=\"Green\">Green</option>\r\n          <option value=\"Black\">Black</option>\r\n\r\n          <option value=\"Blue\">Blue</option>\r\n\r\n        </select>\r\n      </div>\r\n    </div>\r\n</div>\r\n\r\n<section class=\"cmp-filter-dropdown-product\">\r\n    <div class=\"cmp-filter-dropdown-product-card camera\">\r\n        <div class=\"cmp-filter-dropdown-img\"> \r\n            <h4 id=\"item-description\">CAMERA</h4>\r\n            <img");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "image");
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
out.write("/>\r\n          </div>\r\n          <div class=\"product-info\">\r\n            <h5>Hikvision ColorVu Series</h5>\r\n            <h6>$99.99</h6>\r\n          </div>\r\n    </div>\r\n    <div class=\"product-card dvr\">\r\n        <div class=\"product-image\">\r\n            <h4 id=\"item-description\">DVR</h4>\r\n            <img");
{
    Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "image");
    {
        Object var_attrcontent5 = renderContext.call("xss", var_attrvalue4, "uri");
        {
            boolean var_shoulddisplayattr7 = (((null != var_attrcontent5) && (!"".equals(var_attrcontent5))) && ((!"".equals(var_attrvalue4)) && (!((Object)false).equals(var_attrvalue4))));
            if (var_shoulddisplayattr7) {
                out.write(" src");
                {
                    boolean var_istrueattr6 = (var_attrvalue4.equals(true));
                    if (!var_istrueattr6) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent5));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("/>\r\n        </div>\r\n        <div class=\"product-info\">\r\n            <h5>Hikvision Value Series</h5>\r\n            <h6>$99.99</h6>\r\n        </div>\r\n      </div>\r\n      <div class=\"product-card camera\">\r\n        <div class=\"product-image\">\r\n          <h4 id=\"item-description\">CAMERA</h4>\r\n          <img");
{
    Object var_attrvalue8 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "image");
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
out.write("/>\r\n        </div>\r\n        <div class=\"product-info\">\r\n          <h5>Hikvision ColorVu Series</h5>\r\n          <h6>$99.99</h6>\r\n        </div>\r\n      </div>\r\n      <div class=\"product-card camera\">\r\n        <div class=\"product-image\">\r\n          <h4 id=\"item-description\">CAMERA</h4>\r\n          <img");
{
    Object var_attrvalue12 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "image");
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
out.write("/>\r\n        </div>\r\n        <div class=\"product-info\">\r\n          <h5>Hikvision ColorVu Series</h5>\r\n          <h6>$99.99</h6>\r\n        </div>\r\n      </div>\r\n      <div class=\"product-card dvr\">\r\n        <div class=\"product-image\">\r\n            <h4 id=\"item-description\">DVR</h4>\r\n            <img");
{
    Object var_attrvalue16 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "image");
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
out.write("/>\r\n        </div>\r\n        <div class=\"product-info\">\r\n            <h5>Hikvision Value Series</h5>\r\n            <h6>$99.99</h6>\r\n        </div>\r\n      </div>\r\n      <div class=\"product-card dvr\">\r\n        <div class=\"product-image\">\r\n            <h4 id=\"item-description\">DVR</h4>\r\n             <img");
{
    Object var_attrvalue20 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "image");
    {
        Object var_attrcontent21 = renderContext.call("xss", var_attrvalue20, "uri");
        {
            boolean var_shoulddisplayattr23 = (((null != var_attrcontent21) && (!"".equals(var_attrcontent21))) && ((!"".equals(var_attrvalue20)) && (!((Object)false).equals(var_attrvalue20))));
            if (var_shoulddisplayattr23) {
                out.write(" src");
                {
                    boolean var_istrueattr22 = (var_attrvalue20.equals(true));
                    if (!var_istrueattr22) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent21));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("/>\r\n        </div>\r\n        <div class=\"product-info\">\r\n            <h5>Hikvision Value Series</h5>\r\n            <h6>$99.99</h6>\r\n        </div>\r\n      </div>\r\n</section>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

