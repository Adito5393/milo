module org.eclipse.milo.opcua.stack.server {
    requires slf4j.api;

    requires transitive com.google.common;
    requires transitive io.netty.buffer;
    requires transitive io.netty.codec;
    requires transitive io.netty.codec.http;
    requires transitive io.netty.common;
    requires transitive io.netty.handler;
    requires transitive io.netty.transport;
    requires transitive jsr305;
    requires transitive org.eclipse.milo.opcua.stack.core;

    exports org.eclipse.milo.opcua.stack.server;
    exports org.eclipse.milo.opcua.stack.server.security;
    exports org.eclipse.milo.opcua.stack.server.services;
    exports org.eclipse.milo.opcua.stack.server.transport;
    exports org.eclipse.milo.opcua.stack.server.transport.http;
    exports org.eclipse.milo.opcua.stack.server.transport.tcp;
    exports org.eclipse.milo.opcua.stack.server.transport.uasc;
    exports org.eclipse.milo.opcua.stack.server.transport.websocket;
}