package com.andersonlucier.android.metashot.databaseservicelib.impl;

import com.andersonlucier.android.metashot.databaseservicelib.interfaces.shots.IGraph;

import java.util.List;

/**
 * Created by SyberDeskTop on 3/12/2018.
 */

public class GraphRecords implements IGraph {

    private List<GraphRecord> _graph;

    @Override
    public List<GraphRecord> getGraph() {
        return _graph;
    }

    public void addGraph(GraphRecord graph) {
        _graph.add(graph);
    }
}