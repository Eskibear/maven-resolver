package org.eclipse.aether.util.concurrency;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Wraps a result value as a Future.
 *
 * @param <T> result type
 */
public class FutureResult<T>
    implements Future<T>
{
    private final T value;

    public FutureResult( T value )
    {
        this.value = value;
    }

    @Override
    public boolean cancel( boolean mayInterruptIfRunning )
    {
        return false;
    }

    @Override
    public boolean isCancelled()
    {
        return false;
    }

    @Override
    public boolean isDone()
    {
        return true;
    }

    @Override
    public T get()
    {
        return value;
    }

    @Override
    public T get( long timeout, TimeUnit unit )
    {
        return value;
    }
}
