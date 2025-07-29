# Copilot Instructions for conta-banco Java Project

## Project Overview
This is a simple Java console application for bank account operations. The main entry point is `src/BancoTerminal.java`. The project is structured for easy compilation and execution in VS Code.

## Folder Structure
- `src/` — Java source files (main logic in `BancoTerminal.java`)
- `lib/` — External dependencies (if any)
- `bin/` — Compiled `.class` files

## Build & Run Workflow
- **Compile:**
  - Use VS Code's Java extension or run:  
    `javac -d bin src/BancoTerminal.java`
- **Run:**
  - Execute with:  
    `java -cp bin BancoTerminal`
- No custom build scripts or test frameworks are present.

## Coding Patterns & Conventions
- All logic currently resides in a single class (`BancoTerminal`).
- Use `Scanner` for console input/output.
- Keep code simple and readable; follow standard Java conventions.
- If adding new features, place new classes in `src/` and update the main class as needed.

## External Dependencies
- Place any `.jar` files in `lib/` and add them to the classpath when compiling/running.

## Example: Adding a New Feature
- Create `src/NovaFuncionalidade.java` for new logic.
- Update `BancoTerminal.java` to use the new class.
- Recompile and run as above.

## Key Files
- `src/BancoTerminal.java` — Main application logic
- `README.md` — Project setup and folder structure

## Agent Guidance
- Focus on clear, minimal Java code.
- Document any new workflow or convention in this file for future agents.
- If introducing tests, document the test workflow here.

---
_Last updated: July 2025_
