<template>
    <div class="tab-show">
        <el-tabs v-model="activeName" type="card">
            <el-tab-pane v-for="(item, index) in tabs" :key="index" :label="`${item}`" :name="`json_${item}`">
                <slot :name="`json_${item}`"></slot>
            </el-tab-pane>
        </el-tabs>
    </div>
</template>

<script>
    export default {
        name: 'Crumbs',
        props: {
            tabs: {
                type: Array,
                default: () => []
            }
        },
        data () {
            return {
                activeName: ''
            }
        },
        created () {
            this.activeName = 'json_' + this.tabs[0]
        }
    }
</script>

<style lang="stylus">
    .tab-show {
    }
</style>
