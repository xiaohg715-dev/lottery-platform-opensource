<template>
    <div id="app">
        <header class="header">
            <div class="container">
                <h1 class="logo">彩票平台</h1>
                <nav class="nav">
                    <a href="#sports">体育竞技</a>
                    <a href="#welfare">福利彩票</a>
                    <a href="#digital">数字彩票</a>
                    <a href="#live">直播</a>
                </nav>
            </div>
        </header>

        <main class="main">
            <div class="banner">
                <h2>技术学习演示项目</h2>
                <p>完整开源的彩票平台源码</p>
            </div>

            <div class="container">
                <div class="section">
                    <h3>体育竞技</h3>
                    <div class="cards">
                        <div class="card">竞彩足球</div>
                        <div class="card">竞彩篮球</div>
                        <div class="card">北京单场</div>
                    </div>
                </div>

                <div class="section">
                    <h3>福利彩票</h3>
                    <div class="cards">
                        <div class="card">双色球</div>
                        <div class="card">福彩3D</div>
                        <div class="card">七乐彩</div>
                    </div>
                </div>
            </div>

            <div class="warning-banner">
                ⚠️ 本项目仅供学习研究使用,严禁用于商业运营或违法用途
            </div>
        </main>

        <footer class="footer">
            <p>Lottery Platform - Open Source Learning Project</p>
        </footer>
    </div>
</template>

<script>
export default {
    name: 'App'
}
</script>

<style>
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

.header {
    background: #409EFF;
    color: white;
    padding: 20px 0;
}

.container {
    max-width: 1200px;
    margin: 0 auto;
    padding: 0 20px;
}

.logo {
    display: inline-block;
    margin-right: 50px;
}

.nav {
    display: inline-block;
}

.nav a {
    color: white;
    text-decoration: none;
    margin: 0 15px;
}

.banner {
    background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
    color: white;
    text-align: center;
    padding: 80px 20px;
}

.section {
    margin: 40px 0;
}

.cards {
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    gap: 20px;
    margin-top: 20px;
}

.card {
    background: white;
    border: 1px solid #ddd;
    border-radius: 8px;
    padding: 30px;
    text-align: center;
    box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
}

.warning-banner {
    background: #fff3cd;
    color: #856404;
    text-align: center;
    padding: 20px;
    margin: 40px 0;
    border-radius: 8px;
}

.footer {
    background: #333;
    color: white;
    text-align: center;
    padding: 30px;
    margin-top: 60px;
}
</style>
