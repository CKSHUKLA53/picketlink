/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.picketlink.test.scim.endpoints;

import org.picketlink.scim.endpoints.ResourceEndpoint;
import org.picketlink.scim.endpoints.ResourceTypeEndpoint;
import org.picketlink.scim.endpoints.SchemaEndpoint;
import org.picketlink.scim.endpoints.ServiceProviderConfigurationEndpoint;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Pedro Igor
 */
@ApplicationPath("/rest")
public class SCIMApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> clazzes = new HashSet<Class<?>>();

        clazzes.add(SchemaEndpoint.class);
        clazzes.add(ResourceTypeEndpoint.class);
        clazzes.add(ResourceEndpoint.class);
        clazzes.add(ServiceProviderConfigurationEndpoint.class);

        return clazzes;
    }

}
