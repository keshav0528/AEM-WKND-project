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
package org.apache.sling.scripting.sightly.apps.wknd.components.text__002d__below__002d__image;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class text__002d__below__002d__image__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("<div class=\"cmp-below\">\n  <div class=\"cmp-below-img\">\n    <img");
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
out.write("/>\n\n    <div class=\"cmp-below-img__text\">");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "text"), "html");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</div>\n  </div>\n\n  <div class=\"cmp-below-img2\">\n    <img");
{
    Object var_attrvalue5 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "image2");
    {
        Object var_attrcontent6 = renderContext.call("xss", var_attrvalue5, "uri");
        {
            boolean var_shoulddisplayattr8 = (((null != var_attrcontent6) && (!"".equals(var_attrcontent6))) && ((!"".equals(var_attrvalue5)) && (!((Object)false).equals(var_attrvalue5))));
            if (var_shoulddisplayattr8) {
                out.write(" src");
                {
                    boolean var_istrueattr7 = (var_attrvalue5.equals(true));
                    if (!var_istrueattr7) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent6));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("/>\n\n    <div class=\"cmp-below-img2__text\">");
{
    Object var_9 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "text2"), "html");
    out.write(renderContext.getObjectModel().toString(var_9));
}
out.write("</div>\n  </div>\n</div>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

