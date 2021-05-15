module.exports = {
    build(config) {
        config.themeConfig.sidebar["/zh/back-study/"] = [
            {
                title: "后端学习",
                collapsable: false,
                children: [
                    { title: '首页', path: "/zh/back-study/" },
                    { title: 'Activiti', path: "/zh/study/study-Activiti/" },
                ]
            },
        ];
    },
    crumbs: [
        { text: '首页', link: '/' },
        { text: '后端学习', link: '/zh/back-study/' },
    ]
}
