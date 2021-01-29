<template>
  <div class="mainContainer">
    <el-table :data="tableData">
      <el-table-column
        prop="name"
        label="资源名称"
        >
      </el-table-column>
      <el-table-column
        prop="url"
        label="资源链接"
        >
      </el-table-column>
      <el-table-column
        prop="tag"
        label="资源分类"
        :filters="filtersData"
        :filter-method="tagFilter"
        >
        <template slot-scope="scope">
          <el-tag disable-transitions>
            {{scope.row.tag}}
          </el-tag>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
name: "Resources",
  data() {
    return {
      tableData: [{name: "test", url: "http://www.baidu.com", tag: "网站"}],
      filtersData: []
    }
  },
  methods: {
    tagFilter(value, row) {
      return row.tag === value;
    },
    getFilterData() {

    },
    getTableData() {

    }
  }


}
</script>

<style scoped>

</style>
