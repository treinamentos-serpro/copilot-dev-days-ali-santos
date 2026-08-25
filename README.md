🌐 [Português (BR)](README.pt_BR.md) | [Español](README.es.md)

<div align="center">

# 🎲 Soc Ops

**Social Bingo for in-person mixers — powered by VS Code Agent Mode & GitHub Copilot**

[🎮 Live Demo](https://copilot-dev-days.github.io/agent-lab-java/) · [📚 Lab Guide](workshop/GUIDE.md) · [🚀 Quick Start](#quick-start)

---

*Find people who match the prompts. Get 5 in a row. Win the room.*

</div>

---

## ✨ What is this?

Soc Ops is a **hands-on workshop project** built with Java 21 + Spring Boot. You'll use it as a playground to explore the full power of **VS Code Agent Mode** with GitHub Copilot — from context engineering to multi-agent TDD workflows.

> ⏱ **~1 hour** · 🎯 **Intermediate** · ☕ **Java 21 / Spring Boot 3.4.2**

---

## 🧠 What You'll Build & Learn

| # | Skill | What happens |
|---|-------|-------------|
| 🏗️ | **Context Engineering** | Teach the AI your codebase with workspace instructions |
| 🎨 | **Design-First Frontend** | Let agents iterate on UI while you steer the vision |
| 🎭 | **Custom Agents** | Build a Quiz Master agent that generates bingo themes |
| 🧪 | **Multi-Agent TDD** | Red → Green → Refactor with specialized TDD agents |

---

## 📚 Lab Guide

| Part | Title | Time |
|------|-------|------|
| [**00**](workshop/00-overview.md) | Overview & Checklist | — |
| [**01**](workshop/01-setup.md) | Setup & Context Engineering | 15 min |
| [**02**](workshop/02-design.md) | Design-First Frontend | 15 min |
| [**03**](workshop/03-quiz-master.md) | Custom Quiz Master | 10 min |
| [**04**](workshop/04-multi-agent.md) | Multi-Agent Development | 20 min |

> 📝 All guides are in [`workshop/`](workshop/) for offline reading.

---

## ✅ Prerequisites

- [Java 21 JDK](https://adoptium.net/) or higher
- [VS Code v1.107+](https://code.visualstudio.com/) with GitHub Copilot (Pro / Business / Enterprise)
- Git · [Apache Maven 3.9+](https://maven.apache.org/) (or use the bundled Maven Wrapper)

> 💡 **Tip:** Open in a [Dev Container](.devcontainer/) for a zero-setup environment.

---

## 🚀 Quick Start

```bash
# Run the app
cd socops && ./mvnw spring-boot:run
# → open http://localhost:8080
```

```bash
# Build
cd socops && ./mvnw clean package

# Test
cd socops && ./mvnw test
```

Pushes to `main` deploy automatically to GitHub Pages.
