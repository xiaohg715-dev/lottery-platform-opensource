<template>
    <view class="page">
        <view class="header">
            <text class="title">双色球</text>
        </view>

        <view class="section">
            <text class="label">红球 (6-33个)</text>
            <view class="balls">
                <view v-for="n in 33" :key="n" :class="['ball', 'red', redBalls.includes(n) ? 'on' : '']"
                    @click="pickRed(n)">
                    {{ n }}
                </view>
            </view>
        </view>

        <view class="section">
            <text class="label">蓝球 (1-16个)</text>
            <view class="balls">
                <view v-for="n in 16" :key="n" :class="['ball', 'blue', blueBalls.includes(n) ? 'on' : '']"
                    @click="pickBlue(n)">
                    {{ n }}
                </view>
            </view>
        </view>

        <view class="info">
            <view>红球: {{ redBalls.length }} | 蓝球: {{ blueBalls.length }}</view>
            <view>注数: {{ cnt }} | 金额: ¥{{ amt }}</view>
        </view>

        <view class="btns">
            <button class="btn" @click="calc">计算</button>
            <button class="btn gray" @click="clear">清空</button>
        </view>

        <view class="tip">仅供算法演示</view>
    </view>
</template>

<script>
export default {
    data() {
        return {
            redBalls: [],
            blueBalls: [],
            cnt: 0,
            amt: 0
        }
    },
    methods: {
        pickRed(n) {
            let idx = this.redBalls.indexOf(n)
            if (idx > -1) {
                this.redBalls.splice(idx, 1)
            } else {
                this.redBalls.push(n)
            }
            this.redBalls.sort((a, b) => a - b)
        },
        pickBlue(n) {
            let idx = this.blueBalls.indexOf(n)
            if (idx > -1) {
                this.blueBalls.splice(idx, 1)
            } else {
                this.blueBalls.push(n)
            }
        },
        calc() {
            if (this.redBalls.length < 6 || this.blueBalls.length < 1) {
                uni.showToast({ title: '至少6红1蓝', icon: 'none' })
                return
            }
            this.cnt = this.comb(this.redBalls.length, 6) * this.blueBalls.length
            this.amt = this.cnt * 2
        },
        comb(n, m) {
            if (m > n) return 0
            let r = 1
            for (let i = 0; i < m; i++) {
                r = r * (n - i) / (i + 1)
            }
            return Math.round(r)
        },
        clear() {
            this.redBalls = []
            this.blueBalls = []
            this.cnt = 0
            this.amt = 0
        }
    }
}
</script>

<style>
.page {
    padding: 15px;
    background: #f8f8f8;
}

.header {
    text-align: center;
    margin-bottom: 20px;
}

.title {
    font-size: 22px;
    font-weight: bold;
}

.section {
    background: #fff;
    padding: 15px;
    margin-bottom: 15px;
    border-radius: 6px;
}

.label {
    font-size: 15px;
    font-weight: bold;
    display: block;
    margin-bottom: 10px;
}

.balls {
    display: flex;
    flex-wrap: wrap;
    gap: 8px;
}

.ball {
    width: 38px;
    height: 38px;
    border-radius: 50%;
    display: flex;
    align-items: center;
    justify-content: center;
    font-size: 14px;
    font-weight: bold;
}

.red {
    background: #ffe6e6;
    color: #d32f2f;
    border: 2px solid #d32f2f;
}

.blue {
    background: #e6f2ff;
    color: #1976d2;
    border: 2px solid #1976d2;
}

.on {
    transform: scale(1.1);
}

.red.on {
    background: #d32f2f;
    color: #fff;
}

.blue.on {
    background: #1976d2;
    color: #fff;
}

.info {
    background: #fff;
    padding: 12px;
    margin-bottom: 15px;
    border-radius: 6px;
}

.btns {
    display: flex;
    gap: 10px;
    margin-bottom: 15px;
}

.btn {
    flex: 1;
    padding: 12px;
    border-radius: 6px;
    background: #409EFF;
    color: #fff;
}

.gray {
    background: #909399;
}

.tip {
    text-align: center;
    color: #f56c6c;
    font-size: 13px;
}
</style>
