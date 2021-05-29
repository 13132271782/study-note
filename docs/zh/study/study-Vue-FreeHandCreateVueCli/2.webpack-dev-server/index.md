<crumbs config-path="zh/study/study-Vue-FreeHandCreateVueCli/_config.js"/>

# 2.使用webpack-dev-server

执行命令安装

```cmd
npm i webpack-dev-server --save-dev
```

假如像使用`webpack`命令一样使用使用`webpack-dev-server`是局部安装的，使用局部安装的包，是完全行不通的，因为命令行里只能使用全局安装的包，
`webpack-dev-server`是局部安装的，使用局部安装的包，我们需要使用在`package.json`中配置`scripts`

修改 `package.json`

```json
"scripts": {
    "test": "echo \"Error: no test specified\" && exit 1",
    "dev": "webpack-dev-server"
},
```

执行命令 `npm run dev` 启动项目
