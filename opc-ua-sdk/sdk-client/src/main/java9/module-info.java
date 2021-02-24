module org.eclipse.milo.opcua.sdk.client {
    requires io.netty.buffer;
    requires slf4j.api;
    requires strict.machine;

    requires transitive com.google.common;
    requires transitive io.netty.common;
    requires transitive io.netty.transport;
    requires transitive jsr305;
    requires transitive org.eclipse.milo.opcua.sdk.core;
    requires transitive org.eclipse.milo.opcua.stack.client;
    requires transitive org.eclipse.milo.opcua.stack.core;

    exports org.eclipse.milo.opcua.sdk.client;
    exports org.eclipse.milo.opcua.sdk.client.api;
    exports org.eclipse.milo.opcua.sdk.client.api.config;
    exports org.eclipse.milo.opcua.sdk.client.api.identity;
    exports org.eclipse.milo.opcua.sdk.client.api.services;
    exports org.eclipse.milo.opcua.sdk.client.api.subscriptions;
    exports org.eclipse.milo.opcua.sdk.client.methods;
    exports org.eclipse.milo.opcua.sdk.client.model;
    exports org.eclipse.milo.opcua.sdk.client.model.nodes.objects;
    exports org.eclipse.milo.opcua.sdk.client.model.nodes.variables;
    exports org.eclipse.milo.opcua.sdk.client.model.types.objects;
    exports org.eclipse.milo.opcua.sdk.client.model.types.variables;
    exports org.eclipse.milo.opcua.sdk.client.nodes;
    exports org.eclipse.milo.opcua.sdk.client.session;
    exports org.eclipse.milo.opcua.sdk.client.subscriptions;
}