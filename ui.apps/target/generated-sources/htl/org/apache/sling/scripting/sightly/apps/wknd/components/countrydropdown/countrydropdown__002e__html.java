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
package org.apache.sling.scripting.sightly.apps.wknd.components.countrydropdown;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class countrydropdown__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("\n\n <div class=\"cmp-helloworld\" data-cmp-is=\"helloworld\">\n  \n    ");
{
    Object var_testvariable0 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "text");
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<div class=\"cmp-helloworld__item\">\n        <p class=\"cmp-helloworld__item-label\">Text property:</p>\n        <pre class=\"cmp-helloworld__item-output\" data-cmp-hook-helloworld=\"property\">");
        {
            Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "text"), "text");
            out.write(renderContext.getObjectModel().toString(var_1));
        }
        out.write("</pre>\n    </div>");
    }
}
out.write(" \n\n<!-- </div> -->\n");
{
    String var_2 = (((((("<!-- <div class=\"cmp-helloworld\">" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "text"), "comment"))) + "\n    <img src=\"") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "image"), "comment"))) + "\" alt=\"\">\n</div>\n<div>\n    <img src=\"") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "image"), "comment"))) + "\" alt=\"\">\n</div>\n<div class=\u201DHeader\u201D>\n    <h3 class=\u201DHeading\u201D>Shopping Cart</h3>\n    <h5 class=\u201DAction\u201D>Remove all</h5>\n    </div> -->");
    out.write(renderContext.getObjectModel().toString(var_2));
}
{
    String var_3 = (("\n\nCountry: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "countrylist"), "text"))) + "\n ");
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

