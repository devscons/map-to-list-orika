package com.mindgames;

import javafx.scene.chart.PieChart;
import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.Type;
import ma.glasnost.orika.metadata.TypeBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cons on 04/04/16.
 */
public class TestListToList {

    public static void main(String[] args){
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        Type<List<Datasource>> listOfDatasources = new TypeBuilder<List<Datasource>>() {}.build();
        Type<List<Node>> listOfNodes = new TypeBuilder<List<Node>>(){}.build();

        mapperFactory.getConverterFactory().registerConverter(new DatasourceToNodeListConverter());

        List<Datasource> datasources = new ArrayList<Datasource>();
        datasources.add(new Datasource("blah"));

        List<Node> nodes = mapperFactory.getMapperFacade(listOfDatasources, listOfNodes).map(datasources);

        System.out.println(nodes);
    }
}
