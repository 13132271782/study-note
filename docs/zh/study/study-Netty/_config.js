const util = require('../../../.vuepress/utils/index');

module.exports = {
    build(config) {
        config.themeConfig.sidebar["/zh/study/study-Netty/"] = [
            {
                title: "Netty学习",
                collapsable: false,
                children: [
                    { title: '首页', path: "/zh/study/study-Netty/" },
                    {
                        title: '1.介绍',
                        children: [
                            { title: '1.1.客户端与服务端概述', path: "/zh/study/study-Netty/1.introduce/1.1.ClientAndService" },
                        ]
                    },
                    {
                        title: '2.核心组件',
                        children: [
                            { title: '2.1.Channel', path: "/zh/study/study-Netty/2.core-component/2.1.Channel" },
                        ]
                    },
                    {
                        title: '3.第一个Netty程序',
                        children: [
                            { title: '2.1.Echo 服务端', path: "/zh/study/study-Netty/3.HelloWord/3.1.EchoService" },
                            { title: '2.2.Echo 客户端', path: "/zh/study/study-Netty/3.HelloWord/3.2.EchoClient" },
                        ]
                    },
                    { title: '附录1：问与答', path: "/zh/study/study-Netty/F1.Q&A" }
                ]
            },
        ];
    },
    crumbs: [
        ...util.baseCrumbs,
        { text: '后端学习', link: '#' },
        { text: 'Netty', link: '/zh/study/study-Netty/' },
    ]
}
