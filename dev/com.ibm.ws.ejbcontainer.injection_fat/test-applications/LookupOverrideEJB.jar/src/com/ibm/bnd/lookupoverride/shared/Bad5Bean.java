/*******************************************************************************
 * Copyright (c) 2010, 2021 IBM Corporation and others.
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

// Bean with an invalid @EJB reference

package com.ibm.bnd.lookupoverride.shared;

import javax.ejb.Stateless;

@Stateless
public class Bad5Bean implements Bad {

    // invalid combination of references, specifying 
    // an <ejb-local-ref> with <lookup-name> associated with this bean, and
    // an <ejb-local-ref> with <ejb-link>    associated with this bean's interceptor

    TargetBean ivTarget5;

    // Not expected to succeed
    @Override
    public int boing() {

        return 60;

    }

}
