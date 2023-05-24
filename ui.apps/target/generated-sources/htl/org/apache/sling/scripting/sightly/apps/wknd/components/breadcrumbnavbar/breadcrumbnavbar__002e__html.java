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
package org.apache.sling.scripting.sightly.apps.wknd.components.breadcrumbnavbar;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class breadcrumbnavbar__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write("<link href=\"//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css\" rel=\"stylesheet\"/>\r\n\r\n<div class=\"cmp-breadcrumnavabr-container\">\r\n  <h1>made by keshav</h1>\r\n\r\n  <ul class=\"breadcrumb\">\r\n    <li>\r\n      <a href=\"#\">\r\n        <span class=\"icon icon-file\"></span>\r\n        <span class=\"text\">file</span>\r\n      </a>\r\n    </li>\r\n    <li>\r\n      <a href=\"#\">\r\n        <span class=\"icon icon-folder-open\"></span>\r\n        <span class=\"text\">folder</span>\r\n      </a>\r\n    </li>\r\n    <li>\r\n      <a href=\"#\">\r\n        <span class=\"icon icon-code\"></span>\r\n        <span class=\"text\">CSS 3</span>\r\n      </a>\r\n    </li>\r\n    <li>\r\n      <a href=\"#\">\r\n        <span class=\"icon icon-beaker\"></span>\r\n        <span class=\"text\">Lab</span>\r\n      </a>\r\n    </li>\r\n    <li>\r\n      <a href=\"#\">\r\n        <span class=\"icon icon-home\"></span>\r\n      </a>\r\n    </li>\r\n  </ul>\r\n</div>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

