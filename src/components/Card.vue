<template>
  <div class="card shadow-sm">
    <span class="img" :style="{backgroundImage: `url(${item.imgPath})`}"/>
    <!--    <img :src="item.imgPath">-->
    <div class="card-body">
      <p class="card-text">
        <span>{{ item.name }} &nbsp;</span>
        <small class="discount badge bg-danger">
          {{ item.discountPer }}%
        </small>
      </p>

      <div class="d-flex justify-content-between align-items-center">
        <button class="btn btn-primary" @click="addToCart(item.id)">구입하기</button>
        <small class="price text-muted">
          {{ lib.getNumberFormatted(item.price) }}원
        </small>

        <small class="real text-danger">
          {{ lib.getNumberFormatted(item.price - (item.price * item.discountPer / 100)) }}원
        </small>
      </div>
    </div>
  </div>

</template>

<script>
import lib from "@/scripts/lib";
import axios from "axios";

export default {
  name: "Card",
  props: {
    item: Object
  },
  setup() {
    const addToCart = (itemId) => {
      axios.post(`/api/cart/${itemId}`).then(() => {
        console.log('success');
      })
    }

    return {lib, addToCart }
  }
}
</script>

<style scoped>
.card .img {
  width: 100%;
  display: inline-block;
  height: 300px;
  background-size: cover;
  background-position: center;
}

.card .card-body .price {
  text-decoration: line-through;
}
</style>