package com.cdt.mbg.mapper;

import com.cdt.mbg.model.PunchRecord;
import com.cdt.mbg.model.PunchRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PunchRecordMapper {
    long countByExample(PunchRecordExample example);

    int deleteByExample(PunchRecordExample example);

    int insert(PunchRecord record);

    int insertSelective(PunchRecord record);

    List<PunchRecord> selectByExample(PunchRecordExample example);

    int updateByExampleSelective(@Param("record") PunchRecord record, @Param("example") PunchRecordExample example);

    int updateByExample(@Param("record") PunchRecord record, @Param("example") PunchRecordExample example);
}