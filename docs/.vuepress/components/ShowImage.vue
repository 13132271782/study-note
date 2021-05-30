<template>
   <div>
       <div
               class="img-list-item"
               style="width: 400px;height: 400px">
           <el-image
                   :src="$withBase(path)"
                   style="width: 100%;height: 100%"
                   flt="contain"
                   :preview-src-list="[$withBase(path)]">
           </el-image>
       </div>
   </div>
</template>

<script>
    export default {
        name: "ShowImage",
        props: {
            path: {
                type: String
            }
        },
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
