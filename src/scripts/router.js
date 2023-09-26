import Home from "@/pages/Home.vue";
import Login from "@/pages/Login.vue";
import {createRouter, createWebHistory} from "vue-router";
import Cart from "@/pages/Cart";
import Order from "@/pages/Order.vue";

const routes = [
    {path: '/', component: Home},
    {path: '/login', component: Login},
    {path: '/cart', component: Cart},
    {path: '/order', component: Order}
]

const router = createRouter({
    history: createWebHistory(), routes: routes
})

export default router;