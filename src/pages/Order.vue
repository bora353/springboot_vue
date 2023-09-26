<template>
  <div class="cart">
    <div class="container">
      구입페이지
    </div>
  </div>
</template>

<script>
import {reactive} from "vue";
import axios from "axios";
import lib from "@/scripts/lib";

export default {
  setup() {
    const state = reactive({
      items:[]
    })


    const load = () => {
      axios.get('/api/cart/items').then(({data}) => {
        console.log(data);
        state.items = data;
      });

    }



    load();

    return {state, lib}
  }
}
</script>

<style scoped>

</style>