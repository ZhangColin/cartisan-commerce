[![Build Status](https://travis-ci.org/ZhangColin/cartisan-commerce.svg?branch=develop)](https://travis-ci.org/ZhangColin/cartisan-commerce) 
[![Quality Gate](https://sonarqube.com/api/badges/gate?key=Cartisan:commerce:develop)](https://sonarqube.com/dashboard?id=Cartisan%3Acommerce%3Adevelop) 
[![Issues](https://img.shields.io/sonar/http/sonarqube.com/Cartisan:commerce:develop/violations.svg)](https://sonarqube.com/component_issues/index?id=Cartisan%3Acommerce%3Adevelop#resolved=false)

[![Overall Coverage](https://img.shields.io/sonar/http/sonarqube.com/Cartisan:commerce:develop/overall_coverage.svg)](https://sonarqube.com/component_measures/domain/Coverage?id=Cartisan%3Acommerce%3Adevelop) 
[![UT Coverage](https://img.shields.io/sonar/http/sonarqube.com/Cartisan:commerce:develop/coverage.svg)](https://sonarqube.com/component_measures/domain/Coverage?id=Cartisan%3Acommerce%3Adevelop) 
[![Function Complexity](https://img.shields.io/sonar/http/sonarqube.com/Cartisan:commerce:develop/function_complexity.svg)](https://sonarqube.com/component_measures/domain/Complexity?id=Cartisan%3Acommerce%3Adevelop) 
[![Class Complexity](https://img.shields.io/sonar/http/sonarqube.com/Cartisan:commerce:develop/class_complexity.svg)](https://sonarqube.com/component_measures/domain/Complexity?id=Cartisan%3Acommerce%3Adevelop) 
[![Duplications](https://img.shields.io/sonar/http/sonarqube.com/Cartisan:commerce:develop/duplicated_blocks.svg)](https://sonarqube.com/component_measures/domain/Duplications?id=Cartisan%3Acommerce%3Adevelop) 
[![Code Smells](https://img.shields.io/sonar/http/sonarqube.com/Cartisan:commerce:develop/code_smells.svg)](https://sonarqube.com/component_measures/domain/Maintainability?id=Cartisan%3Acommerce%3Adevelop)


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