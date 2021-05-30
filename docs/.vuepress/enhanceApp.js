import Crumbs from './components/Crumbs.vue'
import DocVersionSelect from './components/DocVersionSelect.vue'
import Timeline from './components/Timeline.vue'
import RequestTest from './components/RequestTest.vue'
import TabShow from './components/TabShow.vue'
import Carousel from './components/Carousel.vue'
import ShowImage from './components/ShowImage.vue'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';

export default ({
                    Vue, // the version of Vue being used in the VuePress app
                    options, // the options for the root Vue instance
                    router, // the router instance for the app
                    siteData // site metadata
                }) => {
    Vue.component('crumbs', Crumbs);
    Vue.component('DocVersionSelect', DocVersionSelect);
    Vue.component('Timeline', Timeline);
    Vue.component('RequestTest', RequestTest);
    Vue.component('Carousel', Carousel);
    Vue.component('ShowImage', ShowImage);
    Vue.component('TabShow', TabShow);
    Vue.use(ElementUI)
}
