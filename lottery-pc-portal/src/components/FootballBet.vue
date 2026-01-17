<template>
    <div class="page">
        <h2>竞彩足球</h2>

        <div class="matches">
            <div v-for="m in matches" :key="m.id" class="match">
                <div class="top">
                    <span>{{ m.no }}</span>
                    <span>{{ m.time }}</span>
                </div>

                <div class="teams">
                    <div>{{ m.home }}</div>
                    <div class="vs">VS</div>
                    <div>{{ m.away }}</div>
                </div>

                <div class="odds">
                    <div :class="['opt', sel[m.id] === 3 ? 'on' : '']" @click="pick(m.id, 3)">
                        <div>主</div>
                        <div>{{ m.h }}</div>
                    </div>
                    <div :class="['opt', sel[m.id] === 1 ? 'on' : '']" @click="pick(m.id, 1)">
                        <div>平</div>
                        <div>{{ m.d }}</div>
                    </div>
                    <div :class="['opt', sel[m.id] === 0 ? 'on' : '']" @click="pick(m.id, 0)">
                        <div>客</div>
                        <div>{{ m.a }}</div>
                    </div>
                </div>
            </div>
        </div>

        <div class="sum">
            <div>场次: {{ cnt }}</div>
            <div>注数: {{ bets }}</div>
            <div>金额: ¥{{ amt }}</div>
        </div>

        <el-button type="primary" @click="calc" :disabled="cnt === 0">计算</el-button>
        <div class="tip">仅供算法演示</div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            matches: [
                { id: 1, no: 'M001', home: '曼联', away: '利物浦', time: '01-20 20:00', h: '2.10', d: '3.20', a: '3.50' },
                { id: 2, no: 'M002', home: '巴萨', away: '皇马', time: '01-21 22:00', h: '1.80', d: '3.00', a: '4.20' },
                { id: 3, no: 'M003', home: '拜仁', away: '多特', time: '01-22 21:30', h: '1.50', d: '3.80', a: '5.00' }
            ],
            sel: {},
            bets: 0,
            amt: 0
        }
    },
    computed: {
        cnt() {
            return Object.keys(this.sel).length
        }
    },
    methods: {
        pick(id, r) {
            if (this.sel[id] === r) {
                delete this.sel[id]
            } else {
                this.sel[id] = r
            }
            this.$forceUpdate()
        },
        calc() {
            this.bets = Math.pow(3, this.cnt)
            this.amt = this.bets * 2
            this.$message.success('完成')
        }
    }
}
</script>

<style scoped>
.page {
    padding: 20px;
}

.matches {
    margin: 20px 0;
}

.match {
    background: #fff;
    padding: 15px;
    margin-bottom: 15px;
    border-radius: 6px;
    box-shadow: 0 2px 6px rgba(0, 0, 0, 0.08);
}

.top {
    display: flex;
    justify-content: space-between;
    margin-bottom: 10px;
    color: #666;
    font-size: 13px;
}

.teams {
    display: flex;
    justify-content: space-around;
    align-items: center;
    margin: 12px 0;
}

.vs {
    color: #999;
}

.odds {
    display: flex;
    gap: 10px;
}

.opt {
    flex: 1;
    text-align: center;
    padding: 10px;
    border: 2px solid #ddd;
    border-radius: 6px;
    cursor: pointer;
}

.opt:hover {
    border-color: #409EFF;
}

.opt.on {
    background: #409EFF;
    color: #fff;
    border-color: #409EFF;
}

.sum {
    background: #f5f5f5;
    padding: 12px;
    border-radius: 6px;
    margin: 15px 0;
    display: flex;
    justify-content: space-around;
}

.tip {
    text-align: center;
    color: #f56c6c;
    margin-top: 15px;
    font-size: 13px;
}
</style>
