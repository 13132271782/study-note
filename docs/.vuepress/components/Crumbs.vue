<template>
    <div class="crumbs">
        <span v-for="(item, index) in data" :key="item.text">
            <RouterLink
                    class="nav-link"
                    :to="item.link">
                {{ item.text }}
            </RouterLink>
            <span class="crumbs-decollator" v-if="data[index + 1]">/</span>
        </span>
    </div>
</template>

<script>
    export default {
        name: 'Crumbs',
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
            this.data = (require(`../../${this.configPath}`) || {}).crumbs
        }
    }
</script>

<style lang="stylus">
    .crumbs {
        border-bottom: 1px $accentColor solid;
        padding-bottom: .5rem;
    }
</style>
