/*
 * Copyright 2013-2015, Teradata, Inc. All rights reserved.
 */
package com.teradata.test.query;

import com.teradata.test.context.State;

import java.util.Optional;

import static org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;

/**
 * Contains configuration required to connect to a JDBC server.
 */
public class JdbcConnectivityParamsState
        implements State
{
    private final String name;
    public final String driverClass;
    public final String url;
    public final String user;
    public final String password;
    public final boolean pooling;
    public final Optional<String> jar;

    public JdbcConnectivityParamsState(String name, String driverClass, String url, String user, String password, boolean pooling, Optional<String> jar)
    {
        this.name = name;
        this.driverClass = driverClass;
        this.url = url;
        this.user = user;
        this.password = password;
        this.pooling = pooling;
        this.jar = jar;
    }

    @Override
    public Optional<String> getName()
    {
        return Optional.of(name);
    }

    @Override
    public boolean equals(Object o)
    {
        return reflectionEquals(this, o);
    }

    @Override
    public int hashCode()
    {
        return reflectionHashCode(this);
    }

    @Override
    public String toString()
    {
        return reflectionToString(this);
    }
}