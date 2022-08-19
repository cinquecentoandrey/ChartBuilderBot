package com.cinquecentoandrey.config;

import com.cinquecentoandrey.ChartBuilderBot.ChartBuilderBot;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.telegram.telegrambots.bots.DefaultBotOptions;


@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "telegrambot")
public class BotConfig {
    private String webHookPath;
    private String botUserName;
    private String botToken;

    @Bean
    public ChartBuilderBot chartBuilderBot() {

        ChartBuilderBot chartBuilderBot = new ChartBuilderBot(new DefaultBotOptions());

        chartBuilderBot.setBotToken(botToken);
        chartBuilderBot.setBotUserName(botUserName);
        chartBuilderBot.setWebHookPath(webHookPath);

        return chartBuilderBot;
    }

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource =
                new ReloadableResourceBundleMessageSource();

        messageSource.setBasename("classpath:messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

}
