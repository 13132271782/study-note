module.exports = {
    build(config) {
        config.themeConfig.sidebar["/zh/study/study-Activiti/"] = [
            {
                title: "Activiti",
                collapsable: false,
                children: [
                    { title: '首页', path: "/zh/study/study-Activiti/" },
                    {
                        title: '1.流程引擎',
                        children: [{
                            title: '1.1.配置文件风格',
                            children: [
                                { title: '1.1.1.默认风格', path: '/zh/study/study-Activiti/1.ProcessEngine/1.1.ProfileStyle/1.1.1.ActivitiStyle' },
                                { title: '1.1.2.Spring风格', path: '/zh/study/study-Activiti/1.ProcessEngine/1.1.ProfileStyle/1.1.2.SpringiStyle' }
                            ]
                        }, {
                            title: '1.2.自定义适配器',
                            children: [
                                { title: '1.2.1.AbstractProcessEngineConfigurator', path: '/zh/study/study-Activiti/1.ProcessEngine/1.2.CustomAdapter/1.2.1.AbstractProcessEngineConfigurator' }
                            ]
                        }, {
                            title: '1.3.监听器',
                            children: [
                                { title: '1.3.1.生命周期监听器', path: '/zh/study/study-Activiti/1.ProcessEngine/1.3.Listener/1.3.1.LifecycleListener' }
                            ]
                        }]
                    }, {
                        title: '2.流程部署',
                        children: []
                    }, {
                        title: '3.自定义元素解析',
                        children: []
                    }, {
                        title: '4.事件转发器',
                        children: []
                    }, {
                        title: '5.流程引擎',
                        children: []
                    },
                ]
            },
        ];
    },
    crumbs: [
        { text: '首页', link: '/' },
        { text: '技术语言学习', link: '/zh/language-study/' },
        { text: 'C', link: '/zh/study/study-c/' },
    ]
}
