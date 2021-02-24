module org.eclipse.milo.opcua.sdk.server {
    requires io.netty.buffer;
    requires java.management;
    requires java.xml;
    requires jdk.management;
    requires slf4j.api;

    requires transitive com.google.common;
    requires transitive io.netty.common;
    requires transitive jsr305;
    requires transitive org.eclipse.milo.opcua.sdk.core;
    requires transitive org.eclipse.milo.opcua.stack.core;
    requires transitive org.eclipse.milo.opcua.stack.server;

    exports org.eclipse.milo.opcua.sdk.server;
    exports org.eclipse.milo.opcua.sdk.server.annotations;
    exports org.eclipse.milo.opcua.sdk.server.api;
    exports org.eclipse.milo.opcua.sdk.server.api.config;
    exports org.eclipse.milo.opcua.sdk.server.api.methods;
    exports org.eclipse.milo.opcua.sdk.server.api.services;
    exports org.eclipse.milo.opcua.sdk.server.diagnostics;
    exports org.eclipse.milo.opcua.sdk.server.diagnostics.objects;
    exports org.eclipse.milo.opcua.sdk.server.diagnostics.variables;
    exports org.eclipse.milo.opcua.sdk.server.events;
    exports org.eclipse.milo.opcua.sdk.server.events.conversions;
    exports org.eclipse.milo.opcua.sdk.server.events.operators;
    exports org.eclipse.milo.opcua.sdk.server.identity;
    exports org.eclipse.milo.opcua.sdk.server.items;
    exports org.eclipse.milo.opcua.sdk.server.model;
    exports org.eclipse.milo.opcua.sdk.server.model.methods;
    exports org.eclipse.milo.opcua.sdk.server.model.nodes.objects;
    exports org.eclipse.milo.opcua.sdk.server.model.nodes.variables;
    exports org.eclipse.milo.opcua.sdk.server.model.types.objects;
    exports org.eclipse.milo.opcua.sdk.server.model.types.variables;
    exports org.eclipse.milo.opcua.sdk.server.namespaces;
    exports org.eclipse.milo.opcua.sdk.server.namespaces.loader;
    exports org.eclipse.milo.opcua.sdk.server.nodes;
    exports org.eclipse.milo.opcua.sdk.server.nodes.delegates;
    exports org.eclipse.milo.opcua.sdk.server.nodes.factories;
    exports org.eclipse.milo.opcua.sdk.server.nodes.filters;
    exports org.eclipse.milo.opcua.sdk.server.services;
    exports org.eclipse.milo.opcua.sdk.server.services.helpers;
    exports org.eclipse.milo.opcua.sdk.server.subscriptions;
    exports org.eclipse.milo.opcua.sdk.server.util;
}