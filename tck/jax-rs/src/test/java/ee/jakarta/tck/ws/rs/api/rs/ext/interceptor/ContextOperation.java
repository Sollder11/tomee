/*
 * Copyright (c) 2012, 2021 Oracle and/or its affiliates. All rights reserved.
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

package ee.jakarta.tck.ws.rs.api.rs.ext.interceptor;

import jakarta.annotation.Priority;
import jakarta.ws.rs.ext.Provider;

@Provider
@Priority(100)
/**
 * These annotations are to get them set in InterceptorBodyOne#setAnnotations()
 */
public enum ContextOperation {
  GETANNOTATIONS, GETGENERICTYPE, GETMEDIATYPE, GETPROPERTY, GETPROPERTYNAMES, GETPROPERTYNAMESISREADONLY, GETTYPE, REMOVEPROPERTY, SETANNOTATIONS, SETANNOTATIONSNULL, SETGENERICTYPE, SETMEDIATYPE, SETPROPERTY, SETPROPERTYNULL, SETTYPE, IOEXCEPTION, WEBAPPLICATIONEXCEPTION
}
