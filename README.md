# 这是一个全局唯一id生成服务，基于百度开源的uid-generator库实现，其对外提供rest接口
## 1.整合百度uid-generator步骤
### 1.1到github下载项目源码，将其核心代码拷进自己的项目
### 1.2添加数据库配置和直接依赖
### 1.3一定要配置@MapperScan，扫描WorkerNodeDAO类所在的包
### 1.4编写service和controller代码
### 1.5访问接口http://localhost:9090/uid/getUid测试
### 具体机制见https://github.com/JaxYoun/uid-generator/blob/master/README.zh_cn.md