<template>
    <div class="fillcontain">
        <head-top></head-top>
        <div class="table_container">
            <el-table
                :data="tableData"
                highlight-current-row
                style="width: 100%">
                <el-table-column
                    type="index"
                    width="100">
                </el-table-column>
                <el-table-column
                    property="name"
                    label="名称"
                    width="220">
                </el-table-column>
                <el-table-column
                    property="type"
                    label="类型"
                    width="220">
                </el-table-column>
                <el-table-column
                    property="getDate"
                    label="获取时间"
                    width="220"
                    >
                </el-table-column>
                <el-table-column
                    property="url"
                    label="网址"
                    >
                </el-table-column>
            </el-table>
            <div class="Pagination" style="text-align: left;margin-top: 10px;">
                <el-pagination
                    @size-change="handleCurrentChange"
                    @current-change="handleCurrentChange"
                    :current-page="currentPage"
                    :page-size="20"
                    layout="total, prev, pager, next"
                    :total="count"
                    ></el-pagination>
            </div>
        </div>
    </div>
</template>

<script>
    import headTop from "../components/headTop";
    import {getAllResource, getResourceByGetTime, getResourceByName, getResouceCount} from "../api/resourceApi";

    export default {
        data() {
            return {
                tableData: [],
                currentRow: null,
                offset: 0,
                limit: 20,
                count: 0,
                currentPage: 1,
            }
        },
        name: "resourceList",
        components: {
            headTop,
        },
        created() {

        },
        methods: {
            async initData() {
                try {
                    const countData = await getResouceCount();
                    if(count.status === 1) {
                        this.count = countData.countNum;
                    } else {
                        throw new Error("获取数据失败");
                    }
                } catch (err) {
                    console.log('获取数据失败', err);
                }
            },
            handleSizeChange() {

            },
            handleCurrentChange() {

            }
        }
    }
</script>

<style scoped>
    .table_container{
    padding: 20px;
    }
</style>
