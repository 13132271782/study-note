module.exports = {
    build(config) {
        config.themeConfig.sidebar["/zh/front-study/"] = [
            {
                title: "前端学习",
                collapsable: false,
                children: [
                    { title: '首页', path: "/zh/front-study/" },
                    { title: 'Vue', path: "/zh/study/study-Vue/" },
                ]
            },
        ];
    },
    crumbs: [
        { text: '首页', link: '/' },
        { text: '前端学习', link: '/zh/front-study/' },
    ]
}
