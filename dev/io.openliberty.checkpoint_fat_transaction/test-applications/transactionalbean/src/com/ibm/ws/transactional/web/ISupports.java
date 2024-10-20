/*******************************************************************************
 * Copyright (c) 2023 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.transactional.web;

public interface ISupports {
    public void basicSupports(TestContext tc, Throwable t) throws Throwable;

    public void supportsWithUTBegin(TestContext tc, Throwable t) throws Throwable;

    public void supportsWithUTCommit(TestContext tc, Throwable t) throws Throwable;

    public void supportsWithUTGetStatus(TestContext tc, Throwable t) throws Throwable;

    public void supportsWithUTRollback(TestContext tc, Throwable t) throws Throwable;

    public void supportsWithUTSetRollbackOnly(TestContext tc, Throwable t) throws Throwable;

    public void supportsWithUTSetTransactionTimeout(TestContext tc, Throwable t) throws Throwable;

    public void supportsWithRunUnderUOW(TestContext tc, Throwable t) throws Throwable;

    public void basicSupportsNoLists(TestContext tc, Throwable t) throws Throwable;
}