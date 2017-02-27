

# 安装
项目需要安装以下工具，除指定版本的工具以外都可以使用最新版本
* git
* jdk 1.8
* gradle 2.13 (don't use gradle 2.14, 2.14.1 or 3.X)
* mysql
* intellij idea community edition
    * lombok plug-in
* Firefox 46.0 (don't use higher version)
* gulp 3.9.1

# 设置开发环境
使用 git 克隆到本地，然后在项目文件夹下执行下面的命令

* 创建默认的 mysql dba用户 'mysql -u -root -p < src/main/sql/create_default_dba.sql'