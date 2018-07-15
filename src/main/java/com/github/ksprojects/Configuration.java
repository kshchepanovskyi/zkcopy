package com.github.ksprojects;

import org.immutables.value.Value;

@Value.Immutable
public interface Configuration {

    String source();

    String target();

    int sessionTimeout();

    int workers();

    boolean copyOnly();

    boolean ignoreEphemeralNodes();
}
