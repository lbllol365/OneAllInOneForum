<template>
    <div class="resourceStats">
        <div id="typePie" class="" style="width: 50%;height: 450px"></div>
        <div id="dailyChangeLine" class="" style="width: 50%;height: 450px"></div>
    </div>
</template>

<script>
import echarts from 'echarts/lib/echarts'

export default {
    mounted() {
        this.typePie = echarts.init(document.getElementById("typePie"));
        this.dailyChangeLine = echarts.init(document.getElementById("dailyChangeLine"));
        this.initData();
    },
    props: ['typePieData', 'dailyChangeLineData'],
    methods: {
      initData() {
          this.initTypePie();
          this.initDailyChangeLine();
      },
      initTypePie() {
          const typePoeOption = {
              title: {
                  text: '种类分布',
                  subtext: '',
                  x: 'center'
              },
              tooltip: {
                  trigger: 'item',
                  formatter: "{a} <br/>{b} : {c} ({d}%)"
              },
              legend: {
                  orient: 'vertical',
                  left: 'left',
                  data: this.typePieData.dataLegend
              },
              series: [
                  {
                      name: '资源类型',
                      type: 'pie',
                      radius: '55%',
                      center: ['50%', '60%'],
                      data: [],
                      itemStyle: {
                          emphasis: {
                              shadowBlur: 10,
                              shadowOffsetX: 0,
                              shadowColor: 'rgba(0, 0, 0, 0.5)'
                          }
                      }
                  }
              ]
          }
          this.typePie.setOption(typePoeOption);
      },
      initDailyChangeLine() {
          const dailyChangeLineOption = {
              title: {
                  text: '每日获取资源数变化',
                  subtext: '',
                  x: 'center'
              }
          }
          this.dailyChangeLine.setOption(dailyChangeLineOption);
      }
    },
    watch: {
      typePieData: function () {
          this.initTypePie();
      },
      dailyChangeLineData : function () {
          this.initDailyChangeLine();
      }
    },
    name: "resourceStats"
}
</script>

<style scoped>

</style>
