<crumbs config-path="zh/study/study-Vue-FreeHandCreateVueCli/_config.js"/>

# 3.使用html-webpack-plugin

执行命令安装

```cmd
npm i html-webpack-plugin --save-dev
```

修改 `webpack.config.js`

```js
const htmlWebpackPlugin = require('html-webpack-plugin');

module.exports = {
    plugins: [
        new htmlWebpackPlugin({
            template: path.join(__dirname, "./public/index.html"),
            filename: "index.html"
        })
    ],
};

```

上面的代码是根据磁盘中的index.html在内存中生成一个index.html，我们在浏览器中审查页面发现会多一个script标签，这是插件自动将内存中的main.js加入到内存页面中了
