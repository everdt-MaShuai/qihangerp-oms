package cn.qihangerp.oms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

//@EnableDiscoveryClient
//@MapperScan("cn.qihangerp.oms.mapper")
@EnableDiscoveryClient
@ComponentScan(basePackages={"cn.qihangerp"})
@SpringBootApplication
public class OmsApi {
    public static void main( String[] args )
    {
        System.out.println( "Hello oms-api!" );
        SpringApplication.run(OmsApi.class, args);
    }

}
