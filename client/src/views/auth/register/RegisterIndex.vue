<script setup lang="ts">
import { ref } from "vue"

const fullName = ref('')
const email = ref('')
const password = ref('')

const login = () => {
	console.log(`Full name: ${fullName.value}, email: ${email.value}, password: ${password.value}`)
}

</script>

<template>
	<section class="bg-pink-50 h-screen flex items-center justify-center">
		<form @submit.prevent="login" class="bg-white p-8 rounded-2xl shadow-2xl shadow-pink-300 min-w-[400px]">
			<h3 class="text-3xl text-pink-600 mb-1">REGISTER</h3>
			<p class="mb-5 text-gray-500">Please fill in all fields. It won't take long.</p>

			<div class="flex flex-col mb-3">
				<label class="text-sm mb-1 text-gray-600">Full name:</label>
				<input type="text" class="border border-pink-300 rounded-sm py-2 px-4 text-gray-600" placeholder="Kate Ann"
					v-model="fullName">
			</div>
			<div class="flex flex-col mb-3">
				<label class="text-sm mb-1 text-gray-600">Email:</label>
				<input type="email" class="border border-pink-300 rounded-sm py-2 px-4 text-gray-600"
					placeholder="kate@gmail.com" v-model="email">
			</div>
			<div class="flex flex-col mb-9">
				<label class="text-sm mb-1 text-gray-600">Password:</label>
				<input type="password" class="border border-pink-300 rounded-sm py-2 px-4 text-gray-600" placeholder="ralph123"
					v-model="password">
			</div>
			<button type="submit"
				class="w-full bg-pink-600 hover:bg-pink-700 text-pink-50 py-2 rounded-sm cursor-pointer">REGISTER</button>
		</form>
	</section>
</template>