package com.easyink.wecom.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.easyink.wecom.domain.WeOperationsCenterSopScopeEntity;
import com.easyink.wecom.domain.vo.sop.WeOperationsCenterSopScopeVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.List;

/**
 * SOP作用范围
 *
 * @author 佚名
 * @date 2021-11-30 14:05:22
 */
@Repository
public interface WeOperationsCenterSopScopeMapper extends BaseMapper<WeOperationsCenterSopScopeEntity> {

    /**
     * 查询SOP下的数据
     *
     * @param corpId 企业ID
     * @param sopId  sopId
     * @return List<WeOperationsCenterSopScopeVO>
     */
    List<WeOperationsCenterSopScopeVO> selectByCorpIdAndSopId(@Param("corpId") String corpId, @Param("sopId") Long sopId);

    /**
     * 批量新增数据
     *
     * @param list list
     */
    void batchSaveOrUpdate(List<WeOperationsCenterSopScopeEntity> list);

    /**
     * 根据目标id列表，查询对应的sopid列表
     *
     * @param corpId     企业id
     * @param userIdList 员工id列表
     * @return sopId列表
     */
    HashSet<Long> selectSopIdsByUseIdList(@Param("corpId") String corpId, @Param("userIdList") List<String> userIdList);
}
