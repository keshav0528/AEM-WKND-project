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
package org.apache.sling.scripting.sightly.apps.wknd.components.heroanimation;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class heroanimation__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write("<div class=\"cmp-tile\">\r\n  <img alt=\"\" class=\"cmp-tile-tile__img cmp-tile-tile__img--first\"/>\r\n  <img alt=\"\" class=\"cmp-tile-tile__img cmp-tile-tile__img--last\"/>\r\n\r\n  <div class=\"cmp-tile-title\">\r\n    &nbsp;<br/>&nbsp;\r\n    <div class=\"cmp-tile-title__container\">\r\n      <div class=\"cmp-tile-title__text cmp-tile-title__text--first\"></div>\r\n      <div class=\"cmp-tile-title__text cmp-tile-title__text--last\"></div>\r\n    </div>\r\n  </div>\r\n</div>\r\n\r\n<button class=\"cmp-tile-next-tile\">\r\n  <span class=\"cmp-tile-next-tile__details\">\r\n    <span class=\"cmp-tile-next-tile__heading\">Up next</span>\r\n    <span class=\"cmp-tile-next-tile__title\">\r\n      &nbsp; <br/>&nbsp;\r\n      <span class=\"cmp-tile-next-tile__title__text cmp-tile-next-tile__title__text--first\"></span>\r\n      <span class=\"cmp-tile-next-tile__title__text cmp-tile-next-tile__title__text--last\"></span>\r\n    </span>\r\n    <svg class=\"cmp-tile-next-tile__arrow\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" x=\"0px\" y=\"0px\" viewBox=\"0 0 42.6 20.1\" style=\"enable-background: new 0 0 42.6 20.1\" xml:space=\"preserve\">\r\n      <path class=\"st0\" d=\"M0,8.2h35.5l-5.6-5.6L32.5,0l10.1,10.1L32.5,20.1l-2.6-2.6l5.6-5.6H0V8.2z\"/>\r\n    </svg>\r\n    <div class=\"cmp-tile-test-arrow\"></div>\r\n  </span>\r\n  <span class=\"cmp-tile-next-tile__preview\">\r\n\r\n    <img class=\"cmp-tile-next-tile__preview__img cmp-tile-next-tile__preview__img--first\" alt=\"\"/>\r\n    <img class=\"cmp-tile-next-tile__preview__img cmp-tile-next-tile__preview__img--last\" alt=\"\"/>\r\n  </span>\r\n</button>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

