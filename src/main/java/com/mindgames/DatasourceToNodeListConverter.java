package com.mindgames;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cons on 04/04/16.
 */
public class DatasourceToNodeListConverter extends CustomConverter<List<Datasource>, List<Node>> {
    public List<Node> convert(List<Datasource> source, Type<? extends List<Node>> destinationType) {
        System.out.print(source);
        List<Node> nodes = new ArrayList<Node>();
        nodes.add(new Node("blah"));
        nodes.add(new Node("meow"));
        nodes.add(new Node("blub"));
        return nodes;
    }
}
