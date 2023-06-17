# 重命名；下载；docker-compose-`uname -s`-`uname -m` 查看版本；https://github.com/docker/compose/releases/tag/v2.18.1
`mv docker-compose-Linux-x86_64  docker-compose`
# 加入执行权限
`sudo chmod +x /usr/local/bin/docker-compose`
# 查看docker-compose版本
`docker-compose -v`

```java
[root@dev-ops bin]# docker-compose -v
Docker Compose version v2.18.1
```