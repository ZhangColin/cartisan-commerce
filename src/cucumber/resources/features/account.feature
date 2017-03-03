# language: zh-CN
@account
功能: 账户管理

  @wip
  场景: 成功展示账户列表
    假如 系统存在一个账户，Email为"stwyhm@126.com"
    当 查看账户列表
    那么 看到一条Email为"stwyhm@126.com"的账户记录

  场景: 没有账户时列表提示没有数据
    假如 系统一个账户都不存在
    当 查看账户列表
    那么 提示"No data available in table"

  场景: 成功创建账户
    假如 系统一个账户都不存在
    当 添加一个账户，Email为"stwyhm@126.com"
    那么 成功创建账户，Email为"stwyhm@126.com"



