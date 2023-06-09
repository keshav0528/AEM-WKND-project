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
package org.apache.sling.scripting.sightly.apps.wknd.components.form_dropdown;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class form_dropdown__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("\r\n\r\n    <div class=\"cmp-dropdown-form\">\r\n        <h1 class=\"cmp-drop-down-form-h1\">\r\n           \r\n        </h1>\r\n        ");
{
    Object var_testvariable0 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title");
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<div></div>");
    }
}
out.write("\r\n        ");
{
    Object var_testvariable1 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "subtitle");
    if (renderContext.getObjectModel().toBoolean(var_testvariable1)) {
        out.write("<div></div>");
    }
}
out.write("\r\n        ");
{
    Object var_testvariable2 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "gender");
    if (renderContext.getObjectModel().toBoolean(var_testvariable2)) {
        out.write("<div></div>");
    }
}
out.write("\r\n      \r\n    </div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

