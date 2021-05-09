<template>
    <div class="request-box">
        <div class="request-url">
            <div class="request-type" :class="dataConfig.type">{{ dataConfig.type }}</div>
            <el-input v-model="dataConfig.ip" size="small" class="url-input">
                <template slot="prepend">http://</template>
            </el-input>
            <el-input v-model="dataConfig.port" size="small" class="url-input">
                <template slot="prepend">:</template>
            </el-input>
            <el-input v-model="dataConfig.url" size="small"></el-input>
            <el-button type="primary" size="small">测试</el-button>
        </div>
        <el-tabs v-model="activeName" type="card">
            <el-tab-pane label="请求头" name="header">
                <el-tree
                        :data="dataConfig.header"
                        node-key="id"
                        default-expand-all
                        :expand-on-click-node="false">
                      <div class="custom-tree-node" slot-scope="{ node, data }">
                          <div v-if="data.children">{{ data.name }}</div>
                          <el-input v-else :placeholder="data.placeholder" size="small" v-model="data.value">
                              <template slot="prepend">{{ data.name }}</template>
                          </el-input>
                      </div>
                </el-tree>
            </el-tab-pane>
            <el-tab-pane label="请求体" name="data">
                <el-tree
                        :data="dataConfig.data"
                        node-key="id"
                        default-expand-all
                        :expand-on-click-node="false">
                    <div class="custom-tree-node" slot-scope="{ node, data }">
                        <div v-if="data.children">{{ data.name }}</div>
                        <el-input v-else :placeholder="data.placeholder" size="small" v-model="data.value">
                            <template slot="prepend">{{ data.name }}</template>
                        </el-input>
                    </div>
                </el-tree>
            </el-tab-pane>
        </el-tabs>
    </div>
</template>

<script>
    export default {
        name: 'RequestTest',
        props: {
            configPath: {
                type: String
            }
        },
        data () {
            return {
                dataConfig: {},
                header: {},
                activeName: 'data'
            }
        },
        created () {
            this.dataConfig = (require(`../../${this.configPath}`) || {})
        }
    }
    // module.exports = {
    //     url: '/api/system/auth/login',
    //     ip: 'localhost',
    //     port: '8082',
    //     type: 'POST',
    //     header: [
    //         { name: 'Content-Type', value: 'application/json', placeholder: 'Content-Type' }
    //     ],
    //     data: [
    //         { name: 'account', value: '', placeholder: '用户的账号' },
    //         { name: 'password', value: '', placeholder: '用户的密码' },
    //         { name: 'user',  children: [
    //                 { name: 'account', value: '', placeholder: '用户的账号' },
    //             ]
    //         },
    //     ]
    // }

</script>

<style lang="stylus">
    .request-box {
        margin-top 1rem
        .el-tree-node__content {
            height auto
        }
        .custom-tree-node {
            width 100%
        }
        .el-tree-node__content {
            margin-bottom 1rem
        }
    }
    .request-url {
        display flex
        margin-bottom 1rem
        .request-type {
            width 80px
            text-align center
            flex-shrink 0
            padding: .25rem 0.5rem;
            &.POST, &.post  {
                background orange;
                color white
            }
        }
        .url-input {
            width: 200px;
            flex-shrink: 0;
            text-align: center
        }
    }
</style>
