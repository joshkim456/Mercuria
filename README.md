# Mercuria

A Minecraft Forge mod for Java Edition 1.18.2.

## About

Mercuria is a Minecraft mod built on the Forge modding framework. Currently in early development with a custom creative tab and placeholder item system.

## Tech Stack

| | |
|---|---|
| **Language** | Java 17 |
| **Minecraft** | 1.18.2 |
| **Mod Loader** | Minecraft Forge 40.1.0 |
| **Build System** | Gradle (ForgeGradle 5.1+) |
| **Mappings** | Official Mojang |

## Current Features

- Custom "Mercuria" creative mode tab
- Item registration system via Forge's `DeferredRegister`
- Example item (placeholder)

## Getting Started

### Prerequisites
- JDK 17
- An IDE with Gradle support (IntelliJ IDEA recommended)

### Setup
1. Clone the repo
2. Open the `Mercuria/` directory as a Gradle project
3. Run `./gradlew genIntellijRuns` (or `genEclipseRuns` for Eclipse)
4. Run the `runClient` Gradle task to launch Minecraft with the mod loaded

## Project Structure

```
src/main/
├── java/com/kimcheee/mercuria/
│   ├── Mercuria.java              Main mod class, creative tab registration
│   └── init/
│       └── ItemInit.java          Item registry (DeferredRegister)
└── resources/
    ├── META-INF/mods.toml         Mod metadata and dependencies
    └── assets/mercuria/
        ├── lang/en_us.json        English translations
        └── models/item/           Item model definitions
```

## License

All rights reserved.
