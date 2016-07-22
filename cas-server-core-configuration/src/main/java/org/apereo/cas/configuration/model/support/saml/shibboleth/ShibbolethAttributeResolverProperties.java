package org.apereo.cas.configuration.model.support.saml.shibboleth;

import com.google.common.collect.Lists;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.List;

/**
 * This is {@link ShibbolethAttributeResolverProperties}.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */

public class ShibbolethAttributeResolverProperties {
    
    private List<Resource> resources = Lists.newArrayList(new ClassPathResource("attribute-resolver.xml"));

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(final List<Resource> resources) {
        this.resources = resources;
    }
}
