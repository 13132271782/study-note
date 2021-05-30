<template>
   <div>
       <el-carousel ref="imgList" :interval="5000" :initial-index="indexKey" arrow="always" :autoplay="false" height="400px">
           <el-carousel-item v-for="item in data" :key="item">
               <el-image
                       style="width: 100px; height: 100px"
                       :src="$withBase(item)"
                       flt="contain"
                       class="el-image-item"
                       :preview-src-list="data">
               </el-image>
           </el-carousel-item>
       </el-carousel>
       <div class="img-box">
           <div
                   v-for="item in data"
                   :key="item"
                   class="img-list-item"
                   @mousemove="mouseMove(item)"
                   style="width: 100px; height: 100px">
               <el-image
                       :src="$withBase(item)"
                       style="width: 100%;height: 100%"
                       flt="contain"
                       :preview-src-list="data">
               </el-image>
           </div>
       </div>
   </div>
</template>

<script>
    export default {
        name: "Carousel",
        props: {
            name: {
                type: String
            }
        },
        data () {
            return {
                data: [],
                indexKey: 0
            }
        },
        created () {
            this.data = ((this.$page.frontmatter || {}).carousel || {})[this.name] || []
        },
        methods: {
            mouseMove (path) {
                this.$refs.imgList.setActiveItem(this.data.indexOf(path));
            }
        }
    }
</script>

<style scoped>
    .el-image-item {
        width: 100%!important;
        height: 100% !important;
        text-align: center;
    }
    .img-box {
        display: flex;
        justify-content: center;
    }
    .img-list-item {
        text-align: center;
        margin: 1rem;
        border: 1px #DDD solid;
        cursor: pointer;
        border-radius: .5rem;
    }
</style>
<style>
    .el-image-item .el-image__inner, .img-list-item .el-image__inner {
        width: auto!important;
    }
</style>
