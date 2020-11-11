package com.lihaiyang.service;

import com.lihaiyang.entity.Artificer;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lihaiyang
 * @since 2020-11-06
 */
public interface ArtificerService {
    List<Artificer> list();

    Artificer getById(Long id);
}
