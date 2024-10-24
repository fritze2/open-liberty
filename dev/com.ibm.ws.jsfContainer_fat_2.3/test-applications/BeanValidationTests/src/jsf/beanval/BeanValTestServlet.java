/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package jsf.beanval;

import javax.faces.validator.BeanValidator;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Assert;
import org.junit.Test;

import componenttest.app.FATServlet;

@SuppressWarnings("serial")
@WebServlet("/BeanValTestServlet")
public class BeanValTestServlet extends FATServlet {

    @Test
    public void testValidatorInServletContext(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Object val = request.getServletContext().getAttribute(BeanValidator.VALIDATOR_FACTORY_KEY);
        Assert.assertNotNull(val);
    }

}
