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
package org.apache.sling.scripting.sightly.apps.wknd.components.subheader;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class subheader__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("<div class=\"cmp-subheader\">\r\n    <div class=\"cmp-subheader-logo\">\r\n        <img src=\"https://cdn.about.puma.com/-/media/images/this-is-puma/header-thisispuma_karsten.jpg?as=1&h=384&iar=1&w=768&rev=01ce37c0ba5740a18507ad809dc382f7&hash=F532345BC57743F9CE3BDEEC553069A2\" alt=\"\" class=\"logo\"/>\r\n    </div>\r\n    <div class=\"cmp-subheader-subnavabar\">\r\n\r\n        <div class=\"cmp-subheader-submenu\">\r\n            <a href=\"#\" class=\"cmp-subheader-button\">");
{
    String var_0 = (" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "button1"), "html")));
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</a>\r\n            <a href=\"#\" class=\"cmp-subheader-button\">");
{
    String var_1 = (" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "button2"), "html")));
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</a>\r\n            <a href=\"#\" class=\"cmp-subheader-button\">");
{
    String var_2 = (" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "button3"), "html")));
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</a>\r\n        </div>\r\n    </div>\r\n\r\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

