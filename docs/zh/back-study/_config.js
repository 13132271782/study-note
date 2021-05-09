module.exports = {
    build(config) {
        config.themeConfig.sidebar["/zh/back-study/"] = [
            {
                title: "后端学习",
                collapsable: false,
                children: [
                    { title: '首页', path: "/zh/back-study/" },
                ]
            },
        ];
    },
    crumbs: [
        { text: '首页', link: '/' },
        { text: '后端学习', link: '/zh/back-study/' },
    ]
}
