# Agent Guide

## Mandatory checklist

Before completing any change:

- [ ] **Lint:** no lint tool is configured; manually review JavaScript/CSS.
- [ ] **Build:** `cd socops && ./mvnw clean package`
- [ ] **Test:** `cd socops && ./mvnw test`

## Scope

Soc Ops is a Spring Boot social bingo game. The app is in `socops/`; the root contains docs and workshops. Use Java 21, the Maven Wrapper, and port 8080.

```bash
cd socops
./mvnw spring-boot:run
./mvnw test
./mvnw clean package
```

## Architecture and conventions

- `com/socops/web/BingoRestController.java`: page and board endpoint; keep thin.
- `com/socops/service/BoardAssembler.java`: pure board creation, toggling, and win logic.
- `com/socops/model/`, `data/`: records, enums, and fixed prompts.
- `src/main/resources/templates/game.html`: Thymeleaf and browser JavaScript.
- `src/main/resources/static/css/app.css`: utility CSS; keep specificity low.
- `src/test/.../BoardAssemblerTests.java`: JUnit 5 domain-test pattern.

Keep `BoardAssembler.java` and `game.html` board/win rules synchronized. Preserve package boundaries, records, JUnit style, Spring-free domain logic, and existing browser styles. Follow the [CSS instructions](.github/instructions/css-utilities.instructions.md) and [frontend instructions](.github/instructions/frontend-design.instructions.md).

## Design guide

Soc Ops uses a warm, community-focused solarpunk visual language inspired by shared gardens, field notes, and clean solar energy. Future frontend work should preserve this direction:

- Use forest green, leafy green, solar yellow, paper cream, and terracotta as the core palette. Define reusable colors as CSS variables in `app.css`.
- Prefer editorial serif typography for expressive headings and monospace typography for labels, metadata, and game status. Avoid generic UI stacks and remote font dependencies.
- Build atmosphere with restrained CSS textures, patterns, borders, and natural geometric forms. Do not add purple gradients, generic glassmorphism, decorative blobs, or nested cards.
- Keep the experience focused on the bingo workflow: clear hierarchy, stable 5x5 tile dimensions, readable prompts, visible progress, and obvious selected/free/winning states.
- Preserve accessibility: maintain semantic labels and ARIA attributes, provide visible keyboard focus, ensure readable contrast, and support `prefers-reduced-motion`.
- Keep interactions lightweight and purposeful. CSS-only reveal, hover, active, and victory animations are preferred for this Thymeleaf page.
- Check desktop and narrow mobile layouts after template or CSS changes. Prompts must wrap without changing the board geometry or causing controls to overlap.

For template/CSS changes, inspect `http://localhost:8080` after the checklist. Use [README](README.md), [Portuguese README](README.pt_BR.md), and [workshop guide](workshop/GUIDE.md) for setup; do not duplicate them.
