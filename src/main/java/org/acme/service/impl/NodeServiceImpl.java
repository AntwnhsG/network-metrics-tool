package org.acme.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.RequiredArgsConstructor;
import org.acme.entity.Node;
import org.acme.repository.BaseRepository;
import org.acme.repository.NodeRepository;
import org.acme.service.NodeService;

@ApplicationScoped
@RequiredArgsConstructor
public class NodeServiceImpl extends BaseServiceImpl<Node> implements NodeService {

    @Inject
    NodeRepository nodeRepository;
    @Override
    protected BaseRepository<Node, Integer> getRepository() {
        return nodeRepository;
    }
}
