package com.fnzb.dao.mapper;

import com.fnzb.dao.entity.Collect;

import java.util.List;

public interface CollectMapper {

    int inserCollect(Collect collect);

    int deleteCollectById(List<Long> id);

    Collect selectCollectById(Long id);

    List<Collect> selectCollectAll();
}