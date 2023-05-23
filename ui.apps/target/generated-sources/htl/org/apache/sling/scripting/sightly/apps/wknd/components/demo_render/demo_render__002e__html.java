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
package org.apache.sling.scripting.sightly.apps.wknd.components.demo_render;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class demo_render__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
Object _dynamic_currentpage = bindings.get("currentpage");
Object _dynamic_currentnode = bindings.get("currentnode");
out.write("<html>\r\n    <head>\r\n        <meta charset=\"utf-8\"/>\r\n    </head>\r\n\r\n    <body>\r\n        <h1>\r\n            Hello world\r\n\r\n        </h1>\r\n        <h3>\r\n            Properties\r\n        </h3>\r\n        <p>");
{
    String var_0 = (("\r\n            page title : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "jrc:title"), "text"))) + "\r\n        ");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</p>\r\n        <h3>\r\n            page details\r\n        </h3>\r\n        <p>");
{
    String var_1 = ("currentPage title : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "title"), "text")));
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p>\r\n        <p>");
{
    String var_2 = ("currentPage Name : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "name"), "text")));
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</p>\r\n        <p>");
{
    String var_3 = ("currentPage Path : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "path"), "text")));
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</p>\r\n        <p>");
{
    String var_4 = ("currentPage depth : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "depth"), "text")));
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</p>\r\n        <h3>\r\n            Node details \r\n        </h3>\r\n        \r\n        <p>");
{
    String var_5 = ("currentPage Name : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_currentnode, "name"), "text")));
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</p>\r\n        <p>");
{
    String var_6 = ("currentPage Path : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_currentnode, "path"), "text")));
    out.write(renderContext.getObjectModel().toString(var_6));
}
out.write("</p>\r\n        <p>");
{
    String var_7 = ("currentPage depth : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_currentnode, "depth"), "text")));
    out.write(renderContext.getObjectModel().toString(var_7));
}
out.write("</p>\r\n\r\n    </body>\r\n</html>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

