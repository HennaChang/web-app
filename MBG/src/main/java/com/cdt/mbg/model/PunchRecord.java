package com.cdt.mbg.model;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PunchRecord implements Serializable {
    private String userId;

    private String deptCode;

    private String userName;

    private Date punchDate;

    private Date punchInTime;

    private Date punchOutTime;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private Date punchInDate;

    private Date punchOutDate;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", deptCode=").append(deptCode);
        sb.append(", userName=").append(userName);
        sb.append(", punchDate=").append(punchDate);
        sb.append(", punchInTime=").append(punchInTime);
        sb.append(", punchOutTime=").append(punchOutTime);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", punchInDate=").append(punchInDate);
        sb.append(", punchOutDate=").append(punchOutDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}