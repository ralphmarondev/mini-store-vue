# 🛍️ Mini Store

**Mini Store** is a minimalist, responsive e-commerce front-end built with **Vue 3**, **TypeScript**, and **Tailwind CSS**, using **Pinia** for state management.  
It connects seamlessly to a **Spring Boot (Kotlin)** backend with **JWT authentication** and full CRUD capabilities for products, orders, and user management.

![License](https://img.shields.io/badge/license-MIT-purple)
![Frontend](https://img.shields.io/badge/frontend-Vue%203-blue)
![Styling](https://img.shields.io/badge/styling-TailwindCSS-38bdf8)
![State](https://img.shields.io/badge/state--management-Pinia-f59e0b)
![TypeScript](https://img.shields.io/badge/language-TypeScript-3178c6)
![Package Manager](https://img.shields.io/badge/package%20manager-NPM-red)

---

## 🔗 Repository

GitHub: [https://github.com/ralphmarondev/mini-store](https://github.com/ralphmarondev/mini-store)

---

## ✨ Features

* 🔐 JWT-based login & registration
* 🛍️ Product catalog with detail view
* 🧺 Add to cart & quantity management
* 📦 Checkout & order summary
* 📜 Order history with status
* ⚙️ Admin dashboard to manage inventory
* 🌗 Dark/light mode toggle
* 📱 Fully responsive layout

---

## 🧱 Tech Stack

| Tool/Library    | Purpose                        |
|----------------|--------------------------------|
| Vue 3           | Core framework                 |
| TypeScript      | Type safety and DX             |
| Tailwind CSS    | Utility-first styling          |
| Pinia           | State management               |
| Vue Router      | Client-side routing            |
| Axios           | API calls                      |
| Vite            | Fast dev environment           |

---

## 🗂️ Folder Structure

```

src/
├── assets/          # Static files (images, icons)
├── components/      # Reusable UI components
├── views/           # Route-based views (Home, Login, Register, etc.)
├── stores/          # Pinia stores
├── services/        # Axios-based API calls
├── types/           # Global TypeScript interfaces
├── App.vue
├── main.ts
└── index.css

````

---

## ⚙️ Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/ralphmarondev/mini-store.git
cd mini-store
````

### 2. Install dependencies

```bash
npm install
```

### 3. Start the development server

```bash
npm run dev
```

> Visit: `http://localhost:5173`

---

## 🔑 Environment Variables

Create a `.env` file at the root and add:

```
VITE_API_URL=http://localhost:8080/api
```

> Replace the URL with your actual Spring Boot backend address.

---

## 🧠 Notes from the Author

Built from the ground up without templates or generators.
Everything—from folder architecture to API integration—was crafted with the intention of learning, exploring, and shipping a real-world, scalable e-commerce solution.

---

## 🔧 Planned Enhancements

* [ ] Product filters & search
* [ ] Product image upload
* [ ] Payment gateway integration
* [ ] Responsive charts in admin panel
* [ ] Unit & e2e tests (Vitest + Cypress)

---

## 📄 License

This project is licensed under the **MIT License**.
See the [LICENSE](LICENSE.txt) file for details.

---

## 👤 Author

**Ralph Maron Eda**
GitHub: [@ralphmarondev](https://github.com/ralphmarondev)

---

## 🤝 Contributing

Contributions are always welcome!
Feel free to fork the repo, submit issues, or open pull requests.

Let’s build something awesome. 💜
