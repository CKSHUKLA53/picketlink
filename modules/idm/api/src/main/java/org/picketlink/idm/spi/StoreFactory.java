/*
 * JBoss, Home of Professional Open Source
 *
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.picketlink.idm.spi;

import org.picketlink.idm.config.IdentityStoreConfiguration.TypeOperation;
import org.picketlink.idm.config.IdentityStoreConfiguration;
import org.picketlink.idm.model.AttributedType;

/**
 * Creates IdentityStore instances based on a provided configuration
 *
 * @author Shane Bryzak
 *
 */
public interface StoreFactory {
    /**
     * Creates an instance of an IdentityStore using the provided configuration
     *
     * @param config
     * @return
     */
    <T extends IdentityStoreConfiguration> IdentityStore<T> createIdentityStore(T config, IdentityContext context);

    /**
     *
     * @param context
     * @param feature
     * @param operation
     * @return
     */
    <T extends IdentityStore<?>> T getStoreForType(Class<T> storeType, IdentityContext context, Class<? extends AttributedType> type,
            TypeOperation operation);

    /**
     *
     * @param context
     * @return
     */
    IdentityStore<?> getStoreForCredential(IdentityContext context);
}
