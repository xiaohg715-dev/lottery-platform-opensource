<template>
  <div id="app">
    <el-container>
      <el-header>
        <h1>彩票平台管理后台</h1>
        <span class="warning">技术学习演示项目</span>
      </el-header>

      <el-container>
        <el-aside width="200px">
          <el-menu>
            <el-menu-item index="1">
              <span>用户管理</span>
            </el-menu-item>
            <el-menu-item index="2">
              <span>订单管理</span>
            </el-menu-item>
            <el-menu-item index="3">
              <span>赛事管理</span>
            </el-menu-item>
            <el-menu-item index="4">
              <span>财务统计</span>
            </el-menu-item>
          </el-menu>
        </el-aside>

        <el-main>
          <el-card class="demo-card">
            <h2>在线演示</h2>
            <el-button type="primary" size="large" @click="openDemo">
              访问演示站点
            </el-button>

            <div class="account-box">
              <h3>演示账号</h3>
              <div class="account-item">
                <span>账号:</span>
                <span class="value">17777777777</span>
              </div>
              <div class="account-item">
                <span>密码:</span>
                <span class="value">123456</span>
              </div>
            </div>
          </el-card>

          <el-card style="margin-top: 20px;">
            <h2>欢迎使用管理后台</h2>
            <p>这是一个技术学习演示项目</p>
            <div class="tip">
              本项目仅供学习研究使用,严禁用于任何商业或违法用途
            </div>
          </el-card>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script>
export default {
  name: 'App',
  data() {
    return {
      demoUrl: 'https://uam.neenlink.com'
    }
  },
  methods: {
    openDemo() {
      window.open(this.demoUrl, '_blank')
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
}

.el-header {
  background-color: #409EFF;
  color: white;
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.warning {
  color: #ffeb3b;
  font-size: 14px;
}

.el-aside {
  background-color: #f5f5f5;
}

.demo-card {
  background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
  color: white;
}

.demo-card h2 {
  margin-top: 0;
}

.account-box {
  background: rgba(255, 255, 255, 0.15);
  border-radius: 8px;
  padding: 15px;
  margin-top: 20px;
}

.account-box h3 {
  margin-top: 0;
  font-size: 16px;
}

.account-item {
  display: flex;
  justify-content: space-between;
  padding: 8px 0;
  border-bottom: 1px solid rgba(255, 255, 255, 0.1);
}

.account-item:last-child {
  border-bottom: none;
}

.value {
  font-weight: bold;
}

.tip {
  background: #fff3cd;
  color: #856404;
  padding: 12px;
  border-radius: 6px;
  margin-top: 15px;
}
</style>
