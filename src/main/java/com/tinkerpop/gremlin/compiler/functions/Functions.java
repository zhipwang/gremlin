package com.tinkerpop.gremlin.compiler.functions;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public interface Functions {

    public Function getFunction(String functionName);

    public void addFunction(Function function);

    public String getNamespace();
}
