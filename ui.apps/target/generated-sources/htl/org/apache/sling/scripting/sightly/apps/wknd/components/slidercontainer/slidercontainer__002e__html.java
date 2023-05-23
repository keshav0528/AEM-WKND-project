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
package org.apache.sling.scripting.sightly.apps.wknd.components.slidercontainer;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class slidercontainer__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("<div class=\"cmp-slider-container\">\r\n  <div class=\"cmp-slider-container-left-slide\">\r\n    <div style=\"background-color: #b99f8a\">\r\n      <h1>");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "headline"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h1>\r\n      <p>new collection</p>\r\n    </div>\r\n\r\n    <div class=\"cmp-slider-container-div\" style=\"background-color: #354f32\">\r\n      <h1>");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "headline2"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</h1>\r\n      <p>new collection</p>\r\n    </div>\r\n    <div class=\"cmp-slider-container-div\" style=\"background-color: #657e85\">\r\n      <h1>");
{
    Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "headline3"), "text");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</h1>\r\n      <p>new collection</p>\r\n    </div>\r\n    <div class=\"cmp-slider-container-div\" style=\"background-color: #2b2e32\">\r\n      <h1>");
{
    Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "headline4"), "text");
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</h1>\r\n      <p>new collection</p>\r\n    </div>\r\n  </div>\r\n\r\n  <div class=\"cmp-slider-container-right-slide\" id=\"slideRightid\">\r\n    <div class=\"cmp-slider-container-div\">\r\n      <img class=\"cmp-slider-container-right-slide-img\"");
{
    Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "image1");
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
out.write(" alt=\"\"/>\r\n    </div>\r\n    <div class=\"cmp-slider-container-div\">\r\n      <img class=\"cmp-slider-container-right-slide-img\"");
{
    Object var_attrvalue8 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "image2");
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
out.write(" alt=\"\"/>\r\n    </div>\r\n    <div class=\"cmp-slider-container-div\">\r\n      <img class=\"cmp-slider-container-right-slide-img\"");
{
    Object var_attrvalue12 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "image3");
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
out.write(" alt=\"\"/>\r\n    </div>\r\n    <div class=\"cmp-slider-container-div\">\r\n      <img class=\"cmp-slider-container-right-slide-img\"");
{
    Object var_attrvalue16 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "image4");
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
out.write(" alt=\"\"/>\r\n    </div>\r\n  </div>\r\n  <div class=\"cmp-slider-container-action-buttons\">\r\n    <button class=\"cmp-slider-container-action-buttons-down-button\">\r\n      <i class=\"fas fa-arrow-down\"></i>\r\n    </button>\r\n    <button class=\"cmp-slider-container-action-buttons-up-button\">\r\n      <i class=\"fas fa-arrow-up\"></i>\r\n    </button>\r\n  </div>\r\n</div>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

