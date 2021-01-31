/**
 * Copyright (c) 2010-2021 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.remoteopenhab.internal.exceptions;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;

/**
 * Exceptions thrown by this binding.
 *
 * @author Laurent Garnier - Initial contribution
 */
@NonNullByDefault
@SuppressWarnings("serial")
public class RemoteopenhabException extends Exception {

    public RemoteopenhabException(@Nullable String message) {
        super(message);
    }

    public RemoteopenhabException(@Nullable String message, @Nullable Throwable cause) {
        super(message, cause);
    }

    public RemoteopenhabException(@Nullable Throwable cause) {
        super(cause);
    }
}