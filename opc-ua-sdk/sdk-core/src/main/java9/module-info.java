module org.eclipse.milo.opcua.sdk.core {
    requires slf4j.api;

    requires transitive com.google.common;
    requires transitive jsr305;
    requires transitive org.eclipse.milo.opcua.stack.core;

    exports org.eclipse.milo.opcua.sdk.core;
    exports org.eclipse.milo.opcua.sdk.core.nodes;
    exports org.eclipse.milo.opcua.sdk.core.util;
}