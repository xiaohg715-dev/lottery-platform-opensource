<template>
    <div id="app">
        <el-container>
            <el-header>
                <h1>商户管理系统</h1>
            </el-header>

            <el-container>
                <el-aside width="200px">
                    <el-menu default-active="1">
                        <el-menu-item index="1">
                            <span>销售统计</span>
                        </el-menu-item>
                        <el-menu-item index="2">
                            <span>订单查询</span>
                        </el-menu-item>
                        <el-menu-item index="3">
                            <span>佣金结算</span>
                        </el-menu-item>
                        <el-menu-item index="4">
                            <span>数据报表</span>
                        </el-menu-item>
                    </el-menu>
                </el-aside>

                <el-main>
                    <el-row :gutter="20">
                        <el-col :span="6">
                            <el-card>
                                <h3>今日销售</h3>
                                <p class="number">¥0.00</p>
                            </el-card>
                        </el-col>
                        <el-col :span="6">
                            <el-card>
                                <h3>今日订单</h3>
                                <p class="number">0</p>
                            </el-card>
                        </el-col>
                        <el-col :span="6">
                            <el-card>
                                <h3>本月佣金</h3>
                                <p class="number">¥0.00</p>
                            </el-card>
                        </el-col>
                        <el-col :span="6">
                            <el-card>
                                <h3>累计收益</h3>
                                <p class="number">¥0.00</p>
                            </el-card>
                        </el-col>
                    </el-row>

                    <el-card style="margin-top: 20px;">
                        <h3>销售趋势</h3>
                        <div id="chart" style="height: 300px;"></div>
                    </el-card>

                    <el-alert style="margin-top: 20px;" title="学习项目提示" type="warning" description="本系统为技术学习演示项目,仅供研究使用"
                        show-icon :closable="false">
                    </el-alert>
                </el-main>
            </el-container>
        </el-container>
    </div>
</template>

<script>
export default {
    name: 'App',
    mounted() {
        console.log('Shop system loaded')
    }
}
</script>

<style>
.el-header {
    background-color: #409EFF;
    color: white;
    display: flex;
    align-items: center;
}

.el-aside {
    background-color: #f5f5f5;
}

.number {
    font-size: 24px;
    font-weight: bold;
    color: #409EFF;
    margin-top: 10px;
}
</style>
