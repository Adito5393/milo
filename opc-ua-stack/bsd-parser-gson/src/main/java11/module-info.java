module org.eclipse.milo.opcua.binaryschema.gson {
    requires transitive gson;
    requires transitive org.eclipse.milo.opcua.binaryschema.core;
    requires transitive org.eclipse.milo.opcua.binaryschema.parser;
    requires transitive org.eclipse.milo.opcua.stack.core;

    exports org.eclipse.milo.opcua.binaryschema.gson;
}