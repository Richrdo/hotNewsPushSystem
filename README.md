# hotNewsPushSystem
这是**新闻热点推送App服务端**

在使用之前，请先将**新闻热点推送App数据源获取服务**配置正确并成功运行。该服务端为**新闻热点推送App客户端**提供api。

最终效果请参考**App客户端**的自述文件。

# 配套项目

**新闻热点推送App数据源获取服务** :https://github.com/Richrdo/hotNewsSpider/ 

**新闻热点推送App客户端** :https://github.com/Richrdo/hotNewsApp/

# 使用
在使用时，请在如下路径寻找`application.yml`,并修改jdbc的配置为你自己存储热点新闻的数据库。
```
|-- src
    |-- main
    |-- srcources
        |-- application.yml
```
