module org.eclipse.milo.opcua.stack.core {
    requires java.xml.bind;
    requires org.slf4j;

    requires transitive com.google.common;
    requires transitive io.netty.buffer;
    requires transitive io.netty.common;
    requires transitive io.netty.transport;
    requires transitive java.xml;
    requires transitive jsr305;
    requires transitive org.bouncycastle.pkix;
    requires transitive org.bouncycastle.provider;

    exports org.eclipse.milo.opcua.stack.core;
    exports org.eclipse.milo.opcua.stack.core.channel;
    exports org.eclipse.milo.opcua.stack.core.channel.headers;
    exports org.eclipse.milo.opcua.stack.core.channel.messages;
    exports org.eclipse.milo.opcua.stack.core.security;
    exports org.eclipse.milo.opcua.stack.core.serialization;
    exports org.eclipse.milo.opcua.stack.core.serialization.codecs;
    exports org.eclipse.milo.opcua.stack.core.transport;
    exports org.eclipse.milo.opcua.stack.core.types;
    exports org.eclipse.milo.opcua.stack.core.types.builtin;
    exports org.eclipse.milo.opcua.stack.core.types.builtin.unsigned;
    exports org.eclipse.milo.opcua.stack.core.types.enumerated;
    exports org.eclipse.milo.opcua.stack.core.types.structured;
    exports org.eclipse.milo.opcua.stack.core.util;
    exports org.eclipse.milo.opcua.stack.core.util.annotations;
    exports org.eclipse.milo.opcua.stack.core.util.validation;
}