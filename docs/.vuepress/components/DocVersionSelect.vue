<template>
    <div class="version-select">
        <el-dropdown size="small"  @command="handleClick">
            <el-button type="primary" size="mini">
                版本选择<i class="el-icon-arrow-down el-icon--right"></i>
            </el-button>
            <el-dropdown-menu slot="dropdown">
                <el-dropdown-item v-for="item in api.version" :command="item">{{ item === '_update' ? '版本记录' : item }}</el-dropdown-item>
            </el-dropdown-menu>
        </el-dropdown>
    </div>
</template>

<script>
    export default {
        name: 'DocVersionSelect',
        props: {
            configPath: {
                type: String
            },
            keys: {
                type: String
            }
        },
        data () {
            return {
                api: []
            }
        },
        created () {
            let apiList = (require(`../../${this.configPath}`) || {}).apiList;
            const dir = this.keys.split('.');
            for (let i = 0; i < dir.length; i++) {
                apiList = apiList[dir[i]]
            }
            this.api = apiList;
        },
        methods: {
            handleClick (command) {
                this.$router.push(this.api.path + command + ".html")
            }
        }
    }
</script>

<style scoped lang="stylus">
    .version-select {
        text-align right
    }
</style>
