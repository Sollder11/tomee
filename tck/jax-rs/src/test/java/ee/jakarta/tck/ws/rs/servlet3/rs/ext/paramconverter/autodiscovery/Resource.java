/*
 * Copyright (c) 2012, 2018, 2021 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package ee.jakarta.tck.ws.rs.servlet3.rs.ext.paramconverter.autodiscovery;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;
import ee.jakarta.tck.ws.rs.common.provider.StringBean;

@Path("resource")
public class Resource {
  public static final String HEADER_NAME = "Converter";

  @Path("sbquery")
  @GET
  public String stringBeanQuery(@QueryParam("query") StringBean param) {
    return param.get();
  }

  @GET
  public Response get() {
    return Response.ok().header(HEADER_NAME, new StringBean("OK")).build();
  }

}