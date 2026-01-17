# Lottery Platform - 完整项目说明

## 项目概述

这是一个完整的彩票平台开源项目,包含核心算法实现、数据库设计、前后端代码等。

## 已实现功能

### 后端 (lottery-backend)

#### 核心算法
- `BetCalculator.java` - 注数计算核心算法
  - 组合数计算
  - 双色球注数计算
  - 竞彩足球注数计算
  - 奖金计算
  - 多串过关计算

#### 实体类
- `LotteryOrder.java` - 彩票订单实体
- `FootballMatch.java` - 足球比赛实体

#### 业务逻辑
- `LotteryOrderService.java` - 订单服务
  - 创建足球彩票订单
  - 创建双色球订单
  - 奖金计算

#### API接口
- `SystemController.java` - 系统接口
  - 健康检查
  - 系统信息
- `LotteryController.java` - 彩票接口
  - 双色球注数计算
  - 竞彩足球注数计算
  - 奖金计算
  - 比赛列表查询

#### 数据库
- `database/init.sql` - 数据库初始化脚本
  - 用户表
  - 足球比赛表
  - 彩票订单表
  - 示例数据

### 前端

#### 移动端 (lottery-mobile-app)
- `pages/index.vue` - 首页
- `pages/double-color-ball.vue` - 双色球投注页面(完整交互)

#### PC端门户 (lottery-pc-portal)
- `src/App.vue` - 门户首页
- `src/components/FootballBet.vue` - 竞彩足球投注组件

#### 管理后台 (lottery-admin-panel)
- `src/App.vue` - 管理界面

#### 商户系统 (lottery-shop-system)
- `src/App.vue` - 商户管理界面

## 技术特点

1. **真实算法实现** - 包含实际的组合数计算、注数计算等核心算法
2. **完整的数据模型** - 设计了用户、订单、比赛等完整的数据表结构
3. **前后端分离** - RESTful API设计
4. **交互式界面** - 双色球选号、竞彩足球投注等交互功能
5. **代码注释** - 所有代码都有详细的中英文注释

## 与其他项目的区别

本项目 (`lottery-platform-opensource`) 是一个全新的独立项目,与 `不带爬虫系统` 目录下的项目完全不同:

- 使用了不同的包名和项目结构
- 实现了更多的核心算法
- 包含完整的数据库设计
- 提供了交互式的前端页面
- 代码更加规范和完整

## 使用说明

详见各子目录的 README.md 和 QUICKSTART.md

## 重要提示

⚠️ 本项目仅供技术学习和算法研究使用,严禁用于任何商业运营或违法用途。
