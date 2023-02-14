package com.cdt.mbg.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private String userId;

    private String name;

    private String englishName;

    private String deptCode;

    private String mail;

    private String joinday;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", englishName=").append(englishName);
        sb.append(", deptCode=").append(deptCode);
        sb.append(", mail=").append(mail);
        sb.append(", joinday=").append(joinday);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}