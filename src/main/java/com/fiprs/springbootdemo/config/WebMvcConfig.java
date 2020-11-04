package com.fiprs.springbootdemo.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

public class WebMvcConfig  implements WebMvcConfigurer {
    public static final String FILE_PATH = "/**";
    /**
     * 重写添加拦截器方法并添加配置拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.print("addd=================");
        registry.addInterceptor(new UserRoleAuthorizationInterceptor())
                .addPathPatterns("/testServlet/**")
                .excludePathPatterns("/login")
                //放行静态资源 ,"/file/**","/css/**","/fonts/**","/js/**"
                .excludePathPatterns("/file/**");
    }

    //配置静态资源的位置
//注意：AppConstant.FILE_MAP="/**"; 表示可以直接访问ip:端口/文件夹名字/图片名字访问
//AppConstant.FILE_MAP="/demo/**"; 表示可以直接访问ip:端口/demo/文件夹名字/图片名字访问
//addResourceLocations("file:" + AppConstant.FILE_PATH); 注意 一定要添加"file:",AppConstant.FILE_PATH是图片存放路径

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(FILE_PATH)
                .addResourceLocations("file:" + FILE_PATH);

        // super.addResourceHandlers(registry);
    }

}
