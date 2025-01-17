/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cdancy.jenkins.rest.exception;

/**
 * Thrown when an action has breached the licensed user limit of the server, or
 * degrading the authenticated user's permission level.
 */
public class RedirectTo404Exception extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public RedirectTo404Exception() {
      super();
    }

    public RedirectTo404Exception(final String arg0, final Throwable arg1) {
      super(arg0, arg1);
    }

    public RedirectTo404Exception(final String arg0) {
      super(arg0);
    }

    public RedirectTo404Exception(final Throwable arg0) {
      super(arg0);
    }
}
