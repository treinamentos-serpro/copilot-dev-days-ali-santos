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

For template/CSS changes, inspect `http://localhost:8080` after the checklist. Use [README](README.md), [Portuguese README](README.pt_BR.md), and [workshop guide](workshop/GUIDE.md) for setup; do not duplicate them.
