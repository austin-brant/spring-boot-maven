
# spring-boot-maven
一个demo验证了如何打可执行jar包，并把依赖文件、配置文件和静态资源文件都分离开来，并且可以打入本地依赖的jar包。

某些场合下，可能需要使用方自己实现某些接口，这时候只需要打一个依赖的jar放到lib目录下替换掉默认实现就行。

## 快速开始
`java -jar -Dloader.path=./lib deploy-1.0-SNAPSHOT.jar`