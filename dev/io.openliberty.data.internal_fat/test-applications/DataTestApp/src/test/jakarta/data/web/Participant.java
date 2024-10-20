/*******************************************************************************
 * Copyright (c) 2024 IBM Corporation and others.
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
package test.jakarta.data.web;

/**
 * An unannotated entity with a record attribute that should
 * be interpreted as an embeddable.
 */
public class Participant {

    public Integer id;

    public Name name;

    public static record Name(String first, String last) {
    }

    public static Participant of(String firstName, String lastName, int id) {
        Participant p = new Participant();
        p.id = id;
        p.name = new Name(firstName, lastName);
        return p;
    }
}
