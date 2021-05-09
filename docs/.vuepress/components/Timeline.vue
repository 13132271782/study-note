<template>
    <div class="time-line">
        <el-timeline>
            <el-timeline-item
                    v-for="(activity, index) in data"
                    :key="index"
                    placement="top"
                    :timestamp="activity.time">
                <div style="display: flex">
                    <el-tag v-if="activity.version" effect="dark" size="small">{{ activity.version }}</el-tag>
                    <div class="content" v-html="activity.info"></div>
                </div>
            </el-timeline-item>
        </el-timeline>
    </div>
</template>

<script>
    export default {
        name: 'Timeline',
        props: {
            configPath: {
                type: String
            }
        },
        data () {
            return {
                data: []
            }
        },
        created () {
            this.data = (this.$page.frontmatter || {}).time || []
        }
    }
</script>

<style lang="stylus">
    .time-line {
        .content {
            margin-left 1rem
        }
    }
</style>
