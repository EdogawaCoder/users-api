package com.edogawa.usersApi.configurations;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        OpenAPI info;
        info = new OpenAPI()
                .info(new Info()
                        .title("Edogawa User Access Control API / エドガワユーザーアクセス管理API")
                        .version("1.0.0")
                        .description(
                                """
                                        Public API for user access control, including registration, authentication, role management, 
                                        and permission validation.
                                        
                                        Intended for learning, testing, and demonstration purposes, this API provides endpoints for secure 
                                        user account management and access authorization flows.
                                        
                                        ユーザーの登録、認証、ロール管理、権限検証を行うための公開APIです。
                                        このAPIは、学習、テスト、およびデモンストレーション目的で使用されます。
                                        """
                        )
                        .contact(new Contact()
                                .name("Edogawa Developer Team / 江戸川開発チーム")
                                .url("https://github.com/EdogawaCoder")
                                .email("edev.coderx@gmail.com")
                        )
                        .license(new License()
                                .name("MIT License / MITライセンス")
                                .url("https://opensource.org/licenses/MIT")
                        ));

        return info;
    }
}
