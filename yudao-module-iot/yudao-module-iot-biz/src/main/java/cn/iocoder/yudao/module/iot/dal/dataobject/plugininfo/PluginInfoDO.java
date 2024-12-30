package cn.iocoder.yudao.module.iot.dal.dataobject.plugininfo;

import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;
import cn.iocoder.yudao.module.iot.enums.plugin.IotPluginDeployTypeEnum;
import cn.iocoder.yudao.module.iot.enums.plugin.IotPluginStatusEnum;
import cn.iocoder.yudao.module.iot.enums.plugin.IotPluginTypeEnum;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 * IoT 插件信息 DO
 *
 * @author 芋道源码
 */
@TableName("iot_plugin_info")
@KeySequence("iot_plugin_info_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PluginInfoDO extends BaseDO {

    /**
     * 主键 ID
     */
    @TableId
    private Long id;
    // TODO @haohao：这个是不是改成类似 key 之类的字段哈？
    // 回复：默认是 pluginId，可以不用改
    /**
     * 插件包 ID
     */
    private String pluginId;
    /**
     * 插件名称
     */
    private String name;
    /**
     * 描述
     */
    private String description;
    /**
     * 部署方式
     * <p>
     * 枚举 {@link IotPluginDeployTypeEnum}
     */
    private Integer deployType;
    /**
     * 插件包文件名
     */
    private String fileName;
    /**
     * 插件版本
     */
    private String version;
    /**
     * 插件类型
     * <p>
     * 枚举 {@link IotPluginTypeEnum}
     */
    private Integer type;
    /**
     * 设备插件协议类型
     */
    private String protocol;
    /**
     * 状态
     * <p>
     * 枚举 {@link IotPluginStatusEnum}
     */
    private Integer status;
    /**
     * 插件配置项描述信息
     */
    private String configSchema;
    /**
     * 插件配置信息
     */
    private String config;
    /**
     * 插件脚本
     */
    private String script;

}