/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
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
package com.redhat;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import java.util.HashMap;

/**
 * This class is my {@link WorkItemHandler}
 *
 * @author Daniele Mammarella <dmammare@redhat.com>
 */
public class MyWorkItemHandler implements WorkItemHandler {

    public MyWorkItemHandler() {
    }

    public void executeWorkItem(
            final WorkItem workItem,
            final WorkItemManager manager) {
        System.out.println("executeWorkItem()!");
        manager.completeWorkItem(workItem.getId(), new HashMap<String, Object>());
    }

    @Override
    public void abortWorkItem(
            final WorkItem workItem,
            final WorkItemManager manager) {
        System.out.println("abortWorkItem()");
    }
}


