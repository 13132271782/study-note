const util = require('../../../.vuepress/utils/index');

module.exports = {
    build(config) {
        config.themeConfig.sidebar["/zh/study/study-Netty/"] = [
            {
                title: "Netty学习",
                collapsable: false,
                children: [
                    { title: '首页', path: "/zh/study/study-Netty/" }
                ]
            },
        ];
    },
    crumbs: [
        ...util.baseCrumbs,
        { text: '后端学习' },
        { text: 'Netty', link: '/zh/study/study-Netty/' },
    ]
}
