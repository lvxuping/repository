package com.fh.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_oss")
public class Oss {
    @TableId(value = "id",type = IdType.AUTO)
    private int id;
    private String name;
    @TableField(value = "fileName")
    private String fileName;
}
