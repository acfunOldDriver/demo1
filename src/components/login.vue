<template>
  <div>
    <h1>{{ msg }}</h1>
    <button @click="changeMsg">改变msg</button>
    <el-row>
      <el-button disabled>点我</el-button>
      <el-button type="primary">按钮1</el-button>
      <el-button type="success">按钮2</el-button>
      <el-button type="info">按钮3</el-button>
      <el-button type="warning">按钮4</el-button>
    </el-row>
    <el-row>
      <el-button disabled>点我</el-button>
      <el-button type="primary">按钮1</el-button>
      <el-button type="success">按钮2</el-button>
      <el-button type="info">按钮3</el-button>
      <el-button type="warning">按钮4</el-button>
    </el-row>
  </div>
</template>

<script>
export default {
  name: "login",
  data(){
    return {
      msg:'aa'
    }
  },
  methods: {
    changeMsg:function () {
      this.msg = Math.random()
      this.$axios.get("/hello").then(res =>{
        console.log(res)
      })
    }
  }
}
</script>

<style scoped>

</style>
