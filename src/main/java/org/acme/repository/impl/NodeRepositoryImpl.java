package org.acme.repository.impl;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.entity.BaseEntity;
import org.acme.entity.Node;
import org.acme.repository.NodeRepository;

@ApplicationScoped
public class NodeRepositoryImpl extends BaseRepositoryImpl<Node> implements NodeRepository {

    @Override
    protected Class<? extends BaseEntity> getTypeClass() {
        return Node.class;
    }

    @Override
    protected String getXmlFilePath() {
        return "data/nodes/nodes.xml";
    }

    @Override
    protected String getXsdFilePath() {
        return "data/nodes/nodes.xsd";
    }

}
