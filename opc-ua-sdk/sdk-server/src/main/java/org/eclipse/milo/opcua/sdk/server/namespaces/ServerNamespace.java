/*
 * Copyright (c) 2019 the Eclipse Milo Authors
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package org.eclipse.milo.opcua.sdk.server.namespaces;

import java.util.List;

import org.eclipse.milo.opcua.sdk.server.OpcUaServer;
import org.eclipse.milo.opcua.sdk.server.api.DataItem;
import org.eclipse.milo.opcua.sdk.server.api.ManagedNamespaceWithLifecycle;
import org.eclipse.milo.opcua.sdk.server.api.MonitoredItem;
import org.eclipse.milo.opcua.sdk.server.diagnostics.DiagnosticsManager;
import org.eclipse.milo.opcua.sdk.server.util.SubscriptionModel;

public class ServerNamespace extends ManagedNamespaceWithLifecycle {

    private final SubscriptionModel subscriptionModel;
    private final DiagnosticsManager diagnosticsManager;

    public ServerNamespace(OpcUaServer server) {
        super(server, server.getConfig().getApplicationUri());

        subscriptionModel = new SubscriptionModel(server, this);
        diagnosticsManager = new DiagnosticsManager(server, getNodeFactory(), getNodeManager());

        getLifecycleManager().addStartupTask(() -> VendorServerInfoNodes.add(getNodeContext()));
        getLifecycleManager().addLifecycle(subscriptionModel);
        getLifecycleManager().addLifecycle(diagnosticsManager);
    }

    @Override
    public void onDataItemsCreated(List<DataItem> dataItems) {
        subscriptionModel.onDataItemsCreated(dataItems);
    }

    @Override
    public void onDataItemsModified(List<DataItem> dataItems) {
        subscriptionModel.onDataItemsModified(dataItems);
    }

    @Override
    public void onDataItemsDeleted(List<DataItem> dataItems) {
        subscriptionModel.onDataItemsDeleted(dataItems);
    }

    @Override
    public void onMonitoringModeChanged(List<MonitoredItem> monitoredItems) {
        subscriptionModel.onMonitoringModeChanged(monitoredItems);
    }

}
