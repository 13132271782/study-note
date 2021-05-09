module.exports = {
    build(config) {
        config.themeConfig.sidebar["/zh/_app/"] = [
            {
                title: "技术文档",
                collapsable: false,
                children: [
                    { title: '首页', path: '/zh/_app/'},
                    { title: '技术语言学习', path: '/zh/language-study/'},
                    { title: '前端学习', path: '/zh/front-study/'},
                    { title: '后端学习', path: '/zh/back-study/'},
                ]
            },
        ];
    },
    crumbs: [
        { text: '首页', link: '/' },
        { text: '技术文档', link: '/zh/_app/' },
    ]
}
