package com.zx.mes.service.impl;

import com.zx.mes.pageModel.Presource;
import com.zx.mes.pageModel.SessionInfo;
import com.zx.mes.pageModel.Tree;
import com.zx.mes.service.ResourceServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hyl on 17/6/12.
 */
@Service
public class ResourceServiceImpl implements ResourceServiceI {

    public List<Tree> tree(SessionInfo sessionInfo) {
        return null;
    }

    public List<Tree> allTree(SessionInfo sessionInfo) {
        return null;
    }

    public List<Presource> treeGrid(SessionInfo sessionInfo) {
        return null;
    }

    public void add(Presource resource, SessionInfo sessionInfo) {

    }

    public void delete(String id) {

    }

    public void edit(Presource resource) {

    }

    public Presource get(String id) {
        return null;
    }
}
