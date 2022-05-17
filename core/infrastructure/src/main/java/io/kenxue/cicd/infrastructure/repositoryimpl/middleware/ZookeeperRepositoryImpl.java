package io.kenxue.cicd.infrastructure.repositoryimpl.middleware;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.kenxue.cicd.coreclient.dto.middleware.zookeeper.ZookeeperListQry;
import io.kenxue.cicd.coreclient.dto.middleware.zookeeper.ZookeeperPageQry;
import io.kenxue.cicd.domain.domain.middleware.Zookeeper;
import io.kenxue.cicd.domain.repository.middleware.ZookeeperRepository;
import io.kenxue.cicd.infrastructure.repositoryimpl.middleware.database.convertor.Zookeeper2DOConvector;
import io.kenxue.cicd.infrastructure.repositoryimpl.middleware.database.dataobject.ZookeeperDO;
import io.kenxue.cicd.infrastructure.repositoryimpl.middleware.database.mapper.ZookeeperMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.baomidou.mybatisplus.core.metadata.IPage;
import io.kenxue.cicd.coreclient.dto.common.page.Page;
import com.baomidou.mybatisplus.extension.plugins.pagination.PageDTO;
import javax.annotation.Resource;
import java.util.List;

/**
 * 基建中间件zk
 * @author steakliu
 * @date 2022-05-15 16:46:02
 */
@Slf4j
@Component
public class ZookeeperRepositoryImpl implements ZookeeperRepository {

    @Resource
    private ZookeeperMapper zookeeperMapper;
    @Resource
    private Zookeeper2DOConvector zookeeper2DOConvector;

    public void create(Zookeeper zookeeper){
            zookeeperMapper.insert(zookeeper2DOConvector.toDO(zookeeper));
    }

    public void update(Zookeeper zookeeper){
            zookeeperMapper.updateById(zookeeper2DOConvector.toDO(zookeeper));
    }

    public Zookeeper getById(Long id){
        return zookeeper2DOConvector.toDomain(zookeeperMapper.selectById(id));
    }

    @Override
    public List<Zookeeper> list(ZookeeperListQry zookeeperListQry) {
        QueryWrapper<ZookeeperDO> qw = new QueryWrapper<>();
        qw.eq("deleted",false);
        return zookeeper2DOConvector.toDomainList(zookeeperMapper.selectList(qw));
    }

    @Override
    public Page<Zookeeper> page(ZookeeperPageQry qry) {
        QueryWrapper<ZookeeperDO> qw = new QueryWrapper<>();
        qw.eq("deleted",false);
        IPage doPage = zookeeperMapper.selectPage(new PageDTO(qry.getPageIndex(), qry.getPageSize()), qw);
        return Page.of(doPage.getCurrent(),doPage.getSize(),doPage.getTotal(),zookeeper2DOConvector.toDomainList(doPage.getRecords()));
    }
}
