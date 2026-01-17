<template>
  <view class="container">
    <view class="header">
      <text class="title">彩票平台</text>
      <text class="subtitle">技术学习演示项目</text>
    </view>

    <view class="demo-section">
      <button class="demo-btn" @click="goDemo">访问在线演示</button>
      <view class="account-info">
        <text class="info-title">演示账号</text>
        <view class="info-item">
          <text class="label">账号:</text>
          <text class="value">17777777777</text>
        </view>
        <view class="info-item">
          <text class="label">密码:</text>
          <text class="value">123456</text>
        </view>
      </view>
    </view>

    <view class="content">
      <view class="card" @click="goPage('double-color-ball')">
        <text class="card-title">双色球</text>
        <text class="card-desc">选号投注演示</text>
      </view>

      <view class="card">
        <text class="card-title">竞彩足球</text>
        <text class="card-desc">赛事投注演示</text>
      </view>

      <view class="card">
        <text class="card-title">大乐透</text>
        <text class="card-desc">算法演示</text>
      </view>
    </view>

    <view class="footer">
      <text class="warning">仅供学习研究</text>
    </view>
  </view>
</template>

<script>
export default {
  data() {
    return {
      demoUrl: 'https://uap.neenlink.com'
    }
  },
  methods: {
    goDemo() {
      uni.showModal({
        title: '提示',
        content: '即将跳转到在线演示站点',
        success: (res) => {
          if (res.confirm) {
            // #ifdef H5
            window.open(this.demoUrl)
            // #endif
            // #ifndef H5
            uni.showToast({
              title: '请在浏览器中访问',
              icon: 'none'
            })
            // #endif
          }
        }
      })
    },
    goPage(page) {
      uni.navigateTo({
        url: `/pages/${page}`
      })
    },
    onLoad() {
      console.log('Home loaded')
    }
  }
}
</script>

<style>
.container {
  padding: 20px;
}

.header {
  text-align: center;
  margin-bottom: 30px;
}

.title {
  font-size: 32px;
  font-weight: bold;
  color: #333;
}

.subtitle {
  font-size: 14px;
  color: #999;
  margin-top: 10px;
}

.demo-section {
  background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
  border-radius: 12px;
  padding: 20px;
  margin-bottom: 20px;
}

.demo-btn {
  background: #fff;
  color: #667eea;
  border-radius: 8px;
  padding: 12px;
  font-size: 16px;
  font-weight: bold;
  margin-bottom: 15px;
}

.account-info {
  background: rgba(255, 255, 255, 0.2);
  border-radius: 8px;
  padding: 15px;
}

.info-title {
  color: #fff;
  font-size: 14px;
  font-weight: bold;
  display: block;
  margin-bottom: 10px;
}

.info-item {
  display: flex;
  justify-content: space-between;
  padding: 5px 0;
}

.label {
  color: rgba(255, 255, 255, 0.8);
  font-size: 13px;
}

.value {
  color: #fff;
  font-size: 13px;
  font-weight: bold;
}

.content {
  display: flex;
  flex-direction: column;
  gap: 15px;
}

.card {
  background: #fff;
  border-radius: 8px;
  padding: 20px;
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
}

.card-title {
  font-size: 18px;
  font-weight: bold;
  color: #333;
}

.card-desc {
  font-size: 14px;
  color: #666;
  margin-top: 8px;
}

.footer {
  margin-top: 40px;
  text-align: center;
}

.warning {
  color: #ff6b6b;
  font-size: 14px;
}
</style>
