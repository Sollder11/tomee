/*
 * Copyright (c) 2013, 2021 Oracle and/or its affiliates. All rights reserved.
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

package ee.jakarta.tck.ws.rs.spec.filter.exception;

import java.io.IOException;

import jakarta.annotation.Priority;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.ext.Provider;

@Priority(51)
@Provider
public class PostMatchingThrowingFilter implements ContainerRequestFilter {

  public static final String EXCEPTION_FIRING_HEADER = "PostMatchingFilterThrowsException";

  @Override
  public void filter(ContainerRequestContext requestContext)
      throws IOException {
    String header = requestContext.getHeaderString(EXCEPTION_FIRING_HEADER);
    if (header != null)
      throw new RuntimeException(header);
  }

}
