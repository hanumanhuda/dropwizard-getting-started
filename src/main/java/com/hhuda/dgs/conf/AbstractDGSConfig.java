package com.hhuda.dgs.conf;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.dropwizard.Configuration;
import org.immutables.value.Value;

@Value.Immutable
@Value.Style(typeAbstract  = "Abstract*",
        typeImmutable = "*",
        visibility = Value.Style.ImplementationVisibility.PUBLIC)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize(as = DGSConfig.class)
@JsonDeserialize(as = DGSConfig.class)
public abstract class AbstractDGSConfig extends Configuration {
    abstract String getName();
}
