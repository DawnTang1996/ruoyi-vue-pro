package cn.iocoder.yudao.module.iot.plugin.emqx.config;

import cn.iocoder.yudao.module.iot.api.device.IotDeviceUpstreamApi;
import cn.iocoder.yudao.module.iot.plugin.common.downstream.IotDeviceDownstreamHandler;
import cn.iocoder.yudao.module.iot.plugin.emqx.downstream.IotDeviceDownstreamHandlerImpl;
import cn.iocoder.yudao.module.iot.plugin.emqx.upstream.IotDeviceUpstreamServer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * IoT 插件 Emqx 的专用自动配置类
 *
 * @author haohao
 */
@Configuration
@EnableConfigurationProperties(IotPluginEmqxProperties.class)
public class IotPluginEmqxAutoConfiguration {

    @Bean(initMethod = "start", destroyMethod = "stop")
    public IotDeviceUpstreamServer deviceUpstreamServer(IotDeviceUpstreamApi deviceUpstreamApi,
                                                        IotPluginEmqxProperties emqxProperties) {
        return new IotDeviceUpstreamServer(emqxProperties, deviceUpstreamApi);
    }

    @Bean
    public IotDeviceDownstreamHandler deviceDownstreamHandler() {
        return new IotDeviceDownstreamHandlerImpl();
    }

}
